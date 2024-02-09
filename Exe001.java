import java.util.Scanner;

public class Exe001 {

    public static void main(String[] args) {

        int num1, num2, add, multi;
        Scanner keyBoard = new Scanner(System.in);
        // INPUT
        System.out.println(" Digite um valor inteiro:");

        num1 = keyBoard.nextInt();

        System.out.println(" Digite outro valor inteiro:");

        num2 = keyBoard.nextInt();

        // PROCESSING

        add = num1 + num2;
        multi = num1 * add;

        // OUTPUT

        System.out.println(" O Resultado da multiplicação é: " + multi);

    }
}
