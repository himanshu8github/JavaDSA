package JavaBasics;

public class Reverse {


    public static void main(String[] args) {

        int  num = 252314661;

        int ans = 0;

        while(num > 0){
            int rem = num % 10;  // get last digit
            num /= 10;           // remove last digit

            ans = ans * 10 + rem;  // build reverse
        }
        System.out.println(ans);
    }
}
