package micros_empresarios;

public class Fiaca extends Employee{

    public Fiaca(String name,  boolean isChief, boolean isSit, TipoEmpleado tipo) {
        super(name,  isChief, isSit, tipo);
    }

    @Override
    public boolean up(Bus b) {
        if (b.getQuantitySeats() > 0 ){

            this.setSit(true);
            b.passengerUp(this);
            return true;

        }
        return true;

    }

    @Override
    public void down(Bus b) {
        b.passengerDown(this);
    }
}
