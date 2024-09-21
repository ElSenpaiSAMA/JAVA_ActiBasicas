    public class Main {
        public static void main(String[] args){
            Figura f = new Figura("", 0);
            Triangulo t = new Triangulo("Triangulo",1, 4,5);
            Cuadrado c = new Cuadrado("Cuadrado", 2, 4);
            Rectangulo r = new Rectangulo("Rectangulo",3,4,6);
            Trapecio tr = new Trapecio("Trapecio",4,5,6,7);
            Rombo ro = new Rombo("Rombo",5,6,6);
            Paralelo p = new Paralelo("Paralelo",6,4,6);
            Circulo ci = new Circulo("Circulo",7,8);
            t.calcular();
            c.calcular();
            r.calcular();
            tr.calcular();
            ro.calcular();
            p.calcular();
            ci.calcular();
        }
    }
