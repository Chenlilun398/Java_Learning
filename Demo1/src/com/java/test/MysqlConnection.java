package com.java.test;

import java.sql.*;

/**
 * Created by viruser on 2018/9/8.
 */
public class MysqlConnection {
    public static void main(String[] args) {
        String data = "jdbc:mysql://172.20.207.119:3306/azkaban_test";

        try (
            Connection conn = DriverManager.getConnection(data,"qnateam","123456");
            Statement st = conn.createStatement()) {
            //Class.forName("org.apache.mysql.jdbc.ClientDriver");

            ResultSet rec = st.executeQuery("select id_demand from m_demand");
            while (rec.next()) {
                System.out.println("id_demend :\t" + rec.getString(1));
            }
            st.close();
        } catch (SQLException se) {
            System.out.println("Error1: " + se.getMessage());
        } catch (Exception e) {
            System.out.println("Error2: " +e.getMessage());
        }
    }
}
