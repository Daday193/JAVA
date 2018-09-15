package arquivoctxt;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ArquivocTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String direct = null;
        direct = JOptionPane.showInputDialog("Onde está o arquivo?");
        
		/*
		DOCUMENT: Esta classe representa um documento xml inteiro, esta pode conter apenas um elemento que é denominado root, comentários e outros elementos de definição.

		ELEMENT: Esta classe representa um elemento XML, um elemento XML também conhecido como nó é pode conter outros elementos, atributos e comentários além é claro de um valor.

		ATTRIBUTE: Esta classe representa um atributo que pode ser atribuido a um elemento.

		COMMENT: Esta classe representa um comentário em XML, os comentários em XML são representados com a seguinte sintaxe
		<!-- valor -->.
		*/
		
        try{
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            Document doc = builder.parse(direct);
            
            //LEITURA DE DADOS DO EMITENTE
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas = doc.getElementsByTagName("emit");
            
            //Recebe o tamanho da Lista
            int tamanhoLista = listaDePessoas.getLength();
            
            for (int i = 0; i < tamanhoLista; i++) {
                
                Node noPessoa = listaDePessoas.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    //Peguei o número da Nota Fiscal
                    //String nome = elementoPessoa.getAttribute("Id");
                    System.out.println("DADOS EMITENTE:");
                    //System.out.println("Número da Nota : " + nome);
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "CNPJ":
                                      
                                      System.out.println("CNPJ Emitente: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "xNome":
                                      
                                      System.out.println("Nome Emitente: " + elementoFilho.getTextContent());
                                      break; 
                                
                                                                      
                            }
                                
                        }
                        
                    }
                    
                }
            }
        
            //LEITURA DO ENDEREÇO DO EMITENTE
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas1 = doc.getElementsByTagName("enderEmit");
            
            //Recebe o tamanho da Lista
            int tamanhoLista1 = listaDePessoas1.getLength();
            
            for (int i = 0; i < tamanhoLista1; i++) {
                
                Node noPessoa = listaDePessoas1.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "xLgr":
                                      
                                      System.out.println("Rua Emitente: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "nro":
                                      
                                      System.out.println("Número Emitente: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "xBairro":
                                      
                                      System.out.println("Bairro Emitente: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "xMun":
                                      
                                      System.out.println("Municipio Emitente: " + elementoFilho.getTextContent());
                                      break; 
                                                                     
                            }
                        }
                        
                    }

                }
            }  
            
             //LEITURA DE DADOS DO DESTINATÁRIO
             System.out.println("\n");
             System.out.println("DADOS DESTINATÁRIO:");
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas2 = doc.getElementsByTagName("dest");
            
            //Recebe o tamanho da Lista
            int tamanhoLista2 = listaDePessoas2.getLength();
            
            for (int i = 0; i < tamanhoLista2; i++) {
                
                Node noPessoa = listaDePessoas2.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "CNPJ":
                                      
                                      System.out.println("CNPJ Emitente: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "xNome":
                                      
                                      System.out.println("Nome Emitente: " + elementoFilho.getTextContent());
                                      break; 
                                                                     
                            }
                        }
                        
                    }

                }
            }
            
            //LEITURA DO ENDEREÇO DO DESTINATÁRIO
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas3     = doc.getElementsByTagName("enderDest");
            
            //Recebe o tamanho da Lista
            int tamanhoLista3 = listaDePessoas3.getLength();
            
            for (int i = 0; i < tamanhoLista3; i++) {
                
                Node noPessoa = listaDePessoas3.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "xLgr":
                                      
                                      System.out.println("Rua Destinatário: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "nro":
                                      
                                      System.out.println("Número Destinatário: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "xBairro":
                                      
                                      System.out.println("Bairro Destinatário: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "xMun":
                                      
                                      System.out.println("Municipio Destinatário: " + elementoFilho.getTextContent());
                                      break; 
                                                                     
                            }
                        }
                        
                    }

                }
            }  
            
            //LEITURA DOS PRODUTOS
            System.out.println("\n");
            System.out.println("PRODUTOS");
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas4     = doc.getElementsByTagName("prod");
            
            //Recebe o tamanho da Lista
            int tamanhoLista4 = listaDePessoas4.getLength();
            
            for (int i = 0; i < tamanhoLista4; i++) {
                
                Node noPessoa = listaDePessoas4.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "xProd":
                                      
                                      System.out.println("Descrição: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "CFOP":
                                      
                                      System.out.println("Número CFOP: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "qCom":
                                      
                                      System.out.println("Quantidade: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "vProd":
                                      
                                      System.out.println("Valor Produto: " + elementoFilho.getTextContent());
                                      break; 
                                
                                 case "vUnTrib":
                                      
                                      System.out.println("Valor Tributação: " + elementoFilho.getTextContent());
                                      break; 
                                
                            }
                        }
                        
                    }

                }
            }     
            
            
            //LEITURA DA TRIBUTAÇÃO
            System.out.println("\n");
            System.out.println("ICMS");
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas5     = doc.getElementsByTagName("ICMS00");
            
            //Recebe o tamanho da Lista
            int tamanhoLista5 = listaDePessoas5.getLength();
            
            for (int i = 0; i < tamanhoLista5; i++) {
                
                Node noPessoa = listaDePessoas5.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "CST":
                                      
                                      System.out.println("CST: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "modBC":
                                      
                                      System.out.println("Mod Bs.Calculo: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "vBC":
                                      
                                      System.out.println("Vlr Bs.Calculo: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "pICMS":
                                      
                                      System.out.println("Percent. ICMS: " + elementoFilho.getTextContent());
                                      break; 
                                
                                 case "vICMS":
                                      
                                      System.out.println("Valor ICMS: " + elementoFilho.getTextContent());
                                      break; 
                                
                            }
                        }
                        
                    }

                }
            }  
            
            //LEITURA DA TRIBUTAÇÃO
            System.out.println("\n");
            System.out.println("PIS");
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas6 = doc.getElementsByTagName("PISAliq");
            
            //Recebe o tamanho da Lista
            int tamanhoLista6 = listaDePessoas6.getLength();
            
            for (int i = 0; i < tamanhoLista6; i++) {
                
                Node noPessoa = listaDePessoas6.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "CST":
                                      
                                      System.out.println("CST: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "vBC":
                                      
                                      System.out.println("Vlr Bs.Calculo: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "pPIS":
                                      
                                      System.out.println("Percent. PIS: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "vPIS":
                                      
                                      System.out.println("Valor PIS: " + elementoFilho.getTextContent());
                                      break; 
                                
                                 
                            }
                        }
                        
                    }

                }
            }  
               
            
            //LEITURA DA TRIBUTAÇÃO
            System.out.println("\n");
            System.out.println("COFINS");
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas7 = doc.getElementsByTagName("COFINSAliq");
            
            //Recebe o tamanho da Lista
            int tamanhoLista7 = listaDePessoas7.getLength();
            
            for (int i = 0; i < tamanhoLista7; i++) {
                
                Node noPessoa = listaDePessoas7.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "CST":
                                      
                                      System.out.println("CST: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "vBC":
                                      
                                      System.out.println("Vlr Bs.Calculo: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "pCOFINS":
                                      
                                      System.out.println("Percent. COFINS: " + elementoFilho.getTextContent());
                                      break; 
                                
                                case "vCOFINS":
                                      
                                      System.out.println("Valor COFINS: " + elementoFilho.getTextContent());
                                      break; 
                                
                                 
                            }
                        }
                        
                    }

                }
            }  
            
            
            //LEITURA DA TRIBUTAÇÃO
            System.out.println("\n");
            System.out.println("IPI");
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas8 = doc.getElementsByTagName("IPI");
            
            //Recebe o tamanho da Lista
            int tamanhoLista8 = listaDePessoas8.getLength();
            
            for (int i = 0; i < tamanhoLista8; i++) {
                
                Node noPessoa = listaDePessoas8.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "cEnq":
                                      
                                      System.out.println("Enquadramento: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "IPINT":
                                      
                                      System.out.println("CST: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                 
                            }
                        }
                        
                    }

                }
            }  
           
            
            //TOTAL DA TRIBUTAÇÃO
            System.out.println("\n");
            System.out.println("TOTAL TRIBUTAÇÃO");
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas9 = doc.getElementsByTagName("ICMSTot");
            
            //Recebe o tamanho da Lista
            int tamanhoLista9 = listaDePessoas9.getLength();
            
            for (int i = 0; i < tamanhoLista9; i++) {
                
                Node noPessoa = listaDePessoas9.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "vBC":
                                      
                                      System.out.println("Vlr. BC: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "vICMS":
                                      
                                      System.out.println("Vlr. ICMS: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "vProd":
                                      
                                      System.out.println("Vlr. Prod: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                      
                                case "vIPI":
                                      
                                      System.out.println("Vlr. IPI: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                      
                                 case "vPIS":
                                      
                                      System.out.println("Vlr. PIS: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                      
                                 case "vCOFINS":
                                      
                                      System.out.println("Vlr. COFINS: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                      
                                 case "vNF":
                                      
                                      System.out.println("Vlr. NF: " + elementoFilho.getTextContent());
                                      break;                   
                                     
                            }
                        }
                        
                    }

                }
            }  
            
            
            //TRASPORTADORA
            System.out.println("\n");
            System.out.println("TRANSPORTADORA");
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas10 = doc.getElementsByTagName("transporta");
            
            //Recebe o tamanho da Lista
            int tamanhoLista10 = listaDePessoas10.getLength();
            
            for (int i = 0; i < tamanhoLista10; i++) {
                
                Node noPessoa = listaDePessoas10.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "CNPJ":
                                      
                                      System.out.println("CNPJ: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "xNome":
                                      
                                      System.out.println("NOME: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "IE":
                                      
                                      System.out.println("Insc. Estadual: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                      
                                case "xEnder":
                                      
                                      System.out.println("Endereço: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                      
                                 case "xMun":
                                      
                                      System.out.println("Municipio: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                      
                                 case "UF":
                                      
                                      System.out.println("UF: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                     
                            }
                        }
                        
                    }

                }
            }  
            
            //VOLUME TRANSPORTADO
            System.out.println("\n");
            System.out.println("PROD.TRANSPORTADOS");
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas11 = doc.getElementsByTagName("vol");
            
            //Recebe o tamanho da Lista
            int tamanhoLista11 = listaDePessoas11.getLength();
            
            for (int i = 0; i < tamanhoLista11; i++) {
                
                Node noPessoa = listaDePessoas11.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "qVol":
                                      
                                      System.out.println("Quantidade: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "esp":
                                      
                                      System.out.println("Descrição: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "marca":
                                      
                                      System.out.println("Marca: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                      
                                case "pesoL":
                                      
                                      System.out.println("PesoL: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                      
                                 case "pesoB":
                                      
                                      System.out.println("PesoB: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                     
                            }
                        }
                        
                    }

                }
            }  
            
            //COBRANÇA
            System.out.println("\n");
            System.out.println("COBRANÇA");
            
            //Cria Lista de acordo com a TAG.
            NodeList listaDePessoas12 = doc.getElementsByTagName("dup");
            
            //Recebe o tamanho da Lista
            int tamanhoLista12 = listaDePessoas12.getLength();
            
            for (int i = 0; i < tamanhoLista12; i++) {
                
                Node noPessoa = listaDePessoas12.item(i);
                
                if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                    Element elementoPessoa = (Element) noPessoa;
                    
                    
                    //'getChildNodes' pega todos os nós filhos
                    NodeList listaDeFilhosDaPessoa = elementoPessoa.getChildNodes();
                    
                    int tamanhoListaFilhos = listaDeFilhosDaPessoa.getLength();
                    
                    for (int j = 0; j < tamanhoListaFilhos; j++) {
                        
                        Node noFilho = listaDeFilhosDaPessoa.item(j);
                        
                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            
                            //Convertendo tipo Nó para tipo Elemento.
                            Element elementoFilho = (Element) noFilho;
                            
                            switch(elementoFilho.getTagName()){
                                
                                case "nDup":
                                      
                                      System.out.println("Nº Duplicata: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "dVenc":
                                      
                                      System.out.println("Data vencimento: " + elementoFilho.getTextContent());
                                      break;                   
                                
                                case "vDup":
                                      
                                      System.out.println("Vlr. Duplicata: " + elementoFilho.getTextContent());
                                      break;                   
                                   
                            }
                        }
                        
                    }

                }
            }  
            
            
        } catch (SAXException | IOException | ParserConfigurationException ex) {
            Logger.getLogger(ArquivocTxt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
