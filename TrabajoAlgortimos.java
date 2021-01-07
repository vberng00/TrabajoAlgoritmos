import java.util.Scanner;

public class trabajoAlgoritmos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el numero de pacientes presentes en el consultorio: ");
		int n = scan.nextInt();
		int A[] = new int[n]; 
		System.out.println("Introduzca las edades de los pacientes separados por un espacio: ");
		for(int i = 0; i < n; i++)
		{
			A[i] = scan.nextInt();
		}
		scan.close();
		int vectorOrdenado[] = new int[n];
		vectorOrdenado = insertionSort(A, n);
		System.out.println("El vector ordenado es: ");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(vectorOrdenado[i]+" ");
		}
	}

	private static int[] insertionSort(int[] A, int n) {
		int x;
		int k;
		for(int i = 1; i < n ; i++)
		{
			x = A[i];
			k = i - 1;
			
			while((k >= 0) && (A[k] > x))
			{
				A[k + 1] = A[k];
				k = k - 1;
			}
			
			A[k + 1] = x;
		}
		return A;
	}

}
