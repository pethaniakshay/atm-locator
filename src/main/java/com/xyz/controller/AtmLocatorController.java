package com.xyz.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyz.dto.AtmLocationDto;
import com.xyz.service.AtmLocatorService;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.spi.Synchronization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/v1/locator/atm")
public class AtmLocatorController {

    private final AtmLocatorService atmLocatorService;

    /*@Autowired
    ProducerTemplate producerTemplate;*/

    AtmLocatorController(AtmLocatorService atmLocatorService) {
        this.atmLocatorService = atmLocatorService;
    }

    /*@GetMapping
    public String locateAtms() {
        return atmLocatorService.locateAtms();
    }*/

    @RequestMapping(value = "")
    public void startCamel() throws ExecutionException, InterruptedException {

        //producerTemplate.sendBody("direct:firstRoute", "");

    }
}



