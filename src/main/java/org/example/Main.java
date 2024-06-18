package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // exe();
        // exe2();
        //exe3();
        //exe4(15)
       // exe5("100");
       // exe6();
        exe7(5);
    }

    public static void exe() {
        System.out.println(((25.5 * 3.5) - (3.5 * 3.5)) / (40.5 - 4.5));

    }

    public static void exe2() {
        Scanner numero = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        System.out.println("Digite o primeiro numero: ");
        num1 = numero.nextInt();
        System.out.println("Digite o segundo numero : ");
        num2 = numero.nextInt();
        System.out.println("Digite o terceiro numero : ");
        num3 = numero.nextInt();
        System.out.println("Digite o quarto numero : ");
        num4 = numero.nextInt();
        System.out.println("Digite o quinto numero : ");
        num5 = numero.nextInt();
        System.out.println("Media de cinco numero é : " + ((num1 + num2 + num3 + num4 + num5) / 5));
    }

    public static void exe3() {
        int decimalNumber = 16;
        String hexadecimal = Integer.toHexString(decimalNumber).toUpperCase();
        System.out.println("O número decimal " + decimalNumber + " em hexadecimal é " + hexadecimal);
    }

    public static void exe4(int n) {
        int[] octaNum = new int[100];
        int i = 0;
        while (n != 0) {
            octaNum[i] = n % 8;
            n = n / 8;
            i++;
        }

        for (int j = i - 1; j >= 0; j--)
            System.out.print(octaNum[j]);
    }

    public static int exe5(@NotNull String binario) {
        int decimal = 0;
        int comprimento = binario.length();

        // Percorrer cada bit começando do final
        for (int i = 0; i < comprimento; i++) {
            // Pegar o bit atual (da direita para a esquerda)
            char bitChar = binario.charAt(comprimento - 1 - i);
            // Converter o char para int (0 ou 1)
            int bit = Character.getNumericValue(bitChar);
            // Calcular o valor do bit na posição i
            decimal += bit * Math.pow(2, i);

        }

        System.out.println("O número binário " + binario + " é igual a " + decimal + " em decimal.");
        return decimal;
    }
    public static void exe6(){
    String input = "A realidade é meramente uma ilusão, embora muito persistente–(Albert Einstein)";
        int letras = 0;
        int espacos = 0;
        int numeros = 0;
        int outros = 0;

        // Percorrer cada caractere na string de entrada
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isWhitespace(c)) {
                espacos++;
            } else {
                outros++;
            }
        }

        // Exibir os resultados
        System.out.println("A string é: " + input);
        System.out.println("letra: " + letras);
        System.out.println("espaço: " + espacos);
        System.out.println("número: " + numeros);
        System.out.println("outro: " + outros);
    }
    public static void exe7(int n){

        String numeroComoString = Integer.toString(n);

        // Formar "nn" e "nnn"
        String nn = numeroComoString + numeroComoString;
        String nnn = numeroComoString + numeroComoString + numeroComoString;

        // Converter "nn" e "nnn" de volta para inteiros
        int nnInt = Integer.parseInt(nn);
        int nnnInt = Integer.parseInt(nnn);

        // Calcular o resultado final
        int resultado = n + nnInt + nnnInt;
        System.out.println("O resultado de " + n + " + " + n + n + " + " + n + n + n + " é: " + resultado);

    }
}