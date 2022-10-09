/**
 *  1. In Java, no code can exist outside of a class. Unlike Python which uses
 *    functions, all code in Java uses methods.
 *
 *    For this exercise, all of our code is within the Basics class.
 *
 *    (Relevant reading: 1.1.1. Defining classes)
 */
public class Basics {

    public static void main(final String[] args) {
        System.out.println(7 + 5);
        System.out.println("Hello World!");
         int my_variable = 100;

        System.out.println("my_variable's value is " + my_variable);

        for (int i = 10; i >= 0; i = i - 1) {
          System.out.println("Current count: " + i);
        }
    }

    public static String split(String to_split) {
        StringBuilder ret = new StringBuilder();
        String[] to_split_array = to_split.split(" ");

        for (String part : to_split_array){
            ret.append(part.charAt(0));
        }
        return ret.toString();
    }

    public static int oddSum(int[] arr) {
        int current_sum = 0;
        if (arr.length <= 1){
            return 0;
        }
        else {
            for (int index = 1; index < arr.length; index = index + 2)
            {
                current_sum += arr[index];
            }
            return current_sum;
        }
    }

}
