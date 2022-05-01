package micros_empresarios;

public class Main {

    public static void main(String[] args) {

        Bus bus1 = new Bus(1000, 2,1);

        Apurado jefe =new Apurado("Pepito",null,true,false,TipoEmpleado.CLAUSTRO);

        Apurado apurado1 = new Apurado("Juan", jefe , false, false,TipoEmpleado.APURADO);
        Apurado apurado2 = new Apurado("Jose", null, false, false,TipoEmpleado.APURADO);
        Claustro claustro1 = new Claustro("Lio", null, true, false,TipoEmpleado.CLAUSTRO);

        System.out.println(bus1.getQuantitySeats() + " " + bus1.getQuantityStandUp());

        apurado1.up(bus1);
        System.out.println(bus1.getQuantitySeats() + " " + bus1.getQuantityStandUp());
        claustro1.up(bus1);

        //System.out.println(bus1.getQuantitySeats() + " " + bus1.getQuantityStandUp());


        System.out.println(bus1.getQuantitySeats() + " " + bus1.getQuantityStandUp());
        claustro1.up(bus1);

        bus1.imprimirListado();



    }
}
