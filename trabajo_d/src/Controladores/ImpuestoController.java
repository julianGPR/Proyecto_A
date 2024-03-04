package Controladores;

import entidades.Vehiculo;
import servicios.CalcularImpuestoService;
import java.util.Map;
import java.util.Scanner;

public class ImpuestoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del vehículo:");
        System.out.print("Municipio: ");
        String municipio = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Modelo: ");
        int modelo = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        Vehiculo vehiculo = new Vehiculo(municipio, precio, modelo, marca);

        // Calcular impuestos hasta el año 2025
        Map<Integer, Double> resultadoImpuestos = CalcularImpuestoService.calcularImpuestoHastaAnio(vehiculo, 2025);

        // Mostrar resultados
        System.out.println("El impuesto acumulado hasta el año 2025 es: " + resultadoImpuestos.values().stream().mapToDouble(Double::doubleValue).sum());

        System.out.println("Impuestos pagados por año:");
        for (Map.Entry<Integer, Double> entry : resultadoImpuestos.entrySet()) {
            System.out.println("Año " + entry.getKey() + ": " + entry.getValue());
        }
    }
}