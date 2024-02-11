import java.util.Scanner;
public class Exe004 {
  public static void main(String[] args) {
    int meters, centimeters;

    Scanner keyBoard = new Scanner(System.in);

    System.out.println(" Digite um valor inteiro em metros");
    meters = keyBoard.nextInt();

    // processing

    centimeters = meters*100;

    // output

    System.out.println(" O valor em centimetros vale: "+ centimeters);

    keyBoard.close();


  }
}
