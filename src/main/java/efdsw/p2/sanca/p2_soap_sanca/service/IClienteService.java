package efdsw.p2.sanca.p2_soap_sanca.service;

import efdsw.p2.sanca.ws.objects.*;

public interface IClienteService {
    GetAllClientesResponse listarClientes();
    GetClienteByIdResponse obtenerClienteporId(Integer id);
    UpdateClienteResponse actualizarCliente(UpdateClienteRequest request);
    CreateClienteResponse crearCliente(CreateClienteRequest request);
}
