package com.Andriod;

public class Database {
    private String name;

    public static Database instance;

    public static synchronized Database getInstance(String name) {
        if (null == instance) {
            instance = new Database(name);
            return instance;
        }
        return instance;
    }

    private Database(String name) {
        this.name = name;
    }

    public void blue() {
        System.out.println(this.getName() + " is playing..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String className = "@Database class";
        return className;
    }
}
