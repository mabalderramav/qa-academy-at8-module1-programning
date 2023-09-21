package com.qaacademy.module1.programming.class4.builderparttern;

public class DataBaseConnection {
    private final String username;

    private final String password;

    private final String dbName;

    private final String hostname;

    private final String port;

    private final AuthenticationType authenticationType;

    private DataBaseConnection(DataBaseConnectionBuilder dataBaseConnectionBuilder) {
        username = dataBaseConnectionBuilder.username;
        password = dataBaseConnectionBuilder.password;
        dbName = dataBaseConnectionBuilder.dbName;
        hostname = dataBaseConnectionBuilder.hostname;
        port = dataBaseConnectionBuilder.port;
        authenticationType = dataBaseConnectionBuilder.authenticationType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDbName() {
        return dbName;
    }

    public String getHostname() {
        return hostname;
    }

    public String getPort() {
        return port;
    }

    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    public static class DataBaseConnectionBuilder {
        private final String username;

        private final String password;

        private final String dbName;

        private final String hostname;

        private String port;

        private AuthenticationType authenticationType;

        public DataBaseConnectionBuilder(final String username,
                                         final String password,
                                         final String dbName,
                                         final String hostname) {
            this.username = username;
            this.password = password;
            this.dbName = dbName;
            this.hostname = hostname;
        }

        public DataBaseConnectionBuilder setPort(final String port) {
            this.port = port;
            return this;
        }

        public DataBaseConnectionBuilder setAuthenticationType(final AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public DataBaseConnection Build() {
            return new DataBaseConnection(this);
        }
    }
}
