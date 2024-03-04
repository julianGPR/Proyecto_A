import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/impuestos")
public class ImpuestosController {

    @Autowired
    private ImpuestosService impuestosService;

    @PostMapping("/registrarVehiculo")
    public String registrarVehiculo(@RequestBody Vehiculo vehiculo) {
        impuestosService.registrarVehiculo(vehiculo);
        return "Vehículo registrado correctamente";
    }

    @GetMapping("/calcularImpuestoAnual")
    public double calcularImpuestoAnual() {
        return impuestosService.calcularImpuestoAnual();
    }
}