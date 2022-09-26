/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Conexao {
    public Connection getConnection(){
        String url = "jbdc:mysql://143.106.241.3:3306/cl201104";
        String usuario = "cl201104";
        String senha = "cl*23032005";
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Erro de conexão "+ ex.toString());
            exit (1);
            return null;
        }
    }
    
}
