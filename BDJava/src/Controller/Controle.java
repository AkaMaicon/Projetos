/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import bdjava.Aluno;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.AlunoDAO;

/**
 *
 * @author aluno
 */


public class Controle {
    
    public void inserirAluno(int ra, String nome) throws SQLException
    {
        Aluno al = new Aluno(ra,nome);
        AlunoDAO alDao = new AlunoDAO();
        alDao.inserirAluno(al);
    }
    
    public ArrayList<Aluno> buscar () throws SQLException
{
    AlunoDAO alDao = new AlunoDAO();
    return (alDao.buscarAlunos());
}
    
    public void excluirAluno(int ra) throws SQLException
    {
        AlunoDAO alDao = new AlunoDAO();
        alDao.excluir(ra);
    }
}
