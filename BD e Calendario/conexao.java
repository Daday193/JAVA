package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexao {
  
 
public static String base="db_loja";


    private static Connection conexao;
    public conexao()
    { try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          String url = "jdbc:odbc:myodbc;database="+base+";user=sa;password=";
          
          conexao = DriverManager.getConnection(url);
          System.out.println("conexao ok");        
          
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,
          "Ocorreu um erro de conexão. Verifique a Base de Dados indicada !"+"\n" +  erro.getMessage(),"Conexão",3);
            erro.printStackTrace();
        }
    }

    // Mtodos pblicos:
    public Connection getConexao()
    {
        return conexao;
    }


}
