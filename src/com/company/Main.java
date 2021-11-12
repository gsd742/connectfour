package com.company;

import java.util.Scanner;

public class Main {
    static String [][] board = new String [5][5];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Setup();
        Display();
        System.out.println("play connect four? you're red");
        System.out.println("which across do you want?");
        int across = input.nextInt();



    }
    public static void Setup (){
        for (int i = 0;i<5;i++){
            for (int j=0; j<5;j++){
                board [i][j] =  "[ ]";
            }
        }
    }

    public static void Display(){
        for(int i = 0; i<5;i++){
            for (int j = 0; j<5; j++){
                System.out.print(board[i][j]);
            }
            System.out.println(" ");
        }
    }
}
