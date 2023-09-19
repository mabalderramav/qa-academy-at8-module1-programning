package com.qaacademy.module1.programming.class4.builderparttern;

public class DataBaseConnection {
    private final String username;

    private final String password;

    private final String dbName;

    private final String hostname;

    private final String port;

    private final AuthenticationType authenticationType;

    private DataBaseConnection(DataBaseConnection dataBaseConnectionBuilder){
        username = dataBaseConnectionBuilder.username;
        password = dataBaseConnectionBuilder.password;
        dbName = dataBaseConnectionBuilder.dbName;
        hostname = dataBaseConnectionBuilder.hostname;
        port = dataBaseConnectionBuilder.port;
        authenticationType = dataBaseConnectionBuilder.authenticationType;
    }
}
