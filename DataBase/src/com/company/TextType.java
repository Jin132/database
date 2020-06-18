package com.company;

public class TextType extends DataType {
    private int size;

    public TextType(String typeName, int size) {
        super(typeName);
        this.size = size;
    }

}
