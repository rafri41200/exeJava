import java.util.Scanner;

public class Exe006 {
  public static void main(String[] args) {
    //variables
    float heigth, idealWeigth;

    Scanner keyBoard = new Scanner(System.in);

    //input
    System.out.println(" Digite qual a sua altura:");
    heigth = keyBoard.nextFloat();

    //processing
    idealWeigth = (float)(heigth * 72.7) - 58 ; // casting

    System.out.printf(" Seu peso ideal seria: %.2f", idealWeigth);

    keyBoard.close();

    //output


  }
}
