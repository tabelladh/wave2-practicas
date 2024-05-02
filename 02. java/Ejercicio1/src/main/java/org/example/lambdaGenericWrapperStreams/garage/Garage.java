package org.example.lambdaGenericWrapperStreams.garage;
import java.util.ArrayList;
import java.util.List;

class Garage {
    private Integer id;
    private List<Vehiculo> vehiculos;

    public Garage() {
    }

    public Garage(Integer id) {
        this.id = id;
        this.vehiculos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
}