package RepisaTriangular1;
import RepisaTriangular1.models.Impresion;
import RepisaTriangular1.models.LecturaDatos;
import RepisaTriangular1.models.OperacionesMetodos;

public class RepisaTriangular {
    public static void main(String[] args) {
        LecturaDatos leerDatos = new LecturaDatos();
        OperacionesMetodos operacionMetodo = new OperacionesMetodos(leerDatos);
        Impresion impresion = new Impresion(operacionMetodo);
        leerDatos.leerDatos();
        impresion.resultado();
    }
}
