package ro.catalyst.trackcars;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.Scanner;

public class TrackTheCars {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/trackcars/lvl1/level1-4.in");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner sc = new Scanner(br);
        String str = sc.nextLine();

        int noOfPos = sc.nextInt();
        sc.nextLine();


        String[] rectangele = str.split(",");
        System.out.println(Arrays.toString(rectangele));
        double north = Double.parseDouble(rectangele[0]);
        double east = Double.parseDouble(rectangele[1]);
        double south = Double.parseDouble(rectangele[2]);
        double west = Double.parseDouble(rectangele[3]);

        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < noOfPos; i++) {
            String coordinates = sc.nextLine();

            String[] lngLat = coordinates.split(",");


            double longitude = Double.parseDouble(lngLat[0]);
            double latitude = Double.parseDouble(lngLat[1]);
            System.out.println(longitude+ ","+latitude);
            if (longitude<north&&latitude<east&&longitude>south&&latitude>west) {
                counter++;
            }


        }
        System.out.println(counter);


    }
}
