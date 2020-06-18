package com.company;

public abstract class DataType {
    private String typeName;

    public DataType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName(){
        return this.typeName;
    }
}
