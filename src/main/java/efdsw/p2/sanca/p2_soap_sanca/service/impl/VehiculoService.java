package efdsw.p2.sanca.p2_soap_sanca.service.impl;

import efdsw.p2.sanca.p2_soap_sanca.exception.NotFoundException;
import efdsw.p2.sanca.p2_soap_sanca.model.Vehiculo;
import efdsw.p2.sanca.p2_soap_sanca.repository.VehiculoRepository;
import efdsw.p2.sanca.p2_soap_sanca.service.IVehiculoService;
import efdsw.p2.sanca.p2_soap_sanca.util.convert.VehiculoConvert;
import efdsw.p2.sanca.ws.objects.CreateVehiculoRequest;
import efdsw.p2.sanca.ws.objects.CreateVehiculoResponse;
import efdsw.p2.sanca.ws.objects.GetAllVehiculosResponse;
import efdsw.p2.sanca.ws.objects.GetVehiculoByIdResponse;
import efdsw.p2.sanca.ws.objects.UpdateVehiculoRequest;
import efdsw.p2.sanca.ws.objects.UpdateVehiculoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService implements IVehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Autowired
    private VehiculoConvert vehiculoConvert;

    @Override
    public GetAllVehiculosResponse listarVehiculos() {
        GetAllVehiculosResponse response = new GetAllVehiculosResponse();
        List<Vehiculo> vehiculos = vehiculoRepository.findAll();
        response.getVehiculo().addAll(vehiculoConvert.mapToVehiculowsList(vehiculos));
        return response;
    }

    @Override
    public GetVehiculoByIdResponse obtenerVehiculoxId(Integer id) {
        GetVehiculoByIdResponse response = new GetVehiculoByIdResponse();
        Vehiculo vehiculo = vehiculoRepository.findById(id).orElse(null);
        if (vehiculo != null) {
            response.setVehiculo(vehiculoConvert.mapToVehiculows(vehiculo));
        } else {
            throw new NotFoundException("Vehiculo no encontrado");
        }
        return response;
    }

    @Override
    public UpdateVehiculoResponse actualizarVehiculo(UpdateVehiculoRequest request) {
        Vehiculo vehiculo = vehiculoRepository.findById(request.getIdvehiculo()).orElse(null);
        if (vehiculo == null) {
            throw new NotFoundException("Vehículo no encontrado.");
        }
        // Actualiza los campos
        vehiculo.setModelovehiculo(request.getModelovehiculo());
        vehiculo.setAnioovehiculo(request.getAnioovehiculo());
        vehiculo.setMarcavehiculo(request.getMarcavehiculo());
        vehiculo.setPreciovehiculo(request.getPreciovehiculo());
        vehiculoRepository.save(vehiculo);
        UpdateVehiculoResponse response = new UpdateVehiculoResponse();
        response.setVehiculo(vehiculoConvert.mapToVehiculows(vehiculo));
        return response;
    }

    @Override
    public CreateVehiculoResponse crearVehiculo(CreateVehiculoRequest request) {
        // Crear nueva instancia de Vehiculo
        Vehiculo nuevoVehiculo = new Vehiculo();
        nuevoVehiculo.setMarcavehiculo(request.getMarcavehiculo());
        nuevoVehiculo.setModelovehiculo(request.getModelovehiculo());
        nuevoVehiculo.setAnioovehiculo(request.getAnioovehiculo());
        nuevoVehiculo.setPreciovehiculo(request.getPreciovehiculo());
        // Guardar el nuevo Vehiculo en el repositorio
        Vehiculo savedVehiculo = vehiculoRepository.save(nuevoVehiculo);
        // Crear respuesta
        CreateVehiculoResponse response = new CreateVehiculoResponse();
        response.setVehiculo(vehiculoConvert.mapToVehiculows(savedVehiculo));
        return response;
    }
}


