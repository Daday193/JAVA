/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerarquivostxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author daday
 */
public class LerArquivosTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader br = null;
           try {
            br = new BufferedReader (new FileReader ("C:\\Users\\daday\\Desktop\\SpedEcf-73395469000140-Original-dez2016.txt"));
               for (String linha = br.readLine(); 
                       linha != null; 
                       linha = br.readLine()) {
                // faça alguma coisa com a linha que você leu
        
        
        if(linha.contains("|J050|")){
        
        System.out.println(linha);
            System.out.println("|J051|");
            }
        }
            } catch (IOException ex) {
            } finally {
                try { if (br != null) br.close(); } catch (IOException ex) {}
            }
    }
    
}
