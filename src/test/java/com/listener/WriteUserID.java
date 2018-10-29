package com.listener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUserID {
    public void appendFile(String path,String data) {
        try {
            File file = new File(path);
            //if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWritter = new FileWriter(file,true);
            fileWritter.write(data);
            fileWritter.flush();
            fileWritter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
