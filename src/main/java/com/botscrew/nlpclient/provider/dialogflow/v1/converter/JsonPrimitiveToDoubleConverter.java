package com.botscrew.nlpclient.provider.dialogflow.v1.converter;

import com.botscrew.botframework.domain.argument.ArgumentType;
import com.botscrew.botframework.domain.converter.ArgumentConverter;
import com.botscrew.botframework.domain.converter.ConverterKey;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class JsonPrimitiveToDoubleConverter implements ArgumentConverter<JsonPrimitive> {
    private static final ConverterKey KEY = ConverterKey.of(JsonPrimitive.class, ArgumentType.PARAM_DOUBLE);

    @Override
    public ConverterKey getKey() {
        return KEY;
    }

    @Override
    public Object convert(JsonPrimitive jsonElement, Class<?> originalType) {
        return jsonElement.getAsDouble();
    }
}