package PAKA;

import java.util.ArrayList;
import java.util.List;

public class SistemaMatriculacion {
    private List<Vehiculo> vehiculos;  

    
    public SistemaMatriculacion() {
        vehiculos = new ArrayList<>();
    }

    
    public boolean matricularVehiculo(String matricula, String marca, String modelo, int anioFabricacion) {
      
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                System.out.println("Error: La matrícula ya está registrada.");
                return false; 
            }
        }

        
        Vehiculo nuevoVehiculo = new Vehiculo(matricula, marca, modelo, anioFabricacion);
        vehiculos.add(nuevoVehiculo);
        System.out.println("Vehículo matriculado con éxito.");
        return true;
    }

    
    public void consultarVehiculo(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.mostrarInformacion();
                return;
            }
        }
        System.out.println("Vehículo no encontrado.");
    }

   
    public boolean actualizarVehiculo(String matricula, String nuevaMarca, String nuevoModelo, int nuevoAnio) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setMarca(nuevaMarca);
                vehiculo.setModelo(nuevoModelo);
                vehiculo.setAnioFabricacion(nuevoAnio);
                System.out.println("Información del vehículo actualizada con éxito.");
                return true;
            }
        }
        System.out.println("Vehículo no encontrado para actualización.");
        return false;
    }

   
    public boolean eliminarVehiculo(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculos.remove(vehiculo);
                System.out.println("Vehículo eliminado con éxito.");
                return true;
            }
        }
        System.out.println("Vehículo no encontrado para eliminación.");
        return false;
    }

   
    public void mostrarTodosLosVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos matriculados.");
        } else {
            for (Vehiculo vehiculo : vehiculos) {
                vehiculo.mostrarInformacion();
                System.out.println("---------------------------");
            }
        }
    }
}
