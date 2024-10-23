package efdsw.p2.sanca.p2_soap_sanca.service;

import efdsw.p2.sanca.ws.objects.*;

public interface IEmpleadoService {
    GetAllEmpleadosResponse listarEmpleados();
    GetEmpleadoByIdResponse obtenerEmpleadoporId(Integer id);
    CreateEmpleadoResponse crearEmpleado(CreateEmpleadoRequest empleado);
    UpdateEmpleadoResponse actualizarEmpleado(UpdateEmpleadoRequest empleado);
}

