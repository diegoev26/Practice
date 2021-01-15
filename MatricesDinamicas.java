import java.util.Scanner;
public class MatricesDinamicas{
    public static void main(String args[]){
        int Filas = 0, Columnas = 0, Contador = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese numero de filas: ");
        Filas = in.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        Columnas = in.nextInt();
        int numeros[][] = new int[Filas][Columnas];
        for(int j = 0; j < Filas; j++){
            for(int i = 0; i < Columnas; i++){
                numeros[j][i] = Contador;
                Contador++;
                System.out.print("[" + numeros[j][i] + "]");
            }
            System.out.println("");
        } 
    }
}