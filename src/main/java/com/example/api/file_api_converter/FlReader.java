package com.example.api.file_api_converter;

import org.springframework.stereotype.Service;

import java.io.*;
public class FlReader {
    private String content = "";
    public String returnFileContent() {
        File file = new File("C:\\Users\\mysel\\Downloads\\api\\" +
                "src\\main\\java\\com\\example\\api\\repository\\jsonText.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;

            while(true)
            {
                try {
                    if (!((st = br.readLine()) != null)) break;

                    content += st;

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return content;
    }
}
