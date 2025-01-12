package array;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Syntax {

//    Only declare array
//    int name[5];
//    name = new int[5];
//    name = {5,6,9,8};

    public static void main(String[] args){
        //    Declare array and define its size
        int[] arr = new int[5];

//    Declare array and initialize its values
        int[] roll = {4,7,8};

        int sum = Arrays.stream(roll).sum();
        int size = roll.length;
        int hashCode = Arrays.hashCode(roll);
        int[] clone = roll.clone();
        OptionalDouble average = Arrays.stream(roll).average();

        System.out.println(sum);
        System.out.println(size);
        System.out.println(hashCode);
        System.out.println(Arrays.toString(clone));
        System.out.println(average);
    }
}
