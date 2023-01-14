import java.lang.reflect.Array;
import java.util.List;

import static java.lang.reflect.Array.setInt;

public class practice {

    //static int sumOfDigits(int digits) {
        //String temp = Integer.toString(digits);
       // int[] numbers = new int[temp.length()];
       // for (int i = 0; i < temp.length(); i++) {
            //numbers[i] = Character.getNumericValue(temp.charAt(i));
        //}
        //int sum = 0;
        //for (int number: numbers){
           // sum += number;
       // }
        //return sum;
   // }

    static int addingIndex = 0;


    public static void main(String[] args) {
        int[] arr = {-11, 43, 901, 72, -5};
        int[] arr2 = arr.clone();

        System.out.println(arr2[3]);


    }





        //for (int number : array) {
        //System.out.println(number);
        // }

        //double sum = 0;
        //for (int number : array) {
        //sum += number;
        //}
        //System.out.println(sum);

        //double average = sum / array.length;
        //System.out.println(average);

        //for (int number : array) {
        //if (number % 2 == 1) {
        //System.out.println(number);
        //}
        //}

        //String[] names = {"Sam", "Sally", "Thomas", "Robert"};
        // int sumOfLetters = 0;
        //for (String name : names) {
        // sumOfLetters += name.length();

        //}
        //System.out.println(sumOfLetters);

        //int digits = 12;
        //int sumAll = sumOfDigits(digits);
        //System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");





}
