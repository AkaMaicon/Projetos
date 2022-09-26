/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa implements IPessoa {
    private int CPF, numCadastro, numCelular;

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getNumCadastro() {
        return numCadastro;
    }

    public void setNumCadastro(int numCadastro) {
        this.numCadastro = numCadastro;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }
    

    @Override
    public void exibir() {
        System.out.println("Nome:"+ Nome);
        System.out.println("Idade:" + Idade);
        System.out.println("CPF:" + CPF);
        System.out.println("Número de cadastro:" + numCadastro);
        System.out.println("Número de celular:" + numCelular);
    }
    
}
