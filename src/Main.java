public class Main {
    public static void main(String[] args) {
        int [] multiplesOf5 = new int[10];

        for (int i = 0; i < multiplesOf5.length; i++){
            multiplesOf5[i] = (i+1) * 5;
            System.out.println(multiplesOf5[i]);
        }
    }

}