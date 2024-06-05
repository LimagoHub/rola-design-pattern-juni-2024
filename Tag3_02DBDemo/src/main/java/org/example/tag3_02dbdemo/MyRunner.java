package org.example.tag3_02dbdemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class MyRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

      Table table = new Table("SELECT * from TBL_PERSONEN");
        for (int i = 0; i < table.getColumnCount(); i++) {
            System.out.printf("%-30s", table.getColumnName(i));
        }
        System.out.println();

        while (table.next()) {
            for (int i = 0; i < table.getColumnCount(); i++) {
                System.out.printf("%-30s", table.getColumn(i));
            }
            System.out.println();

        }
    }
}
