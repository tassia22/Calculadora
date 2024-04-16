package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opc = 0;
        do {
            System.out.println("1-realizar uma soma com adição");
            System.out.println("2-realizar uma soma com multiplicacao");
            System.out.println("3-realizar uma soma com subtracao");
            System.out.println("4-realizar uma soma com divisao");
            System.out.println("5-realizar uma soma com porcentagem");
            System.out.println("6-finalizar");
            opc = scan.nextInt();

            switch (opc){
                case 1:
                    adicao(scan);
                    break;
                case 2:
                    multiplicacao(scan);
                    break;
                case 3:
                    subtracao(scan);
                    break;
                case 4:
                    divisao(scan);
                    break;
                case 5:
                    divisao(scan);
                    break;
                case  6:
                default:
                    System.out.println("Calculo finalizado");
                    break;


            }

        }while (opc != 0);



        scan.close();

    }
    public static void adicao(Scanner scan){
        double result = 0.0;
        System.out.println("informe o primeiro e o segundo numero que deseja calcular");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        result = num1 + num2;
        System.out.println("resultado: "+result);

    }
    public static void multiplicacao(Scanner scan){
        double result = 0.0;
        System.out.println("informe o primeiro e o segundo numero que deseja calcular");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        result = num1 * num2;
        System.out.println("resultado: "+result);
    }
    public static void subtracao(Scanner scan){
        double result = 0.0;
        System.out.println("informe o primeiro e o segundo numero que deseja calcular");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        result = num1 - num2;
        System.out.println("resultado: "+result);
    }
    public static void divisao(Scanner scan){
        double result = 0.0;
        System.out.println("informe o primeiro e o segundo numero que deseja calcular");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        if (num2 != 0){
            result = num1 / num2;
        }
        else{
            System.out.println("erro ao dividir por zero");
        }

        System.out.println("resultado: "+result);

    }
    public static void porcentagem(Scanner scan){
        double result = 0.0;
        System.out.println("informe o primeiro e o segundo numero que deseja calcular");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        result = (num1 * num2) / 100;


    }


}