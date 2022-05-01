package micros_empresarios;

public class Claustro extends Employee{

    public Claustro(String name, String chief, boolean isChief, boolean isSit, TipoEmpleado tipo) {
        super(name, chief, isChief, isSit, tipo);
    }

    public Claustro() {
    }

    @Override
    public void up(Bus b) {
        if (b.getQuantitySeats() > 0 && b.getVolume() > 120){

            this.setSit(true);
            b.passengerUp(this);

        }
        else if (b.getQuantityStandUp() > 0 && b.getVolume() > 120){

            b.passengerUp(this);
        }
    }

    @Override
    public void down(Bus b) {
        super.down(b);
    }
}
