package efdsw.p2.sanca.p2_soap_sanca.service.impl;

import efdsw.p2.sanca.p2_soap_sanca.exception.NotFoundException;
import efdsw.p2.sanca.p2_soap_sanca.model.Cliente;
import efdsw.p2.sanca.p2_soap_sanca.repository.ClienteRepository;
import efdsw.p2.sanca.p2_soap_sanca.service.IClienteService;
import efdsw.p2.sanca.p2_soap_sanca.util.convert.ClienteConvert;
import efdsw.p2.sanca.ws.objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteConvert clienteConvert;

    @Override
    public GetAllClientesResponse listarClientes() {
        GetAllClientesResponse response = new GetAllClientesResponse();
        List<Cliente> clientes = clienteRepository.findAll();
        List<Clientews> clientewsList = clienteConvert.mapToClientewsList(clientes);
        response.getClientes().addAll(clientewsList);
        return response;
    }

    @Override
    public GetClienteByIdResponse obtenerClienteporId(Integer id) {
        GetClienteByIdResponse response = new GetClienteByIdResponse();
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if (cliente != null) {
            response.setCliente(clienteConvert.mapToClientews(cliente));
        } else {
            throw new NotFoundException("Cliente no encontrado");
        }
        return response;
    }

    @Override
    public UpdateClienteResponse actualizarCliente(UpdateClienteRequest request) {
        Cliente cliente = clienteRepository.findById(request.getIdcliente()).orElse(null);
        if (cliente == null) {
            throw new NotFoundException("Cliente no encontrado.");
        }
        // Actualiza los campos
        cliente.setNombrecliente(request.getNombrecliente());
        cliente.setApellidocliente(request.getApellidocliente());
        cliente.setEmailcliente(request.getEmailcliente());
        cliente.setTelefonocliente(request.getTelefonocliente());
        clienteRepository.save(cliente);
        UpdateClienteResponse response = new UpdateClienteResponse();
        response.setCliente(clienteConvert.mapToClientews(cliente));
        return response;
    }

    @Override
    public CreateClienteResponse crearCliente(CreateClienteRequest request) {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombrecliente(request.getNombrecliente());
        nuevoCliente.setApellidocliente(request.getApellidocliente());
        nuevoCliente.setEmailcliente(request.getEmailcliente());
        nuevoCliente.setTelefonocliente(request.getTelefonocliente());
        Cliente savedCliente = clienteRepository.save(nuevoCliente);
        CreateClienteResponse response = new CreateClienteResponse();
        response.setCliente(clienteConvert.mapToClientews(savedCliente));
        return response;
    }
}

