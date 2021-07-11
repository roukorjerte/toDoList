package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        Menu main = new Menu();

        do {
            main.mainScreen();

            Scanner input = new Scanner(System.in);
            a = input.nextInt();

            switch (a) {
                case 1:
                    main.viewList();

                    int b = input.nextInt();
                    if (b == 1) {
                        main.mainScreen();
                    } else if (b == 2) {
                        System.out.println("status have changed");
                    } else
                        System.out.println("its an error!");
                    break;

                case 2:
                    main.addTask();
                    int c = input.nextInt();
                    if (c == 1) {
                        System.out.println("one more added");
                    } else if (c == 2) {
                        main.finish();
                    } else
                        System.out.println("its an error!");
                    break;
            }
        }while (a != 3);

        main.finish();

    }
}
