package T1;
import java.util.Scanner;
public class Act4 {

	public static void main(String[] args) {
		act4p4();
	}




public static void act4p1() {
double nota1= 5.25;
double nota2= 7.85;
double nota3= 3.4;
double sumanotas= nota1+nota2+nota3;
double medianotas = sumanotas/3 +1;
System.out.println("Las notas del alumno son: " + nota1 + ", " + nota2 + ", " +nota3);
System.out.println(" La media de las notas es:" + medianotas);
}
public static void act4p2() {
	Scanner scanner = new Scanner(System.in);

    // Solicita un número
    System.out.print("Ingresa un número: ");
    int numero = scanner.nextInt();

    // Multiplica  por 2 utilizando un desplazamiento de bits
    int resultado = numero << 1;

    // Muestra el resultado
    System.out.println("El resultado de multiplicar " + numero + " por 2 utilizando un desplazamiento de bits es: " + resultado);

}

    
public static void act4p3() {
    System.out.print("Ingresa el primer número para la división: ");
    Scanner sc = new Scanner(System.in);
    int dividendo = sc.nextInt();

    System.out.print("Ingresa el segundo número para la división: ");
    int divisor = sc.nextInt();

    if (divisor != 0) {
        int cociente = dividendo / divisor;
        int resto = dividendo % divisor;
        System.out.println("El resultado de la división es: " + cociente);
        System.out.println("El resto de la división es: " + resto);
    } else {
        System.out.println("Error: No se puede dividir por cero.");
    }
}
public static void act4p4() {
	        long numeroMasGrande = Long.MAX_VALUE;
	        System.out.println("El número entero más grande posible es: " + numeroMasGrande);
	    }
	

}


