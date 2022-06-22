package RepisaTriangular1.models;

import java.util.Scanner;

public class LecturaDatos {
    private double a, b, c;

    public void leerDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = teclado.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = teclado.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        c = teclado.nextDouble();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
