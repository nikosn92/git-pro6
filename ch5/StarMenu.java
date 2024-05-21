package gr.aueb.cf.ch5;

import java.util.Scanner;

public class StarMenu {


    public static void StarsHr(int lines) {
        for (int i = 1; i <= lines; i++) {


            System.out.print("*");
        }
    }


    public static void StarsVr(int lines) {
        for (int i = 1; i <= lines; i++) {


            System.out.println("*");
        }
    }

    public static void StarNxn(int n) {

        for (int j = 1; j <= n; j++) {

            StarsHr(n);


            System.out.println();

        }
    }

    public static void StarsAsc(int n) {

        for (int j = 1; j <= n; j++) {

            StarsHr(j);

            System.out.println();

        }
    }

    public static void StarsDesc(int n) {

        for (int j = n; j >= 1; j--) {

            StarsHr(j);

            System.out.println();

        }
    }


        public static void main (String[]args){


            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            int n = 0;


            do {
                System.out.println("1. Οριζόντια αστέρια");
                System.out.println("2. Κάθετα αστέρια");
                System.out.println("3. n γραμμές με n αστέρια");
                System.out.println("4. γραμμές με αστέρια 1-n");
                System.out.println("5. γραμμές με αστέρια n-1");
                System.out.println("6. Έξοδος");

                choice = scanner.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        System.out.println("Δώστε αριθμό για οριζόντια αστέρια");
                        n = scanner.nextInt();
                        StarsHr(n);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Δώστε αριθμό για κάθετα αστέρια");
                        n = scanner.nextInt();
                        StarsVr(n);
                        break;
                    case 3:
                        System.out.println("Δώστες αριθμό γραμμών και αστεριών");
                        n = scanner.nextInt();
                        StarNxn(n);
                        break;
                    case 4:
                        System.out.println("Δώστε αριθμό για 1-n");
                        n = scanner.nextInt();
                        StarsAsc(n);
                        break;
                    case 5:
                        System.out.println("Δώστε αριθμό για n-1");
                        n = scanner.nextInt();
                        StarsDesc(n);
                        break;
                    case 6:
                        System.out.println("Έξοδος...");

                        break;
                    default:
                        System.out.println("Λάθος Επιλογή");
                }
            } while (choice != 6);
            scanner.close();

        }
    }

