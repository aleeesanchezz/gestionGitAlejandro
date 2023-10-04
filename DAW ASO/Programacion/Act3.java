package Act3;
import java.util.Scanner;
public class Act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
actividad3p4();
	}
public static void actividad3p1() {
	/**
	 * Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. 
	 * Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
	 */
System.out.println("Introduzca su nombre:");	
Scanner sc = new Scanner(System.in);
String nombre = sc.nextLine();
System.out.println("Bienvenido" + " " + nombre);
}

public static void actividad3p2() {
/**
 * 2-Pedir un password y comprobar si es igual que un String definido en el programa. 
 * Enseñar el resultado por pantalla.
 */
        String contraseñaCorrecta = "iescastelar2324";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la contraseña
        System.out.print("Por favor, ingresa la contraseña: ");
        String contraseñaIngresada = scanner.nextLine();

        // Verificar si la contraseña ingresada es igual a la contraseña predefinida
        if (contraseñaIngresada.equals(contraseñaCorrecta)) {
            System.out.println("Contraseña correcta. Acceso permitido.");
        } else {
            System.out.println("Contraseña incorrecta. Acceso denegado.");
        }

      
    }
	public static void actividad3p3() {
		
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una frase
        System.out.print("Por favor, ingrese una frase: ");
        String frase = scanner.nextLine();
        
        // Cerrar el objeto Scanner para evitar pérdida de recursos
        scanner.close();
        
        // Calcular la longitud de la frase
        int longitud = frase.length();
        
        // Obtener la primera letra de la frase
        char primeraLetra = frase.charAt(0);
        
        // Obtener la última letra de la frase
        char ultimaLetra = frase.charAt(longitud - 1);
        
        // Mostrar los resultados
        System.out.println("Longitud de la frase: " + longitud);
        System.out.println("Primera letra: " + primeraLetra);
        System.out.println("Última letra: " + ultimaLetra);
    }
	
	    public static void actividad3p4() {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);
	        
	        // Solicitar al usuario que ingrese la frase
	        System.out.print("Por favor, ingrese la frase: ");
	        String frase = scanner.nextLine();
	        
	        // Cerrar el objeto Scanner para evitar pérdida de recursos
	        scanner.close();
	        
	        // Buscar y mostrar el substring "amigo"
	        int inicio = frase.indexOf("amigo");
	        if (inicio != -1) {
	            String substringAmigo = frase.substring(inicio, inicio + 5); // "amigo" tiene 5 letras
	            System.out.println("Substring \"amigo\": " + substringAmigo);
	        } else {
	            System.out.println("No se encontro el substring \"amigo\" en la frase.");
	        }
	    }
	}
	







