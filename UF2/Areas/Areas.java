import java.util.Scanner;
public class Areas {
    private Scanner scan = new Scanner(System.in);
    private boolean fin = false;
    public static void main(String[] args) {
        Aareas areas = new Aareas();
        areas.inicio();
    }
    public void inicio() {
        while (!fin) {
            menu();
            comprobar();
        }
    }
    public void menu() {
        System.out.println("Por favor seleccione la opción que guste");
        System.out.println("(1) Triangulo");
        System.out.println("(2) Cuadrado");
        System.out.println("(3) Rectangulo");
        System.out.println("(4) Trapecio");
        System.out.println("(5) Romblo");
        System.out.println("(6) Paralelogramo");
        System.out.println("(7) Circulo");
        System.out.println("(8) FIN");
    }
    public void comprobar() {
        if (scan.hasNextInt()) {
            int opcion = scan.nextInt();
            if (opcion >= 1 && opcion <= 8) {
                opciones(opcion);
            } 
            else {
                System.out.println("Ingrese una opción válida");
            }
        } 
        else {
            System.out.println("Ingrese una opción válida");
            scan.next();
        }
    }
    public void opciones(int opcion) {
        double area = 0;
        if (opcion == 1) {
            area = triangulo();
            mensajes(area);
        } 
        else if (opcion == 2) {
            area = cuadrado();
            mensajes(area);
        } 
        else if (opcion == 3) {
            area = rectangulo();
            mensajes(area);
        } 
        else if (opcion == 4) {
            area = trapecio();
            mensajes(area);
        } 
        else if (opcion == 5) {
            area = rombo();
            mensajes(area);
        } 
        else if (opcion == 6) {
            area = paralelogramo();
            mensajes(area);
        } 
        else if (opcion == 7) {
            area = circulo();
            mensajes(area);
        } 
        else if (opcion == 8) {
            System.out.println("PA CASA BOT");
            fin = true;
        }
    }
    public double triangulo() {
        System.out.println("Ingrese la base");
        double base = scan.nextDouble();
        System.out.println("Ingrese la altura");
        double altura = scan.nextDouble();
        double area = (base * altura) / 2;
        return area;
    }
    public double cuadrado() {
        System.out.println("Ingrese el primer lado del cuadrado");
        double lado1 = scan.nextDouble();
        System.out.println("Ingrese el segundo lado del cuadrado ");
        double lado2 = scan.nextDouble();
        double area = lado1 * lado2;
        return area;
    }
    public double rectangulo() {
        System.out.println("Ingrese el primer lado del Rectangulo");
        double lado1 = scan.nextDouble();
        System.out.println("Ingrese el segundo lado del Rectangulo ");
        double lado2 = scan.nextDouble();
        double area = lado1 * lado2;
        return area;
    }
    public double trapecio() {
        System.out.println("Ingrese la primera base");
        double base1 = scan.nextDouble();
        System.out.println("Ingrese la segunda base ");
        double base2 = scan.nextDouble();
        System.out.println("Ingrese la altura ");
        double altura = scan.nextDouble();
        double area = ((base1 + base2) / 2) * altura;
        return area;
    }
    public double rombo() {
        System.out.println("Ingrese la diagonal mayor");
        double may = scan.nextDouble();
        System.out.println("Ingrese la diagonal menor ");
        double men = scan.nextDouble();
        double area = (may * men) / 2;
        return area;
    }
    public double paralelogramo() {
        System.out.println("Ingrese la base");
        double base = scan.nextDouble();
        System.out.println("Ingrese la altura ");
        double altura = scan.nextDouble();
        double area = base * altura;
        return area;
    }
    public double circulo() {
        System.out.println("Ingrese el radio ");
        double radio = scan.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    public void mensajes(double area) {
        System.out.println("El area es: " + area);
    }
}

