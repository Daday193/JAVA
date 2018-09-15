
									  //Criar TXT como banco de dados
            
       
                                       try{
                                          BufferedWriter arq = new BufferedWriter(new FileWriter("C:/Users/daday/Documents/Teste.txt",true));
                                       try (PrintWriter gravaarq = new PrintWriter(arq)) {
                                          gravaarq.println((elementoFilho.getTextContent()) + "\r\n");
                                               }
                
                                         }catch(IOException erro){
                
                                        }
                                      