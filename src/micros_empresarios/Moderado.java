package micros_empresarios;

public class Moderado extends Employee{
    private  int toleranciaLibres;

    public Moderado(String name, boolean isChief, boolean isSit, TipoEmpleado tipo, int toleranciaLibres) {
        super(name, isChief, isSit, tipo);
        this.toleranciaLibres = toleranciaLibres;
    }

    @Override
    public boolean up(Bus b) {
        if (b.getQuantitySeats() + b.getQuantityStandUp() > toleranciaLibres) {

            this.setSit(true);
            b.passengerUp(this);

        }
        return true;
    }
    @Override
    public void down(Bus b) {
        b.passengerDown(this);
    }
}
