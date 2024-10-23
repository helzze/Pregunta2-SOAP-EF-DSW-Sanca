package efdsw.p2.sanca.p2_soap_sanca.service.impl;

import efdsw.p2.sanca.p2_soap_sanca.exception.NotFoundException;
import efdsw.p2.sanca.p2_soap_sanca.model.Empleado;
import efdsw.p2.sanca.p2_soap_sanca.repository.EmpleadoRepository;
import efdsw.p2.sanca.p2_soap_sanca.service.IEmpleadoService;
import efdsw.p2.sanca.p2_soap_sanca.util.convert.EmpleadoConvert;
import efdsw.p2.sanca.ws.objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private EmpleadoConvert empleadoConvert;

    @Override
    public GetAllEmpleadosResponse listarEmpleados() {
        GetAllEmpleadosResponse response = new GetAllEmpleadosResponse();
        List<Empleado> empleados = empleadoRepository.findAll();
        response.getEmpleado().addAll(empleadoConvert.mapToEmpleadowsList(empleados));
        return response;
    }

    @Override
    public GetEmpleadoByIdResponse obtenerEmpleadoporId(Integer id) {
        GetEmpleadoByIdResponse response = new GetEmpleadoByIdResponse();
        Empleado empleado = empleadoRepository.findById(id).orElse(null);
        if (empleado != null) {
            response.setEmpleado(empleadoConvert.mapToEmpleadows(empleado));
        } else {
            throw new NotFoundException("Empleado no encontrado");
        }
        return response;
    }

    @Override
    public UpdateEmpleadoResponse actualizarEmpleado(UpdateEmpleadoRequest request) {
        Empleado empleado = empleadoRepository.findById(request.getIdempleado()).orElse(null);
        if (empleado == null) {
            throw new NotFoundException("Empleado no encontrado.");
        }
        // Actualiza los campos
        empleado.setNombreempleado(request.getNombreempleado());
        empleado.setApellidoempleado(request.getApellidoempleado());
        empleado.setCargoempleado(request.getCargoempleado());
        empleado.setSalarioempleado(request.getSalarioempleado());
        empleadoRepository.save(empleado);
        UpdateEmpleadoResponse response = new UpdateEmpleadoResponse();
        response.setEmpleado(empleadoConvert.mapToEmpleadows(empleado));
        return response;
    }

    @Override
    public CreateEmpleadoResponse crearEmpleado(CreateEmpleadoRequest request) {
        Empleado nuevoEmpleado = new Empleado();
        nuevoEmpleado.setNombreempleado(request.getNombreempleado());
        nuevoEmpleado.setApellidoempleado(request.getApellidoempleado());
        nuevoEmpleado.setCargoempleado(request.getCargoempleado());
        nuevoEmpleado.setSalarioempleado(request.getSalarioempleado());
        Empleado savedEmpleado = empleadoRepository.save(nuevoEmpleado);
        CreateEmpleadoResponse response = new CreateEmpleadoResponse();
        response.setEmpleado(empleadoConvert.mapToEmpleadows(savedEmpleado));
        return response;
    }
}
