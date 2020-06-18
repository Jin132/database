package com.company;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileRepresenter implements IRepresenter {
    private String path;

    public FileRepresenter(String path) {
        this.path = path;
    }

    @Override
    public void RepresentDB(DataBase dataBase) {
        try(FileOutputStream fileOutputStream = new FileOutputStream(path);)
        {
            fileOutputStream.write(dataBase.getTextDB().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
