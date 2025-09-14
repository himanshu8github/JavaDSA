package JavaBasics;

public class CountOccurence {


    public static void main(String[] args) {

        int  n = 455566532;

        int count = 0;
        while (n > 0){
            int rem = n % 10;  //extracts the last digit of n
            if(rem == 5){
                count++;  //If the last digit (rem) is 5, we increase count.
            }
            n = n / 10;  //removes the last digit (shifts the number right).
        }
        System.out.println(count);
    }
}
