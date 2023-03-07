package org.example.first.demo;
import java.util.Scanner;
public class Program2 {
        public static void main(String[] args) {
            int[][] seats = {
                    {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                    {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                    {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                    {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
            };
            Scanner sc = new Scanner(System.in);
            //your code goes here
            int row = sc.nextInt();
            int column =sc.nextInt();
            if (seats[row][column]==0){
                System.out.println("Sold");
            } else
            System.out.println("Free");
            }


        }

