package com.xyz.camel;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyz.dto.AtmLocationDto;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.json);

        rest("/student").produces("application/json")
                //.get("/custom").to("direct:records")
                .get("/original").to("direct:original");

        from("direct:original")
                .setHeader(Exchange.HTTP_METHOD, constant("GET"))
                .to("https://www.ing.nl/api/locator/atms/?httpMethod=GET&?bridgeEndpoint=true")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {

                        String responseString = exchange.getIn().getBody(String.class);
                        responseString = responseString.substring(6);
                        ObjectMapper mapper = new ObjectMapper();
                        List<AtmLocationDto> atmLocationList = Arrays.asList(mapper.readValue(responseString, AtmLocationDto[].class));
                        System.out.println("Total Size:" + atmLocationList.size());
                        exchange.getIn().setBody(atmLocationList);
                    }
                });
    }


}