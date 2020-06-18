package com.company;

import java.util.ArrayList;

public class ConsoleRepresenter implements IRepresenter {

    @Override
    public void RepresentDB(DataBase dataBase) {
        System.out.println(dataBase.getTextDB());
    }
}
