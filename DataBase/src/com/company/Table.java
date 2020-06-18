package com.company;

import java.util.ArrayList;

public class Table {
    private String tableName;
    private ArrayList<Column> columns = new ArrayList<>();
    private ArrayList<Entry> entries = new ArrayList<>();

    public Table(String tableName) {
        this.tableName = tableName;
    }

    public void addColumn(String name, DataType dataType){
        columns.add(new Column(name, dataType));
    }

    public void dropColumn(String name){
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).getColumnName() == name)
                columns.remove(i);
        }
    }

    public void dropAllColumns() {
        for (int i = 0; i < columns.size(); i++) {
            columns.remove(i);
        }
    }

    public void addEntry(String...data) throws Exception {
        entries.add(new Entry(columns, data));
    }

    public void dropEntry(String name){
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).getColumnName() == name)
                columns.remove(i);
        }
    }

    public void dropAllEntries() {
        for (int i = 0; i < entries.size(); i++) {
            entries.remove(i);
        }
    }

    public ArrayList<Column> getColumns(){
        return columns;
    }

    public String getTableName() {
        return tableName;
    }

    public ArrayList<Entry> getEntries() {
        return entries;
    }
}
