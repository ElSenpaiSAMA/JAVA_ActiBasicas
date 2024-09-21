import java.util.Scanner;

public class Prediccion {

    private Scanner scan = new Scanner(System.in);
    private String mesNacimiento = "";

    public static void main(String[] args) {
        Prediccion programa = new Prediccion();
        programa.iniciar();
    }

    public void iniciar() {
        menu();
        Nombre();
        Edad(mesNacimiento);
    }

    public void menu() {
        System.out.println("Por favor, escribe el mes en que naciste:");
        System.out.println("1. Enero\t2. Febrero\t3. Marzo");
        System.out.println("4. Abril\t5. Mayo\t\t6. Junio");
        System.out.println("7. Julio\t8. Agosto\t9. Septiembre");
        System.out.println("10. Octubre\t11. Noviembre\t12. Diciembre\n");
        mesNacimiento = scan.nextLine();
        Equipo(mesNacimiento);
        LenguajeP(mesNacimiento);
    }

    public String Nombre() {
        String nom = "";
        boolean valido = false;
        System.out.println("¿Cómo te llamas?");
        while (!valido) {
            nombreElegido = scan.nextLine();
            if (!nombreElegido.isEmpty()) {
                valido = true;
            } 
            else {
                System.out.println("Por favor, ingresa un nombre válido.");
            }
        }
        return nom;
    }

    public int Edad(String mesNacimiento) {
        System.out.println("\nPor último, ¿cuántos años tienes?");
        int edad = 0;
        boolean valido = false;
        while (!valido) {
            if (scan.hasNextInt()) {
                edad = scan.nextInt();
                valido = true;
            } 
            else {
                System.out.println("Por favor, ingresa una edad válida.");
                scan.next();
            }
        }
        NumeroSuerte(edad, mesNacimiento);
        return edad;
    }

    public String Equipo(String mesNacimiento) {
        String equipoFutbol = "";
        if (mesNacimiento.equalsIgnoreCase("Enero")) {
            equipoFutbol = "Bayern de Múnich";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Febrero")) {
            equipoFutbol = "Atlético de Madrid";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Marzo")) {
            equipoFutbol = "Chelsea";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Abril")) {
            equipoFutbol = "Manchester City";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Mayo")) {
            equipoFutbol = "Liverpool";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Junio")) {
            equipoFutbol = "Real Madrid";
        }
        else if (mesNacimiento.equalsIgnoreCase("Julio")) {
            equipoFutbol = "BVB";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Agosto")) {
            equipoFutbol = "FCB";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Septiembre")) {
            equipoFutbol = "Juve";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Octubre")) {
            equipoFutbol = "PSG";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Noviembre")) {
            equipoFutbol = "Sevilla CF";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Diciembre")) {
            equipoFutbol = "Manchester United";
        } else {
            equipoFutbol = "";
        }
        return equipoFutbol;
    }

    public String LenguajeP(String mesNacimiento) {
        String lenguaje = "";
        if (mesNacimiento.equalsIgnoreCase("Enero")) {
            lenguaje = "C++";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Febrero")) {
            lenguaje = "Python";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Marzo")) {
            lenguaje = "JavaScript";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Abril")) {
            lenguaje = "Node.js";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Mayo")) {
            lenguaje = "React";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Junio")) {
            lenguaje = "C#";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Julio")) {
            lenguaje = "Swift";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Agosto")) {
            lenguaje = "Java";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Septiembre")) {
            lenguaje = "PHP";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Octubre")) {
            lenguaje = "R";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Noviembre")) {
            lenguaje = "Go";
        } 
        else if (mesNacimiento.equalsIgnoreCase("Diciembre")) {
            lenguaje = "Ruby";
        } 
        else {
            lenguajeProgramacion = "ERROR";
        }
        return lenguaje;
    }

    public double NumeroSuerte(int edad, String mesNacimiento) {
        double numSuerte = 0;
        if (mesNacimiento.equalsIgnoreCase("Enero")) {
            numSuerte = edad * 3 / 2;
        } 
        else if (mesNacimiento.equalsIgnoreCase("Febrero")) {
            numSuerte = edad - 4;
        } 
        else if (mesNacimiento.equalsIgnoreCase("Marzo")) {
            numSuerte = edad / 2;
        } 
        else if (mesNacimiento.equalsIgnoreCase("Abril")) {
            numSuerte = edad % 4;
        } 
        else if (mesNacimiento.equalsIgnoreCase("Mayo")) {
            numSuerte = edad * 3 / 6;
        } 
        else if (mesNacimiento.equalsIgnoreCase("Junio")) {
            numSuerte = edad + edad;
        } 
        else if (mesNacimiento.equalsIgnoreCase("Julio")) {
            numSuerte = edad * edad / 5;
        } 
        else if (mesNacimiento.equalsIgnoreCase("Agosto")) {
            numSuerte = edad * 1 / 2 * edad;
        } 
        else if (mesNacimiento.equalsIgnoreCase("Septiembre")) {
            numSuerte = edad / edad;
        } 
        else if (mesNacimiento.equalsIgnoreCase("Octubre")) {
            numSuerte = edad * 4 / 3;
        }
        else if (mesNacimiento.equalsIgnoreCase("Noviembre")) {
            numSuerte = edad % 2 + 23;
        } 
        else if (mesNacimiento.equalsIgnoreCase("Diciembre")) {
            numSuerte = (edad + edad) / 2;
        } 
        else {
            numSuerte = 0;
        }
        return numSuerte;
    }
}
