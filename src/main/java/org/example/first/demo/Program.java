package org.example.first.demo;

import  java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        //your code goes here
        int len= revenue.length;
        System.out.println(len);
        double sum = 0;
        int month=1;

        for (double x:revenue){
            //if (month<len){
                
                sum=sum+x;
           // }

        }
        double average = sum/len;
        System.out.println(average);
    }
}

/**public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println(menu[0]);
                break;
            case 2:
                System.out.println(menu[1]);
                break;
            case 3:
                System.out.println(menu[2]);
                break;
            case 4:
                System.out.println(menu[3]);
                break;
            case 5:
                System.out.println(menu[4]);
                break;
            default:
                System.out.println("Invalid");
                break;



        }
    }

}**/