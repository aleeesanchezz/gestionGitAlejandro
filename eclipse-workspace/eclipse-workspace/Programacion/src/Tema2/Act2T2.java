package Tema2;
import java.util.Scanner;
public class Act2T2 {

	public static void main(String[] args) {
E1();
	}
public static void E1() {
System.out.println("Introduzca un numero: ");
Scanner sc = new Scanner(System.in);
int numero = sc.nextInt();
if (numero>=0) {
	System.out.println("El cuadrado de " + numero + " es: " + numero * numero);
	}
else {
System.out.println("Usted ha introducido un numero negativo");
}
}
}
