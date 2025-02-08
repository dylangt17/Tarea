package PAKA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaMatriculacion sistema = new SistemaMatriculacion();

        
        while (true) {
            System.out.println("\n--- Sistema de Matriculación ---");
            System.out.println("1. Matricular un vehículo");
            System.out.println("2. Consultar un vehículo");
            System.out.println("3. Actualizar vehículo");
            System.out.println("4. Eliminar vehículo");
            System.out.println("5. Mostrar todos los vehículos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1: 
                    System.out.print("Ingrese matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Ingrese marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese año de fabricación: ");
                    int anioFabricacion = scanner.nextInt();
                    scanner.nextLine();  

                    sistema.matricularVehiculo(matricula, marca, modelo, anioFabricacion);
                    break;

                case 2:
                    System.out.print("Ingrese matrícula a consultar: ");
                    String matriculaConsulta = scanner.nextLine();
                    sistema.consultarVehiculo(matriculaConsulta);
                    break;

                case 3: 
                    System.out.print("Ingrese matrícula del vehículo a actualizar: ");
                    String matriculaActualizar = scanner.nextLine();
                    System.out.print("Ingrese nueva marca: ");
                    String nuevaMarca = scanner.nextLine();
                    System.out.print("Ingrese nuevo modelo: ");
                    String nuevoModelo = scanner.nextLine();
                    System.out.print("Ingrese nuevo año de fabricación: ");
                    int nuevoAnio = scanner.nextInt();
                    scanner.nextLine(); 

                    sistema.actualizarVehiculo(matriculaActualizar, nuevaMarca, nuevoModelo, nuevoAnio);
                    break;

                case 4: 
                    System.out.print("Ingrese matrícula del vehículo a eliminar: ");
                    String matriculaEliminar = scanner.nextLine();
                    sistema.eliminarVehiculo(matriculaEliminar);
                    break;

                case 5:
                    sistema.mostrarTodosLosVehiculos();
                    break;

                case 6:
                    System.out.println("¡Hasta luego!");
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
