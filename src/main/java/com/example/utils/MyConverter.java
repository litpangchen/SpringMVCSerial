package com.example.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lucaschen on 18/05/2017.
 */
public class MyConverter implements Converter<String, Date> {

    private String datePattern;

    public MyConverter(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public Date convert(String s) {

        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat(datePattern);

        simpleDateFormat.setLenient(false);
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format!");
        }
    }
}
