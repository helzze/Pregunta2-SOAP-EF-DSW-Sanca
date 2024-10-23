package efdsw.p2.sanca.p2_soap_sanca.endpoint;

import efdsw.p2.sanca.p2_soap_sanca.service.IVehiculoService;
import efdsw.p2.sanca.p2_soap_sanca.util.convert.VehiculoConvert;
import efdsw.p2.sanca.ws.objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class VehiculoEndPoint {

    private static final String NAMESPACE_URI = "http://www.sanca.p2.efdsw/ws/objects";

    @Autowired
    private IVehiculoService vehiculoService;

    @Autowired
    private VehiculoConvert vehiculoConvert;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getVehiculoByIdRequest")
    @ResponsePayload
    public GetVehiculoByIdResponse getVehiculoById(@RequestPayload GetVehiculoByIdRequest request) {
        // Obtener el vehículo a través del servicio
        GetVehiculoByIdResponse response = vehiculoService.obtenerVehiculoxId(request.getId());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllVehiculosRequest")
    @ResponsePayload
    public GetAllVehiculosResponse getAllVehiculos(@RequestPayload GetAllVehiculosRequest request) {
        return vehiculoService.listarVehiculos();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createVehiculoRequest")
    @ResponsePayload
    public CreateVehiculoResponse createVehiculo(@RequestPayload CreateVehiculoRequest request) {
        // Crear el vehículo y obtener la respuesta
        CreateVehiculoResponse response = vehiculoService.crearVehiculo(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateVehiculoRequest")
    @ResponsePayload
    public UpdateVehiculoResponse updateVehiculo(@RequestPayload UpdateVehiculoRequest request) {
        // Actualizar el vehículo y obtener la respuesta
        UpdateVehiculoResponse response = vehiculoService.actualizarVehiculo(request);
        return response;
    }
}


