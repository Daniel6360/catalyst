package ro.catalyst.hyperloop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HyperloopLvl4 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/hyperloop/level4/level4-eg.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner scanner = new Scanner(br);

        int noOfObstacales = scanner.nextInt();
        int noOfTargets = 0;
        List<Double> obstacles = new ArrayList<>();
        List<Double> list = new ArrayList<>();


        System.out.println(scanner.nextLine());

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] arr = s.split(" ");
            if (arr.length == 3) {
                for (int i = 0; i < arr.length; i++) {
                    obstacles.add((Double.parseDouble(arr[i])));
                }
            } else if (arr.length == 1) {
                for (int i = 0; i < arr.length; i++) {
                    noOfTargets = Integer.valueOf(arr[i]);

                }

            } else {
                for (int i = 0; i < arr.length; i++) {
                    list.add(Double.parseDouble(arr[i]));
                }

            }
        }

        System.out.println(noOfTargets);
        System.out.println(obstacles);
        System.out.println(list);


    }
}

