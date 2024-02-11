import java.util.Scanner;

public class Exe003 {
  public static void main(String[] args) {
    // input
    int add, num1, num2;

    Scanner keyBoard = new Scanner(System.in);

    System.out.println(" Digite o valor 1 :");
    num1 = keyBoard.nextInt();

    
    System.out.println(" Digite o valor 2 :");
    num2 = keyBoard.nextInt();

    // processing

    add = num1 + num2;

    System.out.println("A soma entre os números é: "+add);

    keyBoard.close();

  }

}
