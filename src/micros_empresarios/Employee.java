package micros_empresarios;

public class Employee {
    private String name;
    private boolean isChief;
    private boolean isSit;
    private TipoEmpleado tipo;

    public Employee(String name, boolean isChief, boolean isSit, TipoEmpleado tipo) {
        this.name = name;
        this.isChief = isChief;
        this.isSit = isSit;
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

    public boolean up(Bus b){
        return false;
    }

    public void down(Bus b){}

}
