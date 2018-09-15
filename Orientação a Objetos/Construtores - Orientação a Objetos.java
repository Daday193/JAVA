//Construtores - São responsáveis pela inicialização dos Obejtos e tem o mesmo nome da Classe.

class Janela{
	int largura, altura;
	//Construtor
	public Janela(int l, int a){
		largura = l;
		altura = a;
	}
	//Função
	void imprimir(){
		System.out.println("Altura = "+altura+", a Largura = "+largura);
	}
}

public class Main{
	
	public static void main(String[] args){
		Janela j = new Janela(250,250);
		j.imprimir();
		//Vai imprimir: (Altura = 250, a Largura = 250).
	}
}

