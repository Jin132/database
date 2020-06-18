package com.company;

public class Column {
    private String columnName;
    private DataType dataType;

    public Column(String columnName, DataType dataType){
        this.columnName = columnName;
        this.dataType = dataType;
    }

    public String getColumnName() {
        return columnName;
    }

    public DataType getDataType(){
        return dataType;
    }
}
