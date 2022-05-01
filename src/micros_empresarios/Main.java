package micros_empresarios;

public class Main {

    public static void main(String[] args) {

        Bus bus1 = new Bus(1000, 2,4);

        Apurado jefe = new Apurado("Pepito",true,false,TipoEmpleado.CLAUSTRO);

        Apurado apurado1 = new Apurado("Juan", false, false,TipoEmpleado.APURADO);
        Apurado apurado2 = new Apurado("Jose", false, false,TipoEmpleado.APURADO);

        System.out.println(bus1.getQuantitySeats() + " " + bus1.getQuantityStandUp());
        apurado1.up(bus1);
        System.out.println(bus1.getQuantitySeats() + " " + bus1.getQuantityStandUp());
        //obse.up(bus1);

        apurado2.up(bus1);

        jefe.up(bus1);
        System.out.println(bus1.getQuantitySeats() + " " + bus1.getQuantityStandUp());



        System.out.println(bus1.getQuantitySeats() + " " + bus1.getQuantityStandUp());


        bus1.imprimirListado();



    }
}
