package ro.catalyst.challange;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int noOfCol =30;
        int block =0;
        int blockLength1=0;
        int blockLength2=0;

        int z=blockLength1+blockLength2;
        StringBuilder sb = new StringBuilder();
        int n=noOfCol-block;
        String[]arr=new String[noOfCol];
        int counter=0;

        for (int i = 0; i<arr.length; i++) {
            if (i<n){
                arr[i]="?";
            }
        }

        for (int i = arr.length-1; i>0; i--) {
            arr[i]="?";
            counter++;
            if (counter>=n){
                break;
            }
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]==null){
                arr[i]="1";
            }
        }
        for (int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(sb);

    }
}
