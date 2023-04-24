package com.example.api.file_api_converter;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class FlService {
    private final FlReader flReader;

    public FlService() {
        flReader = new FlReader();
    }

    public String convertStringToJsonObject() {
        Gson g = new Gson();

        String j = g.toJson(flReader.returnFileContent());

        return j;
    }
}
