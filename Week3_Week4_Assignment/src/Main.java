import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] ages = {3, 9, 23, -64, 2, 8, 28, -93, -105};
        int lastMinusFirst = ages[ages.length - 1] - ages[0];
        System.out.println(lastMinusFirst);
        double sum = 0;

        for (int number : ages) {
            sum += number;
        }
        double average = sum / ages.length;
        System.out.println("Average age is: " + average + ".");

        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        double sumOfLetters = 0;

        for (String name : names) {
            sumOfLetters += name.length();
        }
        double avgLetters = sumOfLetters / names.length;
        System.out.println("Average name length is: " + avgLetters + " letters.");

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i] + "";
        }
        String name = Arrays.toString(names);
        name = name.replace('[', ' ').replace(']', ' ').replace(',', ' ');
        System.out.println(name);

        //String joined = String.join(" ", names);
        //System.out.println(joined);
        // this seemed to get the desired result but did not use a loop to join the names together

        //to access the last element of any array use the name of the array[arrayname.length-1]
        System.out.println(names[names.length-1]);

        // to access the first element of any array us the name of the array with first index array[0]
        System.out.println(names[0]);

        //Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

        //Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.


        System.out.println(multiplyString("Welcome", 3));

        System.out.println(fullName("Jared", "Roe"));

        System.out.println(moreThanOneHundred(ages));
    }




    //Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
        public static String multiplyString(String str, int num){
            String result = "";
            for (int i = 0; i < num; i++){
                result += str;
            }
            return result;

        }

        //Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
        public static String fullName(String firstName, String lastName){
            return firstName + " " + lastName;
        }

        //Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        public static boolean moreThanOneHundred(int [] ages) {
            double sum = 0;
            for (int number : ages) {
                sum += number;
            }
            if (sum > 100) {
                return true;
            } else {
                return false;
            }
        }

        //Write a method that takes an array of double and returns the average of all the elements in the array.
    }




