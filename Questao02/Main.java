package Questao01.questao02;

/**
 * 2º Questão desafio Academia Capgemini 2022
 * Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes critérios:
 * Possui no mínimo 6 caracteres.
 * Contém no mínimo 1 digito.
 * Contém no mínimo 1 letra em minúsculo.
 * Contém no mínimo 1 letra em maiúsculo.
 * Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
 */

public class Main {
    public static void main(String[] args) { //Simulando página de cadastro
        Senha paswrd = new Senha();

        paswrd.setSenha("Ya3&ab");
        System.out.println(senhaSegura(paswrd.getSenha()));
    }
/**
 * 
 * @param senhaInformada 
 */
    public static String senhaSegura(String senhaInformada)
    {
        String[] caractesp = {"!","@","#","$","%","^","&","*","(",")","-","+"};
        if(senhaInformada.length() < 6)
        {
            System.out.println("A senha precisa de no minimo 6 caracteres!\n");
            System.out.println("Insira números, letras maiúsculas/minúsculas ou caracteres especiais !@#$%^&*()-+");
            return "Adicione mais "+(6-senhaInformada.length())+" caracteres para deixar sua senha mais segura";
        }
        else
        {
            int mai=0,min=0,let=0,dig=0,car=0;
            char[] senha = senhaInformada.toCharArray();
            for(char x : senha)
            {
                if(Character.isUpperCase(x) == true){mai += 1;}
                if(Character.isLowerCase(x) == true){min += 1;}
                if(Character.isAlphabetic(x) == true){let += 1;}
                if(Character.isDigit(x) == true){dig += 1;}
                for(String carac : caractesp)
                {
                    if(carac.equals(String.valueOf(x)))
                    {
                        car += 1;
                    }
                }
           }
           if(mai>=1 && min>=1 && let>=1 && dig>=1 && car>=1)
           {
               return "Senha Forte";
           }
           else
           {
               System.out.println("Insira números, letras maiúsculas/minúsculas ou caracteres especiais !@#$%^&*()-+");
               return "Senha Fraca";
           }
        }
    }
}