package servicios;

import entidades.Vehiculo;
import java.util.HashMap;
import java.util.Map;

public class CalcularImpuestoService {
    private static final double PORCENTAJE_DEPRECIACION = 0.10;

    public static double calcularImpuestoAnual(Vehiculo vehiculo, int anio) {
        double valorDepreciado = vehiculo.precio + (vehiculo.precio * PORCENTAJE_DEPRECIACION * (anio - vehiculo.modelo));
        return valorDepreciado * 0.10; // 10% del valor depreciado
    }

    public static Map<Integer, Double> calcularImpuestoHastaAnio(Vehiculo vehiculo, int anio) {
        double impuestoAcumulado = 0;
        Map<Integer, Double> impuestosPorAnio = new HashMap<>();

        // Calcular el impuesto acumulado hasta el año especificado
        for (int i = vehiculo.modelo; i <= anio; i++) {
            double impuestoAnual = calcularImpuestoAnual(vehiculo, i);
            impuestoAcumulado += impuestoAnual;
            impuestosPorAnio.put(i, impuestoAnual);
        }

        return impuestosPorAnio;
    }
}