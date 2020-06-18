package com.company;

import java.util.ArrayList;

public class Entry {
    private ArrayList<Column> columns = new ArrayList<>();
    private String[] data;
    public Entry(ArrayList<Column> columns, String...data) throws Exception {
        if (!(columns.size() == data.length))
            throw new Exception("Слишком много или мало данных");
        this.columns = columns;
        this.data = data;
    }

    public String[] getData() {
        return data;
    }
}
