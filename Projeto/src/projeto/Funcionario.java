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
public class Funcionario extends Pessoa implements IPessoa {
    private int CPF, salario;
    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCPF() {
        return CPF;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public void exibir() {
        System.out.println("Nome:"+ Nome);
        System.out.println("Idade:" + Idade);
        System.out.println("CPF:" + CPF);
        System.out.println("Salário:" + salario);
        System.out.println("Setor:" + setor);
    }
    
}
