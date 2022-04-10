package com.company;

import java.util.Scanner;

public class Main {

    private String[] item = {"1 kæreste", "2 kaffemaskine", "3 Netflix", "4 sofa", "5 løbesko",
        "6 guitar", "7 slik", "8 hund", "9 bog", "10 øl"};

    private int[] answers = new int[10];

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvilken ting vil du helst have med på en øde ø?");
        System.out.println("1 kæreste\n2 kaffemaskine\n3 Netflix\n4 sofa\n5 løbesko\n6 guitar\n7 slik\n8 hund\n9 bog\n10 øl");
        System.out.println("Indtast valg (tal): ");

        String input = scanner.nextLine();

        while (!input.equals("exit")) {

            switch (input) {
                case "1":
                    for (int i = 0; i < item.length; i++) {
                        answers[0] += 1;
                    }
                    break;
                case "2":
                    for (int i = 0; i < item.length; i++) {
                        answers[1] += 1;
                    }
                    break;
                case "3":
                    for (int i = 0; i < item.length; i++) {
                        answers[2] += 1;
                    }
                    break;
                case "4":
                    for (int i = 0; i < item.length; i++) {
                        answers[3] += 1;
                    }
                    break;
                case "5":
                    for (int i = 0; i < item.length; i++) {
                        answers[4] += 1;
                    }
                    break;
                case "6":
                    for (int i = 0; i < item.length; i++) {
                        answers[5] += 1;
                    }
                    break;
                case "7":
                    for (int i = 0; i < item.length; i++) {
                        answers[6] += 1;
                    }
                    break;
                case "8":
                    for (int i = 0; i < item.length; i++) {
                        answers[7] += 1;
                    }
                    break;
                case "9":
                    for (int i = 0; i < item.length; i++) {
                        answers[8] += 1;
                    }
                    break;
                case "10":
                    for (int i = 0; i < item.length; i++) {
                        answers[9] += 1;
                    }
                    break;
                default:
                    System.out.println("Du tastet ikke et tal mellem 1 og 10. Prøv igen");
                    break;
            }
        }
    }


        public static void main (String[]args){

        Main main = new Main();
        main.mainMenu();

    }

}
