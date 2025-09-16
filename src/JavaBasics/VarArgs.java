package JavaBasics;



import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(5,256,56,5,56,56,56,1,21,1212,11,1);
//        multiple(2, 3, "rakhi", "Rahul", "dvytsbhusc");
//        demo();
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
