package ro.catalyst.hyperloop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HyperloopLvl2 {
    public static void main(String[] args) throws Exception {
        File input = new File("src/main/resources/hyperloop/level2/level2-3.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));
        Scanner scanner = new Scanner(br);
        double angleX1 = scanner.nextDouble();
        double angleY1 = scanner.nextDouble();


        double angleX2 = scanner.nextDouble();
        double angleY2 = scanner.nextDouble();
        System.out.println(angleX2);

        int noOfPos = scanner.nextInt();
        System.out.println(noOfPos);
        scanner.nextLine();


        List<Integer> list = new ArrayList<Integer>();

        while (scanner.hasNextLine() && scanner.hasNextInt()) {
            list.add(scanner.nextInt());

        }
        System.out.println(list);
        double angle1 = Math.atan2(angleX1, angleY1);
        double angle2 = Math.atan2(angleX2, angleY2);
        System.out.println(angle1);
        System.out.println(angle2);


        StringBuilder sb = new StringBuilder();
        double leftAngle = leftAngle(angle1, angle2);
        double rightAngle = rightAngle(angle1, angle2);

        System.out.println("left " + leftAngle);
        System.out.println("right " + rightAngle);

        for (int i = 1; i < list.size(); i = i + 2) {
            double y = list.get(i);
            double x = list.get(i - 1);
            double pointAngle = Math.atan2(x, y);


            if (pointAngle > rightAngle || pointAngle < leftAngle) {
                sb.append((int) x);
                sb.append(" ");
                sb.append((int) y);
                sb.append(" ");
            }


        }
        System.out.println(sb);
        System.out.println(angle1);
        System.out.println(angle2);


    }


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
