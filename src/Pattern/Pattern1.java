package Pattern;

public class Pattern1 {


      public static void main(String[] args){

          int rows = 4;
          int cols = 4;

          for(int i = 0; i < rows; i++){
//              System.out.println("- ");
              for(int j = 0; j < cols; j++){
                  System.out.print(" * ");
              }
              System.out.println(" ");
          }
      }
}
