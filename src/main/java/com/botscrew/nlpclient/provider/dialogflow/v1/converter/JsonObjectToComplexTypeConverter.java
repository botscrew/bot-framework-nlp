package com.botscrew.nlpclient.provider.dialogflow.v1.converter;

import com.botscrew.botframework.domain.converter.ArgumentConverter;
import com.botscrew.botframework.domain.converter.ConverterKey;
import com.botscrew.botframework.model.ArgumentType;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonObjectToComplexTypeConverter implements ArgumentConverter<JsonObject> {
    private static final ConverterKey KEY = ConverterKey.of(JsonObject.class, ArgumentType.COMPLEX_TYPE);
    private static final Gson GSON = new Gson();

    @Override
    public ConverterKey getKey() {
        return KEY;
    }

    @Override
    public Object convert(JsonObject jsonObject, Class<?> originalType) {
        return GSON.fromJson(jsonObject, originalType);
    }
}
