import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

         Answerable phone = () -> "Hello";
          //lambda function map  back to the Anserable's answer function which return sring 

         System.out.println(phone.answer());

         Predicate isOdd = n -> n % 2 != 0;
         System.out.println(isOdd.test(2));

         Predicate isEven = n -> n % 2 == 0;
         System.out.println(isEven.test(2));
    }

}
