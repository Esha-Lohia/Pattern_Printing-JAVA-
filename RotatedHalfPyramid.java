package Pattern_Printing-JAVA-;
public class RotatedHalfPyramid {
  public static void main(String[] args){
    int n=5;
    //Outer Loop
    for(int i=1; i<=n; i++){
      //Inner Loop--spaces
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      //Inner Loop--stars
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
