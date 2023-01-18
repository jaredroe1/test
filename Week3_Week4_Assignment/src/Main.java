import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 105};
        //Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
        int lastMinusFirst = ages[ages.length - 1] - ages[0];
        System.out.println(lastMinusFirst);
        //Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        double sum = 0;

        for (int number : ages) {
            sum += number;
        }
        double average = sum / ages.length;
        System.out.println("Average age is: " + average + ".");
        //Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
        //Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        double sumOfLetters = 0;

        for (String name : names) {
            sumOfLetters += name.length();
        }
        double avgLetters = sumOfLetters / names.length;
        System.out.println("Average name length is: " + avgLetters + " letters.");
        //Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
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
        System.out.println(names[names.length - 1]);

        // to access the first element of any array us the name of the array with first index array[0]
        System.out.println(names[0]);

        //Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int[] nameLengths = extractStringLength(names);
        for (int number : nameLengths) {
            System.out.println(number);
        }


        //Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        int nameLengthSum = 0;
        for (int number: nameLengths) {
            nameLengthSum += number;
        }
        System.out.println(nameLengthSum);

        System.out.println(multiplyString("Welcome", 3));

        System.out.println(fullName("Jared", "Roe"));

        System.out.println(moreThanOneHundred(ages));

        double[] numbers = {1.2, 5.2, 6.7, 7.1, 8.4};
        double[] moreNumbers = {1.1, 1.2, 1.3, 1.4, 1.5};
        System.out.println(averageOfDoubles(numbers));
        System.out.println(firstArrayIsGreater(numbers, moreNumbers));

        boolean isHotOutside = true;
        double moneyInPocket = 12.50;
        System.out.println(willBuyDrink(isHotOutside, moneyInPocket));


        whatToDo("monday", 520);


    }
    public static int[] extractStringLength(String[] names) {
        int[] results = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            results[i] = names[i].length();
        }
        return results;
    }

    //Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
    public static String multiplyString(String str, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += str;
        }
        return result;

    }

    //Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    //Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
    public static boolean moreThanOneHundred(int[] ages) {
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
    public static double averageOfDoubles(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    //Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    public static boolean firstArrayIsGreater(double[] numbers, double[] moreNumbers) {
        double firstSum = 0;
        double secondSum = 0;
        for (double number : numbers) {
            firstSum += number;
        }
        double firstAvg = firstSum / numbers.length;

        for (double number : moreNumbers) {
            secondSum += number;
        }
        double secondAvg = secondSum / moreNumbers.length;

        if (firstAvg > secondAvg) {
            return true;
        } else {
            return false;
        }
    }

    //Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        if (isHotOutside == true && moneyInPocket > 10.50) {
            return true;
        } else {
            return false;
        }
    }

    //Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

    public static void whatToDo(String day, int time) {

        if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
            System.out.println("Finish homework and enjoy they day!");
        } else if (!day.equalsIgnoreCase("Monday") && !day.equalsIgnoreCase("Tuesday") && !day.equalsIgnoreCase("Wednesday") && !day.equalsIgnoreCase("Thursday") && !day.equalsIgnoreCase("Friday")) {
            System.out.println("Please enter valid day.");
        } else if (time < 0 || time > 2400) {
            System.out.println("Please enter valid time.");
        } else if (time < 500 || time > 2230) {
            System.out.println("Sleep");
        } else if (time < 530) {
            System.out.println("Get ready for work.");
        } else if (time < 600) {
            System.out.println("Drive to work.");
        } else if (time < 1100) {
            System.out.println("Work.");
        } else if (time < 1200) {
            System.out.println("Eat lunch and run errands.");
        } else if (time < 1600) {
            System.out.println("Try to stay awake and work.");
        } else if (time < 1630) {
            System.out.println("Drive home.");
        } else if (time < 1800) {
            System.out.println("Watch videos and work on homework.");
        } else if (time < 1900) {
            System.out.println("Enjoy dinner with wife.");
        }else if (time < 2230) {
            System.out.println("Relax and enjoy the evening with wife.");
        }
    }
}



