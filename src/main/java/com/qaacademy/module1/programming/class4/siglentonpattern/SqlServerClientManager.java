package com.qaacademy.module1.programming.class4.siglentonpattern;

import com.qaacademy.module1.programming.class4.builderparttern.DataBaseConnection;

public class SqlServerClientManager {
    private static SqlServerClientManager instance = null;

    private final DataBaseConnection dataBaseConnection;

    private SqlServerClientManager(DataBaseConnection dataBaseConnection) {
        this.dataBaseConnection = dataBaseConnection;
    }

    public static SqlServerClientManager getInstance(DataBaseConnection dataBaseConnection) {
        if (instance == null) {
            instance = new SqlServerClientManager(dataBaseConnection);
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connecting to SqlServer");
        System.out.println(getConnectionString());
    }

    private String getConnectionString() {
        return  String.format("sqlServer: data source//%s:%s@%s:%s/%s?readPreference=primary&tls=true&authSource=%s",
                dataBaseConnection.getUsername(),
                dataBaseConnection.getPassword(),
                dataBaseConnection.getHostname(),
                dataBaseConnection.getPort(),
                dataBaseConnection.getDbName(),
                dataBaseConnection.getAuthenticationType());
    }
}
