package ru.nickopol;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        char [] java = new char[] {'J', 'a', 'v', 'a', '!'};
//        System.out.println("Элемент: " + java[2]);
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Номер элемента: " + i);
//        }

        int test_duration = 2640;
        int delay = 240;
        int script_time = 1200;
        int script_duration = test_duration - (delay + (test_duration-delay)%script_time);
        System.out.println(script_duration);


//        int f = a-b;
//        System.out.println(f);
//        int q = f%c;
//        System.out.println(q);
//
//        //System.out.println(((1800-240)/1200)*1200);
//        System.out.println();

    }
}
