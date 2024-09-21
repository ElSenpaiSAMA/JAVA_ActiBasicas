public class Encargo {
    private int dia;
    private int mes;
    private int hora;
    private int minuto;

    public Encargo(int dia, int mes, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getDia(int dia2) {
        dia2 = dia;
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes( int mes2) {
        mes2= mes;
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getHora(int hora2) {
        hora2 = hora;
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto(int minuto2) {
        minuto2 = minuto;
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void aniadirPro(Peticion p){

    }
    public void eliminarPro(Peticion p){

    }

}
