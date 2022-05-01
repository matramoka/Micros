package micros_empresarios;

public class Apurado extends Employee {


    public Apurado(String name, Employee chief, boolean isChief, boolean isSit, TipoEmpleado tipo) {
        super(name, chief, isChief, isSit, tipo);
    }

    public Apurado() {
    }

    @Override
    public String getName() {
        return super.getName();
    }



    @Override
    public void up(Bus b) {
        if (b.getQuantitySeats() > 0){

            this.setSit(true);
            b.passengerUp(this);

        }
        else if (b.getQuantityStandUp() > 0){

            b.passengerUp(this);
        }
        //exception;
    }

    @Override
    public void down(Bus b) {
       b.passengerDown(this);
    }
}
