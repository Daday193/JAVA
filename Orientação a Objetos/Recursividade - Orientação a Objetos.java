//Recursividade - Uma situação onde uma rotina invoca a si mesma.

class Fatorial{
	int fat(int n){
		if(n<=1) //Nossa condição básica.
			return 1;
		int r = fat(n-1)*n;
			return r;
		
	}
}

public class Main{
	
	public static void main(String[] args){
		System.out.println(new Fatorial().fat(6));
		//Vai apresentar um fatorial de 720.
	}

}
