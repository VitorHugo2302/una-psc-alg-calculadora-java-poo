/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Vitor Hugo
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        char opcao;

        do {
            System.out.println("Escolha uma operação:");
            System.out.println("A - Adição");
            System.out.println("S - Subtração");
            System.out.println("M - Multiplicação");
            System.out.println("D - Divisão");
            System.out.println("P - Potência");
            System.out.println("R - Raiz Quadrada");
            System.out.println("Q - Sair");

            opcao = Character.toUpperCase(scanner.next().charAt(0));

            if (opcao == 'Q') {
                System.out.println("Encerrando o programa.");
                break;
            }

            System.out.println("Digite o primeiro número:");
            double numeroUm = scanner.nextDouble();

            if (opcao != 'R') {
                System.out.println("Digite o segundo número:");
                double numeroDois = scanner.nextDouble();

                switch (opcao) {
                    case 'A':
                        System.out.println("Resultado: " + Operacoes.adicao(numeroUm, numeroDois));
                        break;
                    case 'S':
                        System.out.println("Resultado: " + Operacoes.subtracao(numeroUm, numeroDois));
                        break;
                    case 'M':
                        System.out.println("Resultado: " + Operacoes.multiplicacao(numeroUm, numeroDois));
                        break;
                    case 'D':
                        System.out.println("Resultado: " + Operacoes.divisao(numeroUm, numeroDois));
                        break;
                    case 'P':
                        System.out.println("Resultado: " + Operacoes.potencia(numeroUm, numeroDois));
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } else {
                System.out.println("Resultado: " + Operacoes.raizQuadrada(numeroUm));
            }
        } while (opcao != 'Q');

        scanner.close();
    }

}
