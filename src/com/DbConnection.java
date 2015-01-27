/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author VijayShankar
 */
public class DbConnection {

    /**
     * @return
     */
    public Connection getConnection() {
        Connection conn = null;
        //getProperties();
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "vijay");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
