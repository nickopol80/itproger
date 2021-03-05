package ru.nickopol.HW4;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DB db = new DB();
        //db.isConnected();

        System.out.println("Task1:");
        db.getUsersInfo("john");

        System.out.println("\nTask2:");
        db.getItemsInfo("hats");

        System.out.println("\nTask3:");
        db.getOrdersInfo("john");
    }

}
