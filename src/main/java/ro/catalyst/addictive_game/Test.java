package ro.catalyst.addictive_game;

public class Test {
    public static void main(String[] args) {
        System.out.println(getRow(30,5));
    }
    public static int getRow(int n, int rowSize){
        int counter=0;
        for (int i=0;i<n; i=i+rowSize){
           counter++;
        }
        return counter;
    }
}
