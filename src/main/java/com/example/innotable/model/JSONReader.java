package com.example.innotable.model;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.tomcat.util.json.JSONParser;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

public class JSONReader {

    public Object read(String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File(fileName);
            Event event = objectMapper.readValue(jsonFile, Event.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
