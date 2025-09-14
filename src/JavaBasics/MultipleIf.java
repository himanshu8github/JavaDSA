package JavaBasics;

public class MultipleIf {
    public static void main(String[] args) {

        int salary = 20000;

        if(salary > 25000){
            salary += 5000;
        }else if(salary > 15000){
            salary += 2000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
