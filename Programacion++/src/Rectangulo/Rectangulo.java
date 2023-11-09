package Rectangulo;

public class Rectangulo {
    int ancho;
    int alto;

    public Rectangulo(int ancho, int alto) {
        if (ancho >= 5 && ancho <= 10) {
            this.ancho = ancho;
        } else
            System.out.println("Ancho no valido para este ejercicio.");
        if (alto >= 5 && alto <= 10) {
            this.alto = alto;
        } else
            System.out.println("Alto no valido para este ejercicio.");
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho >= 5 && ancho <= 10) {
            this.ancho = ancho;
        }

    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        if (ancho >= 5 && ancho <= 10) {
            this.ancho = ancho;
        }
    }

    public int calcularArea() {
        int area = this.ancho * this.alto;
        return area;
    }

    @Override
    public String toString() {
        String rectangulo = "";
        for(int i=0; i<alto; i++) {
            for(int j=0; j<ancho; j++) {
                rectangulo += "x";

            }
            rectangulo += "\n";
        }
        return rectangulo;
    }
}
