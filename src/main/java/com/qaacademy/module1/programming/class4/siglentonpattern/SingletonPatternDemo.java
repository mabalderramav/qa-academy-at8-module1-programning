package com.qaacademy.module1.programming.class4.siglentonpattern;

import com.qaacademy.module1.programming.class4.builderparttern.AuthenticationType;
import com.qaacademy.module1.programming.class4.builderparttern.DataBaseConnection;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // MongoDb
        DataBaseConnection mongoDbDatabaseConnection = new DataBaseConnection.DataBaseConnectionBuilder(
                "username",
                "passwrod",
                "dbName",
                "hostname")
                .setPort("3306")
                .setAuthenticationType(AuthenticationType.LDAP)
                .Build();

        MongoClientManger mongoClientManger = MongoClientManger.getInstance(mongoDbDatabaseConnection);
        mongoClientManger.connect();

        MongoClientManger mongoClientManger1 = MongoClientManger.getInstance(mongoDbDatabaseConnection);
        mongoClientManger1.connect();

        System.out.println(mongoClientManger.hashCode());
        System.out.println(mongoClientManger1.hashCode());

        DataBaseConnection mongoDbDatabaseConnection1 = new DataBaseConnection.DataBaseConnectionBuilder(
                "username",
                "passwrod",
                "dbName",
                "hostname")
                .setPort("3306")
                .setAuthenticationType(AuthenticationType.LDAP)
                .Build();

        System.out.println(mongoDbDatabaseConnection.hashCode());
        System.out.println(mongoDbDatabaseConnection1.hashCode());

        // MySql
        DataBaseConnection mySqlDatabaseConnection = new DataBaseConnection.DataBaseConnectionBuilder(
                "username",
                "password",
                "dbName",
                "hostname")
                .Build();

        MySqlClientManager mySqlClientManager = MySqlClientManager.getInstance(mySqlDatabaseConnection);
        mySqlClientManager.connect();

        // Oracle
        DataBaseConnection oracleDatabaseConnection = new DataBaseConnection.DataBaseConnectionBuilder(
                "username",
                "password",
                "dbName",
                "hostname")
                .setPort("5986")
                .Build();

        OracleClientManager oracleClientManager = OracleClientManager.getInstance(oracleDatabaseConnection);
        oracleClientManager.connect();
    }
}
