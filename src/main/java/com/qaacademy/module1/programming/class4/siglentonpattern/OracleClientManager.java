package com.qaacademy.module1.programming.class4.siglentonpattern;

import com.qaacademy.module1.programming.class4.builderparttern.DataBaseConnection;

public class OracleClientManager {
    private static OracleClientManager instance = null;

    private final DataBaseConnection dataBaseConnection;

    private OracleClientManager(DataBaseConnection dataBaseConnection) {
        this.dataBaseConnection = dataBaseConnection;
    }

    public static OracleClientManager getInstance(DataBaseConnection dataBaseConnection) {
        if (instance == null) {
            instance = new OracleClientManager(dataBaseConnection);
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connecting to Oracle");
        System.out.println(getConnectionString());
    }

    private String getConnectionString() {
        return String.format("dbc:oracle:thin:%s/%s@%s:%s/%s",
                dataBaseConnection.getUsername(),
                dataBaseConnection.getPassword(),
                dataBaseConnection.getHostname(),
                dataBaseConnection.getPort(),
                dataBaseConnection.getDbName());
    }
}
