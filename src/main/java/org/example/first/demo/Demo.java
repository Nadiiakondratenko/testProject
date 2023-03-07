package org.example.first.demo;

import java.util.Scanner;

/**class Demo{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  number = scanner.nextInt();
        int fact = 1;
        //your code goes here
        while (number>0){
            fact = fact*number;
            number--;
        }
        System.out.println(fact);

    }
}**/
class Demo{
    public static void main(String[] args) {

        int[] passwords = {2021, 1023, 9929};
        Scanner scanner = new Scanner(System.in);

        int  password = scanner.nextInt();
        /*iterate through the array “passwords” and
        compare  items with inputted password.*/

        for (int item: passwords) {
            if (item == password) {
                System.out.println("Welcome");

            }
        }
    }
}