package efdsw.p2.sanca.p2_soap_sanca.service;

import efdsw.p2.sanca.ws.objects.*;

public interface IVehiculoService {
    GetAllVehiculosResponse listarVehiculos();

    GetVehiculoByIdResponse obtenerVehiculoxId(Integer id); // Cambia el tipo de retorno a GetVehiculoByIdResponse

    CreateVehiculoResponse crearVehiculo(CreateVehiculoRequest vehiculo); // Cambia el tipo de retorno a CreateVehiculoResponse

    UpdateVehiculoResponse actualizarVehiculo(UpdateVehiculoRequest vehiculo); // Cambia el tipo de retorno a UpdateVehiculoResponse
}


