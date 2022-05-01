package micros_empresarios;

public class Apurado extends Employee {


    public Apurado(String name, boolean isChief, boolean isSit, TipoEmpleado tipo) {
        super(name, isChief, isSit, tipo);
    }

    public Apurado() {
    }

    @Override
    public String getName() {
        return super.getName();
    }



    @Override
    public boolean up(Bus b) {

        if (b.getQuantitySeats() > 0){
                System.out.println("Subio se sento "+ this.getName());

                this.setSit(true);
                b.passengerUp(this);

        }
        else if (b.getQuantityStandUp() > 0){
            System.out.println("Subio se quedo parado"+ this.getName());

            b.passengerUp(this);
        }
        return  true;
    }

    @Override
    public void down(Bus b) {
       b.passengerDown(this);
    }
}
