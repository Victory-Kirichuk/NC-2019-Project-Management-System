package com.netcracker.victory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateSerializer extends JsonSerializer<Date> {
    public static final String DATE_FORMAT = "dd-MM-yyyy";

    public DateSerializer() {
    }

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        jsonGenerator.writeString(dateFormat.format(date));
    }
}
