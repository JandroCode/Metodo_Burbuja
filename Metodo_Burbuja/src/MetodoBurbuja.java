import java.util.Scanner;

public class MetodoBurbuja {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int aux = 0;
		
		
		System.out.println("Indique el tamaño del array");
		
		int tam = sc.nextInt();
		
		int numeros[] = new int[tam];
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Introduzca el elemento " +(i+1)+ " del array");
			numeros[i] = sc.nextInt();
		}
		
		//Método Burbuja
		for(int i=0;i<numeros.length-1;i++) {
			for(int j=0;j<numeros.length-1;j++) {
				if(numeros[j] > numeros[j+1]) {
					aux =numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
			}
		}
		System.out.println("Array ordenado de manera creciente");
		for(int i:numeros) {
			System.out.print(i + " ");
		}
		
		System.out.println(" ");
		System.out.println("Array ordenado de manera decreciente");
		for(int i = numeros.length-1;i>=0;i--) {
			System.out.print(numeros[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
