import java.util.Scanner;

public class Exe005 {
  public static void main(String[] args) {
    // variables
    int workedHours;
    float hourlyRate, totalSalary;

    Scanner keyBoard = new Scanner(System.in);

    // input
    System.out.println(" Qual o valor por hora trabalhada?");
    hourlyRate = keyBoard.nextFloat();

    System.out.println(" Quantas horas trabalhadas?");
    workedHours = keyBoard.nextInt();

    // porcessing
    totalSalary = (hourlyRate * workedHours);

    // output
    System.out.println("o Valor total do salário é: " + totalSalary);

    keyBoard.close();

  }
}
