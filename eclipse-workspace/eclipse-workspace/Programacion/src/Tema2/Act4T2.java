package Tema2;
import java.util.Scanner;

public class Act4T2 {

	public static void main(String[] args) {
ejercicio2();
	}

	public static void ejercicio2() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Cuantas medias quieres calcular");
	int calculosTotales = sc.nextInt();
	for (int i = 0; i< calculosTotales ; i++) {
		System.out.println("Dame una temperatura maxima");
	float tempMax = sc.nextInt();
	System.out.println("Dame una temperatura minima");
	float tempMin = sc.nextInt();
	System.out.println("En el dia" + i + "tenemos una temperatura media de: "+calcularMedia(tempMax, tempMin));
	
	}
	
}
	public static float calcularMedia(float temperaturaMin, float temperaturaMax) {
		return (temperaturaMax+temperaturaMin)/2;
		
	}
	
	
}
