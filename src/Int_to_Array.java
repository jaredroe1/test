
public class Int_to_Array {

    static int sumOfDigits(int digits) {
    String temp = Integer.toString(digits);
     int[] numbers = new int[temp.length()];
     for (int i = 0; i < temp.length(); i++) {
    numbers[i] = Character.getNumericValue(temp.charAt(i));
    }
    int sum = 0;
    for (int number: numbers){
     sum += number;
     }
    return sum;
    }

    public static void main(String[] args) {
        int digits = 12345;
        int sumAll = sumOfDigits(digits);
        System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");
    }
}
