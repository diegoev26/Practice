import java.util.Scanner;

public class Nombres{ 
  public static void main (String args[]){ 

   String nombre_uno = "", nombre_dos = "";
   Scanner entrada = new Scanner(System.in);

   System.out.print("Ingrese nombre 1: ");
   nombre_uno = entrada.nextLine();

   System.out.print("Ingrese nombre 2: ");
   nombre_dos = entrada.nextLine();

   if(nombre_uno.equalsIgnoreCase(nombre_dos) ){
    System.out.println("Los nombres son iguales");
  } else{
    System.out.println("Los nombres son diferentes");
  }
 }
}