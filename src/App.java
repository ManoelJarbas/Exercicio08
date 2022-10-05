import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora? ");
        double valor = sc.nextDouble();

        System.out.println("Quantas horas você trabalha no mês? ");
        int hora = sc.nextInt();

        double salario;
        salario = hora * valor;
        System.out.println("O seu salário é de R$ " + salario);
        
    }
}
