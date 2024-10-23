package efdsw.p2.sanca.p2_soap_sanca.endpoint;

import efdsw.p2.sanca.p2_soap_sanca.service.IClienteService;
import efdsw.p2.sanca.ws.objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ClienteEndPoint {

    private static final String NAMESPACE_URI = "http://www.sanca.p2.efdsw/ws/objects";

    @Autowired
    private IClienteService clienteService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllClientesRequest")
    @ResponsePayload
    public GetAllClientesResponse getAllClientes(@RequestPayload GetAllClientesRequest request) {
        return clienteService.listarClientes();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClienteByIdRequest")
    @ResponsePayload
    public GetClienteByIdResponse getClienteById(@RequestPayload GetClienteByIdRequest request) {
        return clienteService.obtenerClienteporId(request.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createClienteRequest")
    @ResponsePayload
    public CreateClienteResponse createCliente(@RequestPayload CreateClienteRequest request) {
        return clienteService.crearCliente(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateClienteRequest")
    @ResponsePayload
    public UpdateClienteResponse updateCliente(@RequestPayload UpdateClienteRequest request) {
        return clienteService.actualizarCliente(request);
    }
}
