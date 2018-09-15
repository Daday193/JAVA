//Retorno de Valores

	/*
		tipoRetorno nome(){
			return valor;
		};
	*/

class Retangulo{
	//Variáveis
	public int width, heigth;
	
	//Métodos com retorno
	public int areaTotal(){
		return width * heigth;
	}
	public boolean isQuadrado(){
		if(width == heigth)
			return true;
		return false;
	}
}
	
public class Main{
	
	public static void main(String[] args){
		
		Retangulo quadrado = new Retangulo();
		quadrado.width = 100;
		quadrado.heigth = 120;
		
		System.out.println(quadrado.areaTotal());
		//Retorna 12000
		System.out.println(quadrado.isQuadrado());
		//Retorn False.
		
		
		Retangulo quadrado2 = new Retangulo();
		quadrado2.width = 100;
		quadrado2.heigth = 100;
		
		System.out.println(quadrado2.areaTotal());
		//Retorna 10000
		System.out.println(quadrado2.isQuadrado());
		//Retorna True.
	}
}