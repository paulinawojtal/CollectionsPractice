package lottoCupon;

import java.util.*;

public class LottoCupon {

    // draw 8 times 6 numbers from 49
    public static List<Set<Integer>> drawRandomNumbers(){
        List<Set<Integer>> cupon = new ArrayList<>();

        Random rand = new Random();

        for(int i=0; i<8; i++){
            Set<Integer> window = new TreeSet<>();
            while(window.size() < 6){
                int number = rand.nextInt(49) + 1;
                window.add(number);
            }
            cupon.add(window);
        }
        return cupon;
    }

    // print all drawn numbers, every 6 numbers in one raw
    public static void printNumbers(List<Set<Integer>> cupon){

        for(Set<Integer> s : cupon){
            for(int i : s){
                System.out.printf("%3d", i);
            }
            System.out.println();
            System.out.println("====================");
        }
    }

    public static void main(String[] args) {

        List<Set<Integer>> cupon = drawRandomNumbers();

        printNumbers(cupon);
    }

}
