package micros_empresarios;

import java.util.ArrayList;

public class Bus {
private float volume;
private ArrayList<Employee> Passengers;
private int quantitySeats;
private int quantityStandUp;

    public Bus(float volume, int quantitySeats, int quantityStandUp) {
        this.volume = volume;
        this.quantitySeats = quantitySeats;
        this.quantityStandUp = quantityStandUp;
        this.Passengers = new ArrayList<>();
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public ArrayList<Employee> getPassengers() {
        return Passengers;
    }

    public int getQuantitySeats() {
        return quantitySeats;
    }

    public void setQuantitySeats(int quantitySeats) {
        this.quantitySeats = quantitySeats;
    }

    public int getQuantityStandUp() {
        return quantityStandUp;
    }

    public void setQuantityStandUp(int quantityStandUp) {
        this.quantityStandUp = quantityStandUp;
    }

    public void passengerUp(Employee e){

        if (e.isSit()){
            setQuantitySeats(getQuantitySeats()-1);
        }
        else if (!e.isSit()) {
            setQuantityStandUp(getQuantityStandUp()-1);
        }
        this.Passengers.add(e);

    }

public void passengerDown(Employee e){
        this.Passengers.remove(e);
        if (e.isSit()){
            this.setQuantitySeats(getQuantitySeats()+1);
        }
        else {
            this.setQuantityStandUp(getQuantitySeats()+1);
        }
}



public Employee firstUp(){
    Employee firstUp = new Employee();

    return firstUp;
}

public void imprimirListado(){
    for (Employee e : Passengers) {

        System.out.println(e.getName());
    }
}

    }

