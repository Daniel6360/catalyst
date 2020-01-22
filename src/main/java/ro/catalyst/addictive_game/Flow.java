package ro.catalyst.addictive_game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Flow {
    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("src/main/resources/lvl1/level1-3.in");
        BufferedReader br = new BufferedReader(new FileReader(input));
        Scanner scanner = new Scanner(br);
        int rows = scanner.nextInt();
        int col = scanner.nextInt();
        int pos = scanner.nextInt();


        int[][] arr = new int[rows][col];


        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = count;
                count++;

            }
        }

        StringBuilder builder=new StringBuilder();
        while (scanner.hasNextInt()){
            int n=scanner.nextInt();


            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j]==n){
                        builder.append(i+1);
                        builder.append(" ");
                        builder.append(j+1);
                        builder.append(" ");
                    }

                }
            }
        }
        System.out.println(builder);


    }






}

