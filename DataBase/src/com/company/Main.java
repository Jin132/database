package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	DataBase dataBase = new DataBase("JinCompany");
	Table employee = new Table("Сотрудники");
    employee.addColumn("Имя", new TextType("varchar2",50));
    employee.addColumn("Фамилия", new TextType("varchar2",50));
    employee.addEntry("Илья", "Саскевич");
    employee.addEntry("Денис", "Нарутович");
    dataBase.AddTable(employee);
    dataBase.showDB();
    dataBase.showDB("C:\\Users\\Jin\\Desktop\\DataBase\\Db.txt"); //
    }
}
