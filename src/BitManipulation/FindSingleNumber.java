package BitManipulation;

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 4, 2, 5, 1, 2, 4, 6, 5, 6,88};

        int unique = 0; // XOR identity element
        for (int num : arr) {
            unique ^= num; // XOR will cancel out duplicates
        }

        System.out.println("The single number is: " + unique);
    }
}
