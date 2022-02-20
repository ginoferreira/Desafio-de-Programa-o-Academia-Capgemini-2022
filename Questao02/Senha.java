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

public class Senha {
    
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } 
}
