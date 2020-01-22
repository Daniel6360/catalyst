package ro.catalyst.hyperloop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HyperloopLvl1 {
    public static void main(String[] args)throws Exception {

        File input = new File("src/main/resources/hyperloop/level1/level1-4.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));
        Scanner scanner = new Scanner(br);

        int separatingLine=scanner.nextInt();
        System.out.println(separatingLine);
        scanner.nextLine();
        int noOfPos=scanner.nextInt();
        System.out.println(noOfPos);

        List<Integer> list=new ArrayList<Integer>();

        while (scanner.hasNextLine()&&scanner.hasNextInt()){
         list.add(scanner.nextInt());

        }

        List<Integer> result =new ArrayList<>();

        for (int i=1; i<list.size();i=i+2){

            if (list.get(i)<separatingLine&&separatingLine>0){
                result.add(list.get(i-1));
                result.add(list.get(i));
            }else if (list.get(i)>separatingLine&&separatingLine<0){
                result.add(list.get(i-1));
                result.add(list.get(i));

            }

        }






        StringBuilder sb=new StringBuilder();

        for (int i=0;i<result.size();i++){
            sb.append(result.get(i));
            sb.append(" ");
        }

        System.out.println(sb);

    }
}
