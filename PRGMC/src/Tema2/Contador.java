package Tema2;
public class Contador {
private String nombre;
private int contador;
	

public Contador (String nombre, int contador) {
	this.nombre=nombre;
	if (contador > 0 && contador <100) {
		this.contador = contador;
	}
	else {
		this.contador=0;
	}
}
public String getNombre() {
	return this.nombre;
}
public int getContador() {
	return this.contador;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public void setContador(int contador) {
	if (contador >0&&contador<100)
	this.contador=contador;

else {
	this.contador=0;
		}
	}	
public void incrementar() {
	if (contador <=100) {
		this.contador++;
	
	}
	}
public void decrementar () {
	if (contador>0) {
		this.contador--;

	}
}

public String mostrar () {
	return nombre + " - " +contador;
}
}