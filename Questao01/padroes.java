package Questao01;

/**
 * 1º Questão desafio Academia Capgemini 2022
 * 
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
 * A base e altura da escada devem ser iguais ao valor de n. 
 * A última linha não deve conter nenhum espaço.
 */

public class padroes
{
    public static void main(String[] args) 
    {
        int qtndEstrelas = 6;
        for(int indiceExt = 1; indiceExt <= qtndEstrelas;indiceExt++)
        {
            for(int indiceInt = 1;indiceInt<=indiceExt;indiceInt++){System.out.print("*");}
            System.out.println("");
        }
    }
}
