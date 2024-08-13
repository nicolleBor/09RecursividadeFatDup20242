package controller;

public class FatorialDuplo {

	public FatorialDuplo() {
		super();
	}
	
	public int fatorialDuplo(int n) {
		//Condição de parada
		if(n == 0) {
			return 1;
		} else {
			//Chamada da função
			if(n%2 != 0) {
				return n * fatorialDuplo(n - 1); 
			} else {
				return fatorialDuplo(n-1);
			}
		}
	}

}
