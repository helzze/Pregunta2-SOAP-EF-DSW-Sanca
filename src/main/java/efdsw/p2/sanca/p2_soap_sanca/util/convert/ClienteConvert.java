package efdsw.p2.sanca.p2_soap_sanca.util.convert;

import efdsw.p2.sanca.p2_soap_sanca.model.Cliente;
import efdsw.p2.sanca.ws.objects.Clientews;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteConvert {

    public Cliente mapToCliente(Clientews clientews) {
        Cliente cliente = new Cliente();
        cliente.setId(cliente.getId());
        cliente.setNombrecliente(clientews.getNombrecliente());
        cliente.setApellidocliente(clientews.getApellidocliente());
        cliente.setEmailcliente(clientews.getEmailcliente());
        cliente.setTelefonocliente(clientews.getTelefonocliente());
        return cliente;
    }

    public Clientews mapToClientews(Cliente cliente) {
        Clientews clientews = new Clientews();
        clientews.setIdcliente(cliente.getId()); // Asegúrate de que este campo exista en clientews
        clientews.setNombrecliente(cliente.getNombrecliente());
        clientews.setApellidocliente(cliente.getApellidocliente());
        clientews.setEmailcliente(cliente.getEmailcliente());
        clientews.setTelefonocliente(cliente.getTelefonocliente());
        return clientews;
    }

    public List<Cliente> mapToClientesList(List<Clientews> clientewsList) {
        List<Cliente> clienteList = new ArrayList<>();
        for (Clientews clientews : clientewsList) {
            clienteList.add(mapToCliente(clientews));
        }
        return clienteList;
    }

    public List<Clientews> mapToClientewsList(List<Cliente> clienteList) {
        List<Clientews> clientewsList = new ArrayList<>();
        for (Cliente cliente : clienteList) {
            clientewsList.add(mapToClientews(cliente));
        }
        return clientewsList;
    }
}
