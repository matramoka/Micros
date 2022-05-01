package micros_empresarios;

public class Moderado extends Employee{
    private  int toleranciaLibres;

    public Moderado(String name, String chief, boolean isChief, boolean isSit, TipoEmpleado tipo, int toleranciaLibres) {
        super(name, chief, isChief, isSit, tipo);
        this.toleranciaLibres = toleranciaLibres;
    }

    @Override
    public void up(Bus b) {
        if (b.getQuantitySeats() + b.getQuantityStandUp() > toleranciaLibres) {

            this.setSit(true);
            b.passengerUp(this);

        }
    }
    @Override
    public void down(Bus b) {
        b.passengerDown(this);
    }
}
