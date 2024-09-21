import java.util.Scanner;
public class Figura {
    Scanner scan = new Scanner(System.in);
    private String figura;
    private int id;

    public Figura(String figura, int id, int contador) {
        this.figura = figura;
        this.id = id;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void menu(){
        System.out.println("¿Qué figura geométrica desea crear?");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");
        System.out.println("4. Trapecio");
        System.out.println("5. Rombo");
        System.out.println("6. Paralelogramo");
        System.out.println("8. Fin Programa");
    }

    public void siguienteF() {
        boolean comprobar = true;
        while(comprobar){
            id++;
            menu();
            int opcion = scan.nextInt();
            if (opcion >= 1 && opcion < 9) {
                comprobar = leerDatos(comprobar, opcion);
            }
            else {
                System.out.println("Ingrese un valor valido");
                scan.next();
            }
        }
    }
    public boolean leerDatos(boolean comprobar, int opcion){
        if (opcion == 1) {
            System.out.println("Ingrese la base");
            int base = scan.nextInt();
            System.out.println("Ingrese la altura");
            int altura = scan.nextInt();
            Triangulo t = new Triangulo("Triangulo", 1, base, altura);
            t.calcular();
        }
        else if (opcion == 2) {
                System.out.println("Ingrese el lado");
                int lado = scan.nextInt();
                Cuadrado c = new Cuadrado("Cuadrado", 2, lado);
                c.calcular();
        }
        else if (opcion == 3) {
            System.out.println("Ingrese el 1lado1");
            int lado1 = scan.nextInt();
            System.out.println("Ingrese el lado2");
            int lado2 = scan.nextInt();
            Rectangulo r = new Rectangulo("Rectangulo", 3, lado1, lado2);
            r.calcular();
        }
        else if (opcion == 4) {
            System.out.println("Ingrese su a");
            int a = scan.nextInt();
            System.out.println("Ingrese su b");
            int b = scan.nextInt();
            System.out.println("Ingrese su h");
            int h = scan.nextInt();
            Trapecio tr = new Trapecio("Trapecio", 4, a, b, h);
            tr.calcular();
        }
        else if (opcion == 5) {
            System.out.println("Ingrese su dM");
            int dM = scan.nextInt();
            System.out.println("Ingrese su dMe");
            int dMe = scan.nextInt();
            Rombo ro = new Rombo("Rombo", 5, dM, dMe);
            ro.calcular();
        }
        else if (opcion == 6) {
            System.out.println("Ingrese su radio");
            int radio = scan.nextInt();
            Circulo ci = new Circulo("Circulo", 6, radio);
            ci.calcular();
        }
        else if (opcion == 7) {
            System.out.println("Ingrese su b");
            int b = scan.nextInt();
            System.out.println("Ingrese su h");
            int h = scan.nextInt();
            Paralelo p = new Paralelo("Paralelo", 6, b, h);
            p.calcular();
        }
        else if (opcion == 8){
            comprobar=false;
            System.out.println("Fin del Programa");
        }
        
        return comprobar;
    }
    public static void imprimir(String figura, int id,  double resultado) {
        System.out.println("La figura es: " + figura);
        System.out.println("El ID es: " + id);
        System.out.println("El área es: " + resultado);
        System.out.println("-----------------------------");
    }
    public double calcular() {
        return 0;
    }
}
