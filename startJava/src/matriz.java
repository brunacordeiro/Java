import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("tamanho da matriz");
		int n = sc.nextInt();
		
		//instancia da matriz
		int [][] mat = new int [n][n];
		
		for(int i = 0; i < mat.length; i ++){		//linhas
			for (int j = 0; j < mat[i].length; j++){	//colunas
				System.out.print("Elemento " + i + "," + j + ": ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		//diagonal principal
		System.out.println("Diagonal principal");
		for(int i = 0; i < mat.length; i ++){
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		
	
		sc.close();
	}
}
