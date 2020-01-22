package ro.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        List<Integer> list=new ArrayList<>();
        int sum=0;

for (int i=0;i<arr.length-2;i++){
    for (int j=0;j<arr[i].length-2;j++){

        sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        list.add(sum);

    }
}
        System.out.println(list);

return Collections.max(list);
    }

    private static final Scanner scanner = new Scanner("1 1 1 0 0 0\n" +
            "0 1 0 0 0 0\n" +
            "1 1 1 0 0 0\n" +
            "0 0 2 4 4 0\n" +
            "0 0 0 2 0 0\n" +
            "0 0 1 2 4 0");

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(hourglassSum(arr));

        int result = hourglassSum(arr);

     //   bufferedWriter.write(String.valueOf(result));
     //   bufferedWriter.newLine();

      //  bufferedWriter.close();

        scanner.close();
    }
}

