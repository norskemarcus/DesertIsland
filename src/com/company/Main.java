package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private String[] item = {"1 kæreste", "2 kaffemaskine", "3 Netflix", "4 sofa", "5 løbesko",
        "6 guitar", "7 slik", "8 hund", "9 bog", "10 øl"};

    private int[] answers = new int[10];


    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);


        int numberOfInterviews = 0;

        while (numberOfInterviews < 20) {

            System.out.println("Hvilken ting vil du helst have med på en øde ø?");
            System.out.println("1 kæreste\n2 kaffemaskine\n3 Netflix\n4 sofa\n5 løbesko\n6 guitar\n7 slik\n8 hund\n9 bog\n10 øl");
            System.out.println("Indtast valg (tal): ");

            int input = scanner.nextInt();

            switch (input) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                    updateList(input);
                    numberOfInterviews += 1;
                }
                default -> System.out.println("Du tastet ikke et tal mellem 1 og 10. Prøv igen");
            }

             // If arrays are of equal length:

            for (int i = 0; i < item.length; i++) {
            System.out.println(item[i] + '\t' + answers[i]);
            }
        }




    }


    public void updateList(int input){
        for (int i = 0; i < item.length; i++) {
            answers[input-1] += 1;
        }
    }

    @Override
    public String toString() {
        return "Main{" +
            "item=" + Arrays.toString(item) +
            ", answers=" + Arrays.toString(answers) +
            '}';
    }

    public static void main (String[]args){

        Main main = new Main();
        main.mainMenu();

    }

}
