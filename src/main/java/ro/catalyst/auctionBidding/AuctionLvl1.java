package ro.catalyst.auctionBidding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AuctionLvl1 {
    public static void main(String[] args) {
        String str= "1,nepper,15,hamster,24,philipp,30,mmautne,31,hamster,49,thebenil,57,fliegimandi,59,ev,61,philipp,64,ev,74,philipp,69,philipp,71,fliegimandi,78,hamster,78,mio,95,hamster,103,macquereauxpl,135";

        String[] arr=str.split(",");
        System.out.println(Arrays.toString(arr));

        int initialPrice=Integer.parseInt(arr[0]);


        List<Integer> bids=new ArrayList<>();
        List<String> names=new ArrayList<>();
        for (int i=1;i<arr.length;i+=2){
            bids.add(Integer.parseInt(arr[i+1]));
            names.add(arr[i]);
        }

        System.out.println(bids);
        System.out.println(names);

        int max=bids.indexOf(Collections.max(bids));

        System.out.println(names.get(max)+","+bids.get(max));
    }
}
