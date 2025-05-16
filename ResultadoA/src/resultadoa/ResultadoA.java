
package resultadoa;


public class ResultadoA {

    
    public static void main(String[] args) {
        
        NumeroAnalyzer analizador = new NumeroAnalyzer(10);
        analizador.leerNumeros();
        System.out.println("El numero mayor es " + analizador.obtenerMaximo());
        System.out.println("El numero menor es " + analizador.obtenerMinimo());
    }
    
}
