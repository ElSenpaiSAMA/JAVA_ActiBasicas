public class Main {
    public static void Main(String[] args){

        //Sucursal
        Sucursal s1 = new Sucursal("Sucursal", "849567679", "ssss", "a@a.com");
        s1.getNombre("SALOMONES");
        s1.getDireccion("bac de rosas");
        s1.getEmail("jaimito@gmail.com");
        s1.getTelefo("666666");

        //Transportista
        Transportista t1 = new Transportista("AV", "FE");
        Transportista t = new Transportista(5);
        t.getDireccion("carrer de bac de roda");
        t.getLicencia(44);
        t.getNombre("PABLINHO");

        //Encargo
        Encargo enc = new Encargo(10,11, 14, 45 );
        enc.getDia(6);
        enc.getMes(6);
        enc.getHora(21);
        enc.getMinuto(56);

        //Tipos
        Tipos tp = new Tipos("deus", 45, 25.5, 6, true);
        tp.getNombre("Deus");
        tp.getStock(8);
        tp.getNumID(44);
        tp.getValor(55.5);

        //Cliente
        Cliente cli = new Cliente("Pablo", "carrer de mar", "6767676767", "aaa@aaa.com");
        cli.getNombre("San");
        cli.getEmail("bb@bb.com");
        cli.getTelefo("55555555");
        cli.getDireccion("Carrer de VIVI");

        //Peticion
        Peticion p = new Peticion(8);
        p.getPedido(4);


    }
}
