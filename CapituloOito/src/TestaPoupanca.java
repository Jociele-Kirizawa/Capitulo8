import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaPoupanca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Poupanca P1 = new Poupanca(2000);
        Poupanca P2 = new Poupanca(3000);

        System.out.println("Atualmente a taxa anual é 4% ao ano.\n Caso você queira uma nova taxa, aperte 0.\nOu qualquer techa para continuar");
        String resposta = scan.next();


            if (resposta.equalsIgnoreCase("0")) {
                System.out.println("Escreva a nova taxa de Juros");
                double x = scan.nextDouble();


                for (int i = 1; i <= 12; i++) {
                    double R = P1.modifyInterestRate(x);

                    System.out.printf("P1 - O Juros no mes %d, foi de %.1f.", i, R);
                    System.out.println(" ");

                    double R2 = P2.modifyInterestRate(x);

                    System.out.printf("P2 - O Juros no mes %d, foi de %.1f . ", i, R2);
                    System.out.println(" ");
                }


            } else {
                for (int i = 1; i <= 12; i++) {
                    double R = P1.calculateMonthlyInterest();
                    // acumuladoP1 += R;
                    System.out.printf("P1 - O Juros no mes %d, foi de %.1f.", i, R);
                    System.out.println(" ");

                    double R2 = P2.calculateMonthlyInterest();

                    System.out.printf("P2 - O Juros no mes %d, foi de %.1f . ", i, R2);
                    System.out.println(" ");
                }
//InputMismatchException

            }

        }

    }

