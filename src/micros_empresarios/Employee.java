package micros_empresarios;

public class Employee {
    private String name;
    private Employee Chief;
    private boolean isChief;
    private boolean isSit;
    private TipoEmpleado tipo;

    public Employee(String name, Employee chief, boolean isChief, boolean isSit, TipoEmpleado tipo) {
        this.name = name;
        Chief = chief;
        this.isChief = true;
        this.isSit = false;
        this.tipo = tipo;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getChief() {
        return Chief;
    }

    public void setChief(Employee chief) {
        Chief = chief;
    }

    public boolean isChief() {
        return isChief;
    }

    public void setChief(boolean chief) {
        isChief = chief;
    }

    public boolean isSit() {
        return isSit;
    }

    public void setSit(boolean sit) {
        isSit = sit;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    public void up(Bus b){}

    public void down(Bus b){}


}
