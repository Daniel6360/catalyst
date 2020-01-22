package ro.catalyst.harvester;

import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class Serpentine2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner("10 1 1 1");
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        int startRow=scanner.nextInt()-1;
        int startCol=scanner.nextInt()-1;

        int[][] arr = new int[rows][cols];
        int fill = 1;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[row][col] = fill++;
            }
        }

StringBuilder sb=new StringBuilder();

//bottom left
        if(startRow==arr.length-1&&startCol==0){
            int counter=cols-1;
            for (int row=startRow;row>=0;row--){
                for (int col=0;col<arr[row].length;col++){
                    if (row%2>0){
                        sb.append(arr[row][col]);
                        sb.append(" ");

                    }else {
                        sb.append(arr[row][counter]);
                        sb.append(" ");
                        counter--;
                    }
                }
            }

            //bottom right
        }else if(startRow==rows-1&&startCol==cols-1){


            for (int row=arr.length-1;row>=0;row--){
                int counter=0;
                for (int col=arr[row].length-1;col>=0;col--){
                    if (row%2==0){
                        sb.append(arr[row][col]);
                        sb.append(" ");
                    }else {
                        sb.append(arr[row][counter]);
                        sb.append(" ");
                        counter++;
                    }
                }
            }
            //top right
        }else if (startRow==0&&startCol==arr[0].length-1){

            for (int row =0;row<arr.length;row++){
                int counter=0;
                for (int col=arr[row].length-1;col>=0;col--){
                    if (row%2==0){
                        sb.append(arr[row][col]);
                        sb.append(" ");
                    }else {
                        sb.append(arr[row][counter]);
                        sb.append(" ");
                        counter++;
                    }
                }
            }
            //top left
        }else if (startRow==0&&startCol==0){
            for (int row = 0; row < rows; row++) {
                int counter = cols - 1;
                for (int col = 0; col < cols; col++) {

                    if (row % 2 == 0) {
                        sb.append(arr[row][col]);
                        sb.append(" ");

                    } else {

                        sb.append(arr[row][counter]);
                        sb.append(" ");
                        counter--;


                    }
                }
            }
        }
        System.out.println(sb);


    }
}
