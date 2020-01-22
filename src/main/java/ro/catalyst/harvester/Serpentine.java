package ro.catalyst.harvester;

import java.net.CookieHandler;
import java.text.CollationElementIterator;
import java.util.*;

public class Serpentine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("23 12");

        int rows = scanner.nextInt();
        int col = scanner.nextInt();


        int[][] arr = new int[rows][col];
        int fill = 1;

        for (int row = 0; row < rows; row++) {
            for (int cols = 0; cols < col; cols++) {
                arr[row][cols] = fill++;
            }
        }


        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < rows; row++) {
            int counter = col - 1;
            for (int cols = 0; cols < col; cols++) {

                if (row % 2 == 0) {
                    sb.append(arr[row][cols]);
                    sb.append(" ");

                } else {

                    sb.append(arr[row][counter]);
                    sb.append(" ");
                    counter--;


                }
            }
        }


        System.out.println(sb);


    }

}
