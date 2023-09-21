package com.qaacademy.module1.programming.class4.siglentonpattern;

import com.qaacademy.module1.programming.class4.builderparttern.DataBaseConnection;

public class MySqlClientManager {
    private static MySqlClientManager instance = null;

    private final DataBaseConnection dataBaseConnection;

    private MySqlClientManager(DataBaseConnection dataBaseConnection) {
        this.dataBaseConnection = dataBaseConnection;
    }

    public static MySqlClientManager getInstance(DataBaseConnection dataBaseConnection) {
        if (instance == null) {
            instance = new MySqlClientManager(dataBaseConnection);
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connecting to MySql");
        System.out.println(getConnectionString());
    }

    private String getConnectionString() {
        return String.format("jdbc:mysql://%s/%s&user=%s&password=%s",
                dataBaseConnection.getHostname(),
                dataBaseConnection.getDbName(),
                dataBaseConnection.getUsername(),
                dataBaseConnection.getPassword());
    }
}
