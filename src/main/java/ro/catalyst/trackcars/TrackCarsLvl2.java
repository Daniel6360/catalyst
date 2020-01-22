package ro.catalyst.trackcars;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrackCarsLvl2 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/trackcars/lvl2/level2-4.in");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner sc = new Scanner(br);
        int noOfPos = sc.nextInt();
        sc.nextLine();

        List<String>cars=new ArrayList<>();
        List<Double> norths=new ArrayList<>();
        List<Double>easts=new ArrayList<>();

        for (int i = 0; i < noOfPos; i++) {
            String str = sc.nextLine();

            String[] arr = str.split(",");
            System.out.println(arr[1]);
            String car = arr[0];
            String time=arr[1];
            String carTime=car+","+time;

            double north= Double.parseDouble(arr[2]);
            double east=Double.parseDouble(arr[3]);

            cars.add(carTime);
            norths.add(north);
            easts.add(east);
        }
        System.out.println(cars.get(max(easts)));

        StringBuilder sb=new StringBuilder();

        sb.append(cars.get(max(norths))+","+cars.get(max(easts)));
        System.out.println(sb);

    }

    public static int max(List<Double> list){
        double max=0;
        int index=0;
        for (int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
                 index=i;
            }
        }
        return index;
    }
}
