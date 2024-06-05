package org.example.tag3_02dbdemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class MyRunner implements CommandLineRunner {

    private static final String CONNECTION_STRING = "jdbc:h2:c:/tmp/rola" ;

    @Override
    public void run(String... args) throws Exception {
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING, "sa", "")){
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery("select * from ROLA.TBL_PERSONEN")){
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    for (int column = 1; column <= metaData.getColumnCount() ; column++) {
                        System.out.print(metaData.getColumnName(column) + "\t");
                    }
                    System.out.println();
                }
            }
        }

    }
}
