import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();
        try{
            contar(numero, numero2);
        } catch (OperacaoInvalida e) {
            System.out.println(e + " - O segundo numero deve ser maior que o primeiro!");
        }
            
        input.close();
    }

    static void contar(int numero, int numero2) throws OperacaoInvalida {
        if(numero > numero2)  {
            throw new OperacaoInvalida();
        } else {
            for(int i = 1; numero < numero2; i++) {
                System.out.println("Ocorrencia " + i);
                numero++;
            }
        }
    }
}
