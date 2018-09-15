//Parâmetros e Argumentos

	/*	- O método recebe Parâmetros:
		tipo nome(tipo parametro; tipo parametro2){
			corpo();
		};
		
		- Mas para invocar, recebe Argumentos:
		nome(argumento1,argumento2);
	*/

//Classe
class Calculo{
	//Função com parâmetros
	Void soma(int num1, int num2){
		System.out.println(num1 + num2);
		//Vai imprimir 30 pois 5+25 = 30.
	}
}
	
public class Main{
	public static void main(String[] args){
		Calculo cal = new Calculo();
		cal.soma(5,25);
	}
}
	
