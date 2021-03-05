package ru.nickopol.HW4;

import java.sql.*;

public class DB {

    private final String HOST = "localhost";
    private final String PORT = "8889";
    private final String DB_NAME = "itProger";
    private final String LOGIN = "root";
    private final String PASS = "root";

    private Connection dbConn = null;

    private Connection getDbConn() throws ClassNotFoundException, SQLException {
        String connStr = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME;
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConn = DriverManager.getConnection(connStr, LOGIN, PASS);
        return dbConn;
    }

    public void isConnected() throws SQLException, ClassNotFoundException {
        dbConn = getDbConn();
        System.out.println(dbConn.isValid(1000));
    }

    public void getUsersInfo(String userName) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM users WHERE login = '" + userName + "'";

        Statement statement = getDbConn().createStatement();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()) {
            System.out.print("id: " + result.getString("id"));
            System.out.println(", user: " + userName + ", pass: " + result.getString("pass"));
        }
    }

    public void getItemsInfo(String category) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM `items` WHERE category LIKE '%" + category + "%'";
        Statement statement = getDbConn().createStatement();
        ResultSet result = statement.executeQuery(sql);
        System.out.println("id\tcategory\tprice\ttitle");
        while (result.next()) {
            System.out.println(result.getString("id")
                    + "\t" + result.getString("category")
                    + "\t\t" + result.getString("price")
                    + "\t\t" + result.getString("title")
            );
        }
    }

    public void getOrdersInfo(String userLogin) throws SQLException, ClassNotFoundException {
        String sql = "SELECT CONCAT(users.login, ' - ', items.title) AS 'Все заказы:' FROM `orders` \n" +
                "JOIN `users` ON users.id=orders.user_id\n" +
                "JOIN `items` ON items.id=orders.item_id \n" +
                "WHERE users.login='" + userLogin + "';";
        Statement statement = getDbConn().createStatement();
        ResultSet result = statement.executeQuery(sql);
        System.out.println("Все заказы\n");
        while (result.next()) {
            System.out.println(result.getString("Все заказы:"));
        }
    }
}