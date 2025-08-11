package Pattern_Printing-JAVA-;
import java.util.Scanner;
public class InvertedPyramidNumb {
  public static void main(String[] args) {
    for(int i=1; i<=5; i++){
      //Inner Loop
      for(int j=1;j<=5-i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
}
}
