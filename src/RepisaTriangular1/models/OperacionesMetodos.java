package RepisaTriangular1.models;

public class OperacionesMetodos {
    LecturaDatos leerDatos;
    public OperacionesMetodos(LecturaDatos leerDatos) {
        this.leerDatos = leerDatos;
    }

    public double p(){
        double p;
        p=(leerDatos.getA()+ leerDatos.getB()+ leerDatos.getC())/2;
        return p;
    }

    public double area(){
        double resultado;
        resultado = Math.sqrt(p()*(p()- leerDatos.getA())*(p()- leerDatos.getB())*(p()- leerDatos.getC()));
        return resultado;
    }
}
