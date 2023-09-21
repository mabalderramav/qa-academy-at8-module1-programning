package com.qaacademy.module1.programming.class4.siglentonpattern;

import com.qaacademy.module1.programming.class4.builderparttern.DataBaseConnection;

public class MongoClientManger {
    private static MongoClientManger instance = null;

    private final DataBaseConnection dataBaseConnection;

    private MongoClientManger(DataBaseConnection dataBaseConnection) {
        this.dataBaseConnection = dataBaseConnection;
    }

    public static MongoClientManger getInstance(DataBaseConnection dataBaseConnection) {
        if (instance == null) {
            instance = new MongoClientManger(dataBaseConnection);
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connecting to MongoDb");
        System.out.println(getConnectionString());
    }

    private String getConnectionString() {
        return String.format("mongodb://%s:%s@%s:%s/%s?readPreference=primary&tls=true&authSource=%s",
                dataBaseConnection.getUsername(),
                dataBaseConnection.getPassword(),
                dataBaseConnection.getHostname(),
                dataBaseConnection.getPort(),
                dataBaseConnection.getDbName(),
                dataBaseConnection.getAuthenticationType());
    }
}
