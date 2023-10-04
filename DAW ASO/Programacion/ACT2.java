package Act2;
import java.util.Scanner;
import java.lang.Math;
import java.math.MathContext;
public class ACT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio2p5(); 
}
	public static void ejercicio2p1 () {
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce numero 1");
		int x = sc.nextInt();
		System.out.println("Introduce numero2");
		int y= sc.nextInt();
		System.out.println("La suma es "+ (x+y));
		System.out.println("La resta "+ (x-y));
		System.out.println("La multiplicacion es  "+ (x*y));


		}
public static void actividad2p2() {
Scanner teclado = new Scanner(System.in);
int numero = teclado.nextInt();
double resultado = Math.sqrt(numero);
System.out.println("La raiz cuadrada de " + numero + " es " + resultado);
}
public static void ejercicio2p3() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce base");
    int base = sc.nextInt();
    System.out.println("Introduce exponente");
    int exponente = sc.nextInt();
    System.out.println(base + " elevado a " + exponente + " es igual a " +Math.pow(base,exponente));
}
public static void actividad2p4 () {
    Scanner sc = new Scanner( System.in);
    System.out.println("Introduce lo que mide el radio de un circulo");
    int radio = sc.nextInt();

    System.out.println("El area del circulo es" +Math.PI*(radio*radio) );

}
public static void ejercicio2p5() {
	Scanner sc = new Scanner(System.in);
    System.out.println("Introduce radio de circunferencia");
    int radio = sc.nextInt();
    System.out.println("La longitud de la circunferncia es " +2 * Math.PI * radio);
}
}
