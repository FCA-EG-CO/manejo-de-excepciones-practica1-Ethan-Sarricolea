import java.util.Scanner;

/**
 * Descripcion: Codigo de ejecucion de la aplicacion
 * Autor: @Ethan-Sarricolea
 * Fecha: 17/02/2025
 */

public class App {
    /**
     * Metodo de comparacion de los numeros
     * @param number        Numero a analizar
     * @return true         Si el numero es par
     * @throws Exception    Si el numero es impar
     */
    public static boolean isPar(int number) throws Exception{
        if (number%2 != 0){
            throw new Exception("Residuo en division");
        } else {
            return true;
        }
    }
    
    // Metodo main para ejecucion
    public static void main(String[] args) throws Exception {
        System.out.println(" ----- Coloca 0 para salir ------ ");
        int option;
        do {
            System.out.println("Coloca un numero entero:");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            try {
                System.out.println(isPar(option) ? "Numero par" : false);
            } catch (Exception e) {
                System.out.println("El numero es impar: " + e);
            }
        } while(option!=0);
    }
}
