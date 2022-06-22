package RepisaTriangular1.models;

public class Impresion {
    OperacionesMetodos operacionMetodo;

    public Impresion(OperacionesMetodos operacionMetodo) {this.operacionMetodo = operacionMetodo;}

    public void resultado(){System.out.println("El resultado es: " + operacionMetodo.area());}
}
