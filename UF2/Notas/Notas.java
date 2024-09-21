import java.util.Scanner;

public class CalcularNotas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CalcularNotas notas = new CalcularNotas();
        int[] datos = notas.leerDatos(scan);
        notas.menu();
        int opcion = scan.nextInt();
        notas.opciones(opcion, datos);
    }

    public void menu() {
        System.out.println("1. Calcular nota máxima");
        System.out.println("2. Calcular nota mínima");
        System.out.println("3. Calcular nota media");
        System.out.println("4. Imprimir notas");
        System.out.println("------------------");
    }

    public void opciones(int opcion, int[] notas) {
        if (opcion == 1) {
            System.out.println("La nota máxima es: " + calculaMax(notas));
        } 
        else if (opcion == 2) {
            System.out.println("La nota mínima es: " + calculaMin(notas));
        } 
        else if (opcion == 3) {
            System.out.println("La nota media es: " + calculaMedia(notas));
        } 
        else if (opcion == 4) {
            imprimir(notas);
        } 
        else {
            System.out.println("ERROR");
        }
    }

    public int[] leerDatos(Scanner scan) {
        System.out.print("Ingrese la cantidad de notas: ");
        int tamanio = scan.nextInt();
        int[] notas = new int[tamanio];
        
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scan.nextInt();
        }
        
        return notas;
    }

    public int calculaMax(int[] notas) {
        int max = notas[0];
        for (int nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    public int calculaMin(int[] notas) {
        int min = notas[0];
        for (int nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }

    public double calculaMedia(int[] notas) {
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        double resultado = sum / notas.length;
        return resultado;
    }

    public void imprimir(int[] notas) {
        System.out.println("Notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i] + " (" + palabra(notas[i]) + ")");
        }
    }

    public String palabra(int nota) {
        if (nota >= 0 && nota <= 4) {
            return "Suspenso";
        } 
        else if (nota == 5) {
            return "Aprobado";
        } 
        else if (nota == 6) {
            return "Bien";
        } 
        else if (nota >= 7 && nota <= 8) {
            return "Notable";
        } 
        else if (nota >= 9 && nota <= 10) {
            return "Sobresaliente";
        }
        else{
            return "Nota no válida";
        } 
    }
}
