package Questao01.questao02.questao03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 3º Questão desafio Academia Capgemini 2022
 
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
 * podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
 * algoritmo que encontre o número de pares de substringtrings que são anagramas.
 */

public class anagrama
{
    public static void main(String[] args) 
    {
        String palavraRecebida = "ovo";
        ArrayList<String> lista = new ArrayList<String>();
        int totalAnagramas;
        lista = dividePalavra(palavraRecebida);        
        totalAnagramas = detectaAnagrama(lista);

        if(totalAnagramas == 0)
        {
            System.out.println("Não foram encontrados anagramas para a palavra informada!");
        }
        else
        {
            System.out.println("Foram encontrados " + totalAnagramas+" anagramas!");
        }
    }
    /**
     * 
     * @param palavra
     * @return retorna um ArrayList de String para o ArrayList lista, que será passada como parametro para a função seguinte
     */
    public static ArrayList<String> dividePalavra(String palavra) 
    {
        ArrayList<String> lista1 = new ArrayList<>();    	
        for(int repetidas = 0; repetidas<palavra.length();repetidas++) 
        {
            for (int substring = repetidas + 1; substring<= palavra.length();substring++) 
            {
                lista1.add(palavra.substring(repetidas,substring));
            }
        }    	
        return lista1;
    }
        /**
         * 
         * @param lista ArrayList lista passado como parametro pela função anterior
         * @return retorna um valor int que sera atribuido a variavel totalAnagramas
         */
    public static int detectaAnagrama(ArrayList<String> lista) 
    {
        int qtndAnagramas = 0;
        for(int repetidas = 0; repetidas<lista.size();repetidas++) 
        {
            for (int substring = repetidas + 1; substring< lista.size();substring++) 
            {
                char[] primLetra = lista.get(repetidas).toCharArray();
                char[] ultLetra = lista.get(substring).toCharArray();
                Arrays.sort(primLetra);
                Arrays.sort(ultLetra);
                if(Arrays.equals(primLetra, ultLetra)) 
                {
                    qtndAnagramas++;
                }
            }
        }
        return qtndAnagramas;
    }
}

    

