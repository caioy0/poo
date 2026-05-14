import java.util.Scanner;
public class somardoisnumeros {
    public static void main (String[] args){
        //declaracao de variaveis
        Scanner leitor = new Scanner(System.in); //System.in System.out System.err
        //int a;
        //int b;
        //int soma;
        int a,b,resultadoDaSoma;
        
        //entrada de dados
        System.out.println("Digite um valor");
        a = leitor.nextInt();
        System.out.println("Digite outro valor");
        b = leitor.nextInt();
        
        //processamento
        resultadoDaSoma = a + b;

        //saida
        //3 + 4 = 7
        //System.out.println(a + " + " + b + "=" + resultadoDaSoma);
        System.out.printf("%d + %d = %d\n", a, b, resultadoDaSoma);

    }
}