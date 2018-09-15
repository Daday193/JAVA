/*Palavra chave - this - 

A instrução this é uma palavra-chave que sempre estará apontando para o objeto 
em memória. A mesma é uma forma de nos referirmos ao objeto em questão sem 
chama-lo pelo seu nome. */

class Janela{
	int largura, altura;

	//Construtor com mesmo nome da Classe.
	Janela(int largura, int altura){
		this.largura = largura;
		this.altura = altura;
	}
	//Sobrecarga de Construtor
	Janela(){
		//Se não for especificada largura nem altura.
		this(100,100);
		System.out.println("Int = "+largura); // Vai imprimir 0 se não colocar o this.
		
	}
	//Função
	void imprimir(){
		System.out.println("Altura = "+altura+", a Largura = "+largura);
	}
}

public class Main{
	
	public static void main(String[] args){
		Janela j = new Janela();
		j.imprimir();
		//Vai imprimir: 100, porque o JAVA já inicia em 0.
	}
}


