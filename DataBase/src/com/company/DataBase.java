package com.company;

import java.util.ArrayList;

public class DataBase {
    String dbName;
    private ArrayList<Table> tables = new ArrayList<Table>();
    ConsoleRepresenter consoleRepresenter = new ConsoleRepresenter();
    FileRepresenter fileRepresenter;

    public DataBase(String dbName){
        this.dbName = dbName;
    }

    public void AddTable(Table table){
        tables.add(table);
    }

    public void DropTable(String name){
        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i).getTableName() == name)
                tables.remove(i);
        }
    }

    public void DropAllTables() {
        for (int i = 0; i < tables.size(); i++) {
            tables.remove(i);
        }
    }

    public ArrayList<Table> GetTables(){
        return tables;
    }

    public String getDbName(){
        return dbName;
    }

    public String getTextDB(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("База:\n");
        stringBuilder.append(this.getDbName()+"\n");
        stringBuilder.append("    Таблицы:\n");
        for (Table table: this.GetTables()) {
            stringBuilder.append("    " + table.getTableName() + "\n");
            stringBuilder.append("        Колонки:\n");
            stringBuilder.append("        ");
            for (Column column: table.getColumns()){
                stringBuilder.append(column.getColumnName() + " ");
            }
            stringBuilder.append("\n");
            stringBuilder.append("            Записи:\n");
            for (Entry entry: table.getEntries()){
                stringBuilder.append("            ");
                for(String line: entry.getData()) {
                    stringBuilder.append(line + " ");
                }
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public void showDB(){
        consoleRepresenter.RepresentDB(this);
    }

    public void showDB(String path){
        fileRepresenter = new FileRepresenter(path);
        fileRepresenter.RepresentDB(this);
    }
}
