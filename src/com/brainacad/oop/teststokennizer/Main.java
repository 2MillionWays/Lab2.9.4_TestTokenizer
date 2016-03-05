package com.brainacad.oop.teststokennizer;


import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myStr;

        myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";

        StringTokenizer s1 = new StringTokenizer(myStr, " ,.");
        while (s1.hasMoreElements()){
            System.out.println(s1.nextElement());
        }

    }
}
