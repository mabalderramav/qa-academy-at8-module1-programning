package com.qaacademy.module1.programming.class4.builderparttern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection.DataBaseConnectionBuilder(
                "username",
                "password",
                "dbName",
                "hostname")
                .setPort("3396")
                .setAuthenticationType(AuthenticationType.LDAP)
                .Build();

        System.out.println(dataBaseConnection.getUsername());
        System.out.println(dataBaseConnection.getPassword());
        System.out.println(dataBaseConnection.getDbName());
        System.out.println(dataBaseConnection.getHostname());
        System.out.println(dataBaseConnection.getPort());
        System.out.println(dataBaseConnection.getAuthenticationType().toString());

        DataBaseConnection dataBaseConnection1 = new DataBaseConnection.DataBaseConnectionBuilder(
                "username",
                "password",
                "dbName",
                "hostname")
                .setAuthenticationType(AuthenticationType.OAUTH)
                .Build();

        System.out.println(dataBaseConnection1.getUsername());
        System.out.println(dataBaseConnection1.getPassword());
        System.out.println(dataBaseConnection1.getDbName());
        System.out.println(dataBaseConnection1.getHostname());
        System.out.println(dataBaseConnection1.getAuthenticationType().toString());
    }
}
