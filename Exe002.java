import java.util.Scanner;

public class Exe002 {
  public static void main(String[] args) {
    // input
    int minQt, maxQt, add;
    double averageStock;
    Scanner keyBoard = new Scanner(System.in);

    System.out.println(" DIGITE O VALOR DA QUANTIDADE MÁXIMA: ");
    minQt = keyBoard.nextInt();

    System.out.println(" DIGITE O VALOR DA QUANTIDADE MÍNIMA: ");
    maxQt = keyBoard.nextInt();

    // processing

    add = minQt + maxQt;
    averageStock = add / 2.0;

    // output 
    System.out.println(" O ESTOQUE MÉDIO É : "+averageStock);

    keyBoard.close();



    

  }
}
