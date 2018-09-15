/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author daday
 */
public class TestarConexao{
    
    
    
    public static void main(String[] args) throws Exception {
        try {
            Conexao con = new Conexao();
            System.out.println("Conexão Ok!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
       
        
    }
    
}
