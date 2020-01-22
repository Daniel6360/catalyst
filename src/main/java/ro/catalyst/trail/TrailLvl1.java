package ro.catalyst.trail;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;

public class TrailLvl1 {
    public static void main(String[] args) {
        String str = "10 FFLFRFRFFLFLFRFF 5 L 1 FFFRFLFLFRFF 4 L 1 FFLFRFRFFLFLFRFF 8 L 1 FFLFRFRFFLFLFRFF 4 L 1 FFFFFF 3 R 1";
        String[] sb = str.split("\\d+");
        String[] sb2 = str.split("[a-zA-Z]+");
        String[] arr = new String[sb2.length];
        String[] arr2 = new String[sb.length];


        for (int i = 0; i < sb2.length; i++) {
            String s = sb2[i];
            String s1 = sb[i];
            s = s.replaceAll("\\s+", "");
            s1 = s1.replaceAll("\\s+", "");
            arr[i] = s;
            arr2[i] = s1;
        }


        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        int result = 0;
        for (int i = 1; i < arr2.length; i++) {


            if (arr2[i].contains("R") || arr2[i].contains("L")) {
                list2.add(countF(arr2[i]));
            } else {
                list2.add(Integer.parseInt(arr[i]));
            }

            if (arr2[i].equals("R") || arr2[i].equals("L")) {
                continue;
            } else {
                int noOfF = countF(arr2[i]);
                int repeats = Integer.parseInt(arr[i]);
                int a = noOfF * repeats;



                result = result + a;
            }



        }

        System.out.println("Lista 2" + list2);
        System.out.println(result);

        Collections.sort(list2);



        System.out.println(list2);


        int result2 = 0;
        if (list2.size() == 1) {
            result2 = list2.get(0) * list2.get(0);
        } else {
            result2 = list2.get(list2.size() - 1) * list2.get(list2.size() - 2);
        }

        System.out.println(result + " " + result2);


    }


    public static int countF(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'F') {
                counter++;

            }

        }

        return counter;
    }
}

