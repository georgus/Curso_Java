package Recursividad;

public class Main {

	static long factorial(int n){
		
		if(n<=1){
			return 1;
		}else{
			long resultado = n*factorial(n-1);
			return resultado;
		}
		
	}
	
	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(factorial(5));
	}

}
