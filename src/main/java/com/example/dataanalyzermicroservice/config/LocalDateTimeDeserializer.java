package com.example.dataanalyzermicroservice.config;

import com.google.gson.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class LocalDateTimeDeserializer implements JsonDeserializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonArray array = jsonElement.getAsJsonArray();
        int year = array.get(0).getAsInt();
        int month = array.get(1).getAsInt();
        int day = array.get(2).getAsInt();
        int hours = array.get(3).getAsInt();
        int minutes = array.get(4).getAsInt();
        int seconds = array.get(5).getAsInt();

        return LocalDateTime.of(year, month, day, hours, minutes, seconds);
    }

}
