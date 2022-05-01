package micros_empresarios;

public class Fiaca extends Employee{

    public Fiaca(String name, String chief, boolean isChief, boolean isSit, TipoEmpleado tipo) {
        super(name, chief, isChief, isSit, tipo);
    }

    @Override
    public void up(Bus b) {
        if (b.getQuantitySeats() > 0 ){

            this.setSit(true);
            b.passengerUp(this);

        }
    }

    @Override
    public void down(Bus b) {
        b.passengerDown(this);
    }
}
