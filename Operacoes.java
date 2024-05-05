/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Vitor Hugo
 */
public class Operacoes {
    public static double adicao(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    public static double subtracao(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    public static double multiplicacao(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public static double divisao(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return Double.NaN;
        } else {
            return numeroUm / numeroDois;
        }
    }

    public static double potencia(double numeroUm, double numeroDois) {
        return Math.pow(numeroUm, numeroDois);
    }

    public static double raizQuadrada(double numeroUm) {
        if (numeroUm < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return Double.NaN;
        } else {
            return Math.sqrt(numeroUm);
        }
    }
}
