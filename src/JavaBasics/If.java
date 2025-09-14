package JavaBasics;

public class If {
    public static void main(String[] args){

        int salary = 25500;

        if(salary > 30000){
            salary += 5000;
        }else{
            salary += 3000;
        }
        System.out.println(salary);
    }
}
