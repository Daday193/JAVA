//Overloading - Sobrecarga de Métodos

/*
	int meuMetodo(int num1){
	}
	int meuMetodo(float fnum){
	}
	int meuMetodo(int num1,int num2){
	}
*/

class Sobrecarga{
	void imprime(String s){
		System.out.println(s);
	}
	void imprime(String s1, String s2){
		System.out.println(s1+"-"+s2);
	}
	void imprime(String s1, int i1){
		System.out.println(s1+"-"i1);
	}
}

public class Main{
	
	public static void main(String[] args){
		//Sobrecarga scarga1 = new Sobrecarga();
		//Sobrecarga scarga2 = new Sobrecarga();
		//Sobrecarga scarga3 = new Sobrecarga();
		
		//Melhor fazer assim:
		new Sobrecarga().imprime("Um parametro do tipo String");
		new Sobrecarga().imprime("Primeiro parametro","Segundo parametro");
		new Sobrecarga().imprime("A idade é de: ", 25);
	
	}
}