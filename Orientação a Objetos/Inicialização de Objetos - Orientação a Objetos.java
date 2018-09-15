//Inicialização de Objetos - Inicialização padrão das variáveis.

class Janela{
	int largura, altura;
	boolean b;
	float f;
	double d;
	//Construtor
	Janela(int l, int a){
		largura = l;
		altura = a;
	}
	//Sobrecarga de Construtor
	Janela(){

		System.out.println("Int = "+largura); // Vai imprimir 0
		System.out.println("bool = "+b); // Vai imprimir false
		System.out.println("float = "+f); // Vai imprimir 0.0
		System.out.println("double = "+d); // Vai imprimir 0.0
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
		//Vai imprimir: 0, porque o JAVA já inicia em 0.
	}
}

