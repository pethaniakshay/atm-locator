package com.xyz.camel;

import org.apache.camel.*;

import java.util.LinkedHashMap;

public class MyOrderTypeConverters implements TypeConverter {
    @Converter
    public String toMyOrder(Object any) {
        return any.toString();
    }

    @Override
    public boolean allowNull() {
        return false;
    }

    @Override
    public <T> T convertTo(Class<T> type, Object value) throws TypeConversionException {
        return null;
    }

    @Override
    public <T> T convertTo(Class<T> type, Exchange exchange, Object value) throws TypeConversionException {
        return null;
    }

    @Override
    public <T> T mandatoryConvertTo(Class<T> type, Object value) throws TypeConversionException, NoTypeConversionAvailableException {
        return null;
    }

    @Override
    public <T> T mandatoryConvertTo(Class<T> type, Exchange exchange, Object value) throws TypeConversionException, NoTypeConversionAvailableException {
        return null;
    }

    @Override
    public <T> T tryConvertTo(Class<T> type, Object value) {
        return null;
    }

    @Override
    public <T> T tryConvertTo(Class<T> type, Exchange exchange, Object value) {
        return null;
    }
}