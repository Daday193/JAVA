/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author daday
 */
public class Conexao {
    private Connection conexao;
    public Conexao() throws Exception{
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        String url="jdbc:jtds:sqlserver://THIAGO-PC:1433/TMTST12";
        conexao = DriverManager.getConnection(url,"sa","totvs@2015");
    }
    public Connection getConexao(){
        return conexao;
    }
}
