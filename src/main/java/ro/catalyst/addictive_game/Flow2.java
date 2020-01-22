package ro.catalyst.addictive_game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flow2 {
    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("src/main/resources/addictiveGame/lvl2/level2-3.in");
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


        List<IntPair> list = new ArrayList<IntPair>();

        while (scanner.hasNextInt()) {
            IntPair pair = new IntPair(scanner.nextInt(), scanner.nextInt());
            list.add(pair);
        }


        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getY() == list.get(j).getY()) {

                    List<Integer> r = new ArrayList<Integer>(getPos(list.get(i).getX(), arr));
                    int r1 = r.get(0);
                    int r2 = r.get(1);



                    List<Integer> c = new ArrayList<Integer>(getPos(list.get(j).getX(), arr));
                    int c1 = c.get(0);
                    int c2 = c.get(1);


                    int res = Math.abs(r1 - c1) + Math.abs(r2 - c2);

                    bld.append(res);
                    bld.append(" ");
                }
            }
        }
        System.out.println(bld);


    }


    public static List<Integer> getPos(int n, int[][] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == n) {
                    list.add(i + 1);
                    list.add(j + 1);
                }

            }
        }
        return list;
    }

}
