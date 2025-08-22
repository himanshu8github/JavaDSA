package BitManipulation;

public class Find_Nth_MagicNumber {
    public static void main(String[] args){

        int n = 3;
        int base = 5;
        int ans = 0;

        while(n > 0){
            int last = n & 1; // find last digit 0/1

            n = n >> 1; // it right shift, if last digit 0

            ans += last * base;  // if last=1 → add base value to ans
            base = base * 5;
        }
        System.out.println(ans);
    }
}

