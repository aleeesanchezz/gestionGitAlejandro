package Tema2;
import java.util.Scanner;
public class Act4T2 {

	public static void main(String[] args) {
ejercicio3();
	}

	
	public static void ejercicio1() {
		/**EJERCICIO1
		 * * Crea una función que pida dos número enteros al usuario y diga si alguno de ellos es múltiplo del otro. 
		 * Crea una función EsMultiplo que reciba los dos números, y devuelve si el primero es múltiplo del segundo.
		 */
		System.out.println("Introduzca el primer numero:");
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero:");
		int numero2 = sc.nextInt();
		int resto = numero1%numero2;
		if (resto==0)
			System.out.println("El numero " +  numero1 + " es multiplo de " + numero2);
		else
			System.out.println("El numero " +  numero1 + " NO es multiplo de " + numero2);
		}
	public static void ejercicio2() {
		/*
		 * Crear una función que calcule la temperatura media de un día a partir de la temperatura máxima y mínima. 
		 * Crear otra función, que utilizando la anterior, vaya pidiendo la temperatura máxima y mínima de cada día y vaya mostrando la media. 
		 * El programa pedirá el número de días que se van a introducir.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas medias quieres calcular");
		int calculosTotales = sc.nextInt();
		for (int i = 0; i< calculosTotales ; i++) {
			System.out.println("Dame una temperatura maxima");
		float tempMax = sc.nextInt();
		System.out.println("Dame una temperatura minima");
		float tempMin = sc.nextInt();
		System.out.println("En el dia " + i + " tenemos una temperatura media de: "+calcularMedia(tempMax, tempMin) + " grados");
		
		}
		
	}
		public static float calcularMedia(float temperaturaMin, float temperaturaMax) {
			return (temperaturaMax+temperaturaMin)/2;
			
		}
		
		
		
	public static void ejercicio3() {
		/*
		 * Crea un función “ConvertirEspaciado”, que reciba como parámetro un texto y devuelve una cadena con un espacio adicional tras cada letra. Por ejemplo, 
		 * “Hola, tú” devolverá “H o l a , t ú “. Crea una función donde se utilice, pidiendo un texto por teclado
		 */
			        Scanner scanner = new Scanner(System.in);
			        System.out.print("Ingrese un texto: ");
			        String texto = scanner.nextLine();
			        String textoConEspaciado = ConvertirEspaciado(texto);
			        System.out.println("Texto con espaciado adicional: " + textoConEspaciado);
			    }

	  public static String ConvertirEspaciado(String texto) {
			        String resultado = "";
			        for (int i = 0; i < texto.length(); i++) {
			            char caracter = texto.charAt(i);
			            if (i > 0) {
			                resultado += " ";
			            }
			            resultado += caracter;
			        }
			        return resultado;
			    }
			    
			    /**
			     *  public static void ejercicio4() {
		  	/*
    	 * Diseñar una función que calcule el área y el perímetro de una circunferencia. 
    	 * Utilízala en otra función que lea el radio de una circunferencia y muestre su área y perímetro.
			 	Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un texto: ");
			 	 public static double calcularPerimetro() {
	    	
	    		return 2*Math.PI*radio;
	    	}
	    	public static double calcularArea(float radio) {
	    		return Math.PI*Math.pow(radio, b:2);
	    	}
			    }
			 	 */
	    	
	    	
	    	    
	   
	    public static void ejercicio5() {
	    	Scanner sc = new Scanner(System.in);
	    	boolean loginCorrecto=false;
	    	for (int i=3;i>0&&!loginCorrecto;i++); {
	    		String usuario = sc.nextLine();
	    		String pass = sc.nextLine();
	    		if (login(usuario, pass, i)){
	    			System.out.println("Login correcto");
	    			loginCorrecto=true;
	    			
	    		}
	    		else {
	    			System.out.println("Login incorrecto, quedan " + i + "intentos");
	    		}
	    	}
	    	
	    	
	    	public static boolean login(String usuario, String pass, int intentos) {
	    	boolean loginCorrecto=false;
	    		if (intentos > 0) {
	    			if (usuario.equals("usuario1") && pass.equals("asdasd"))
	    				loginCorrecto=true;
	    		}
	    	}
	    	
	    }
			}



		

