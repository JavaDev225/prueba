package resultadoa;
import java.util.Scanner;

    class NumeroAnalyzer {

    private int[] numeros;
    private int maximo;
    private int minimo;
    
    public NumeroAnalyzer(int cantidad) {
    
    numeros = new int[cantidad];
    maximo = Integer.MIN_VALUE;
    minimo = Integer.MAX_VALUE;
    
    }
    
    public void leerNumeros() {
    
    Scanner scanner = new Scanner(System.in);
    for(int i=0; i < 10; i++) { 
    
        System.out.println("Ingresa el numero a Evaluar");
        numeros[i] = scanner.nextInt();
        if(numeros[i] > maximo) {
        
        maximo = numeros[i];
        
        }
        if(numeros[i] < minimo) {
        
        minimo = numeros[i];
        }
    }
    scanner.close();
    }
    
    public int obtenerMaximo() {
    
        return maximo;
    }
        
    public int obtenerMinimo() {
    
    return minimo;
    }
       
}
