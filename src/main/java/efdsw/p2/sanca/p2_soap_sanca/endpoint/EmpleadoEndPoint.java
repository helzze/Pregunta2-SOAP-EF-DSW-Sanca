package efdsw.p2.sanca.p2_soap_sanca.endpoint;

import efdsw.p2.sanca.p2_soap_sanca.service.IEmpleadoService;
import efdsw.p2.sanca.p2_soap_sanca.util.convert.EmpleadoConvert;
import efdsw.p2.sanca.ws.objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmpleadoEndPoint {

    private static final String NAMESPACE_URI = "http://www.sanca.p2.efdsw/ws/objects";

    @Autowired
    private IEmpleadoService empleadoService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmpleadoByIdRequest")
    @ResponsePayload
    public GetEmpleadoByIdResponse getEmpleadoById(@RequestPayload GetEmpleadoByIdRequest request) {
        return empleadoService.obtenerEmpleadoporId(request.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllEmpleadosRequest")
    @ResponsePayload
    public GetAllEmpleadosResponse getAllEmpleados(@RequestPayload GetAllEmpleadosRequest request) {
        return empleadoService.listarEmpleados();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createEmpleadoRequest")
    @ResponsePayload
    public CreateEmpleadoResponse createEmpleado(@RequestPayload CreateEmpleadoRequest request) {
        return empleadoService.crearEmpleado(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateEmpleadoRequest")
    @ResponsePayload
    public UpdateEmpleadoResponse updateEmpleado(@RequestPayload UpdateEmpleadoRequest request) {
        return empleadoService.actualizarEmpleado(request);
    }
}
