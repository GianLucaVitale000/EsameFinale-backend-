package com.heartwoodlabs.esame.rs;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Provider
public class JacksonConfiguration implements ContextResolver<ObjectMapper> {

    @Override
    public ObjectMapper getContext(Class<?> type) {
        ObjectMapper res = new ObjectMapper();

        // res.registerModule(new JavaTimeModule());

        SimpleModule sm = new SimpleModule("ModuloDate");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        sm.addSerializer(new LocalDateTimeSerializer(formatter));
        sm.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(formatter));

        res.registerModule(sm);

        res.configure(SerializationFeature.INDENT_OUTPUT, true);
        res.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        res.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);

        return res;
    }
}
