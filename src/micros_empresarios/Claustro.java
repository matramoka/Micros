package micros_empresarios;

public class Claustro extends Employee{

    public Claustro(String name, boolean isChief, boolean isSit, TipoEmpleado tipo) {
        super(name, isChief, isSit, tipo);
    }

    public Claustro() {
    }

    @Override
    public boolean up(Bus b) {
        if (b.getQuantitySeats() > 0 && b.getVolume() > 120){

            this.setSit(true);
            b.passengerUp(this);

        }
        else if (b.getQuantityStandUp() > 0 && b.getVolume() > 120){

            b.passengerUp(this);
        }
        return true;

    }

    @Override
    public void down(Bus b) {
        super.down(b);
    }
}
