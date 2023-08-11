package com.Andriod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Database database = Database.getInstance("db_music");
//        Database testDatabase = new Database("db_movies");

        database.blue();
        System.out.println(database.toString());
    }
}
