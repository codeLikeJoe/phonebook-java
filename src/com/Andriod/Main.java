package com.Andriod;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
//        names.add("Fatima");
//        names.add("John");
//        names.add("Ama");
//        names.add("Anas");
//        System.out.println(names);

//        System.out.println("Enter 3 Names:");
//        Scanner scanner = new Scanner(System.in);
//        for(int i = 0;i < 2;i++){
//            System.out.print("Name: ");
//            names.add(scanner.nextLine());
//
//            System.out.print("Age: ");
//            ages.add(scanner.nextInt());
//            scanner.nextLine();
//        }
//        for(int i = 0;i < names.size();i++){
//            System.out.println(names.get(i)+"\t\t"+ages.get(i));
//        }
        ArrayList<personDetails> personDetails = new ArrayList<>();
        personDetails.add(new personDetails("Kelly", 23, 60.5));
        personDetails.add(new personDetails("Bismark", 20, 49.6));

        for (com.Andriod.personDetails s : personDetails) {
            System.out.println(s.getName() + "\t" + s.getAge());
        }

    }
}
