package Capitulo1;
import java.util.Scanner;
//exemplo 2.15 Comparação de números inteiros utilizando instruções if, operadores relacionais e operadores de igualdade
public class Comparison {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.println("digite um número para comparar:");
        numero1 = entrada.nextInt();

        System.out.println("digite o segundo numero para comparar:");
        numero2 = entrada.nextInt();
        entrada.close();
        if (numero1 == numero2)
            System.out.printf("O número %d é igual a %d %n",numero1,numero2);
        if (numero1 != numero2)
            System.out.printf("O número %d é diferente de %d %n",numero1,numero2);
        if (numero1 > numero2)
            System.out.printf("O número %d é maior que %d %n",numero1,numero2);
        if (numero1 < numero2)
            System.out.printf("O número %d é menor que %d %n",numero1,numero2);
        if (numero1 >= numero2)
            System.out.printf("O número %d é maior ou igual a %d %n",numero1,numero2);
        if (numero1 <= numero2)
            System.out.printf("O número %d é menor ou igual a %d %n",numero1,numero2);
        
    }
}
