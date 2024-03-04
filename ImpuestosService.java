import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ImpuestosService {
    private static final String FILE_PATH = "vehiculos.bin";
    private static final double PORCENTAJE_DEPRECIACION = 0.1;

    public void registrarVehiculo(Vehiculo vehiculo) {
        try {
            List<Vehiculo> vehiculos = cargarVehiculos();
            vehiculos.add(vehiculo);
            guardarVehiculos(vehiculos);
        } catch (IOException e) {
            // Manejar la excepción de E/S (lectura/escritura de archivo)
            e.printStackTrace();
        }
    }

    public double calcularImpuestoAnual() {
        try {
            List<Vehiculo> vehiculos = cargarVehiculos();
            double totalImpuesto = 0;
            for (Vehiculo vehiculo : vehiculos) {
                totalImpuesto += vehiculo.getPrecio() * PORCENTAJE_DEPRECIACION;
            }
            return totalImpuesto;
        } catch (IOException | ClassNotFoundException e) {
            // Manejar la excepción de E/S (lectura/escritura de archivo)
            // o la excepción de clase no encontrada (para deserialización)
            e.printStackTrace();
            return 0; // o algún otro valor predeterminado
        }
    }

    // Métodos auxiliares para cargar y guardar vehículos en archivos binarios
}