package ro.catalyst.hyperloop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HyperloopLvl3 {
    public static void main(String[] args) throws Exception {
        File input = new File("src/main/resources/hyperloop/level3/level3-eg.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));
        Scanner scanner = new Scanner(br);
        double x0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        int noOfTargets = scanner.nextInt();


        List<Double> list = new ArrayList<>();

        while (scanner.hasNextLine() && scanner.hasNextInt()) {
            list.add(scanner.nextDouble());
        }

        System.out.println(list);

        double angle1 = Math.atan2(x0, y0);
        double angle2 = Math.atan2(x1, y0);

        double leftAngle = leftAngle(angle1, angle2);
        double rightAngle = rightAngle(angle1, angle2);

        StringBuilder sb = new StringBuilder();
        System.out.println(y0);

        System.out.println(leftAngle);
        System.out.println(rightAngle);

        System.out.println(Math.atan2(3.0, -3.0));
        System.out.println(Math.atan2(3.0, -2.0));

        for (int i = 1; i < list.size(); i = i + 2) {
            double y = list.get(i);
            double x = list.get(i - 1);
            double pointAngle = Math.atan2(x, y);

            if (y0 > 0) {

                if (y < y0 || pointAngle < leftAngle || pointAngle > rightAngle) {
                    sb.append((int) x);
                    sb.append(" ");
                    sb.append((int) y);
                    sb.append(" ");

                }
            }else if (y0 < 0) {
                if (y > y0 && pointAngle > leftAngle || pointAngle < rightAngle) {
                    sb.append((int) x);
                    sb.append(" ");
                    sb.append((int) y);
                    sb.append(" ");
                }
            }


        }
        System.out.println(sb);


    }


    //OUTSIDE MAIN
    public static double leftAngle(double angle1, double angle2) {
        if (angle1 < angle2) {
            return angle1;
        } else return angle2;
    }

    public static double rightAngle(double angle1, double angle2) {
        if (angle1 > angle2) {
            return angle1;
        } else return angle2;
    }
}
