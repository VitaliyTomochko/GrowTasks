package com.tasks1.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        strPyramidFormat(str);
    }

    public static void strPyramidFormat(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println(str.charAt(i));
        }


    }
}
