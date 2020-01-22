package ro.catalyst.trackcars;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class TrackcarsLvl3 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/trackcars/lvl3/ex.in");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner sc = new Scanner(br);
        String coordinates = sc.nextLine();
        String[] rectangle = coordinates.split(",");

        int noOfPos = sc.nextInt();
        sc.nextLine();

        double north = Double.parseDouble(rectangle[0]);
        double east = Double.parseDouble(rectangle[1]);
        double south = Double.parseDouble(rectangle[2]);
        double west = Double.parseDouble(rectangle[3]);

        System.out.println(north + " " + east + " " + south + " " + west);

        List<String> cars = new ArrayList<>();


        StringBuilder sb = new StringBuilder();
        int counter = 0;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            String[] arr = str.split(",");
            System.out.println(Arrays.toString(arr));
            String car = arr[0];


            double longitude = Double.parseDouble(arr[2]);
            double latitude = Double.parseDouble(arr[3]);
            System.out.println(longitude+" "+latitude);

            if (longitude < north && latitude < east && longitude > south && latitude> west){
                cars.add(car);
                counter++;

            }


        }
        Collections.sort(cars);

        for (int i = 0; i < cars.size(); i++) {
            sb.append(cars.get(i));
            sb.append(",");
        }
        System.out.println(sb);
        System.out.println(counter);

    }


}
