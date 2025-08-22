package BitManipulation;

public class Find_NoOfDigit_inBaseB {
    public static void main(String[] args) {

        int n = 18;
        int b = 2;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
            }
}
