package ro.catalyst.bowling;

import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bowlinglvl1 {
    public static void main(String[] args) {
        String str = "10:7,2,1,9,6,4,5,5,10,3,7,7,3,6,4,10,2,8,6";

        Scanner scanner = new Scanner(str);
        String[] rounds = str.split(":");
        int noOfRounds = Integer.parseInt(rounds[0]);
        String str2 = str.substring(2, str.length());
        str2 = str2.replace(":", "");
        System.out.println(str2);


        String[] scoreBoard = str2.split(",");

        List<Integer> list = new ArrayList<>();

        int x1, x2 = 0;


        int score = 0;

        boolean strike = false;
        boolean spare = false;
        for (int i = 1; i < scoreBoard.length - 1; i += 2) {
            x1 = Integer.parseInt(scoreBoard[i - 1]);
            x2 = Integer.parseInt(scoreBoard[i]);

            if (x1 == 10) {

                strike = true;
                i = i - 1;


                score = score + x1 + Integer.parseInt(scoreBoard[i + 1]) + Integer.parseInt(scoreBoard[i + 2]);

            } else if (x1 + x2 == 10) {
                spare = true;
                score = score + x1 + x2 + Integer.parseInt(scoreBoard[i + 1]);
            } else {

                strike = false;
                spare = false;
                score = score + x1 + x2;
            }

            if (spare) {
                list.add(score);
            } else if (strike) {
                list.add(score);
            } else {
                list.add(score);
            }


        }
        System.out.println(noOfRounds);
        System.out.println(list.size());

        if (noOfRounds < list.size()) {
            list.remove(list.size() - 1);
        }


        System.out.println(list);

    }
}