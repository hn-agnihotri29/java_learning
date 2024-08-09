
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 31, 45, 22, 98, 10
        //Delcare and allocate the array
        int[] numbers = new int[5];
        //Initiliza the array
        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        //Declare, allocate and initlizae the array in one line code
        int[] numbers2 = {31, 45, 22, 98, 10};
        Arrays.sort(numbers);
        //Without tostring() iit print memory address
        System.out.println(Arrays.toString(numbers));

        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
        System.out.println("Index 1: " + myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2] = "Butterfinger";
        //Index 2: Butterfinger;
        System.out.println("Index 2: " + myFavoriteCandyBars[2]);
        System.out.println("Length: " + myFavoriteCandyBars.length);
        //output --> 3
        System.out.println(Array.get(myFavoriteCandyBars, 2));

    }
}
