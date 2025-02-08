package PAKA;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int anioFabricacion;


    public Vehiculo(String matricula, String marca, String modelo, int anioFabricacion) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }


    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

  
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

 
    public void mostrarInformacion() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de Fabricación: " + anioFabricacion);
    }
}
