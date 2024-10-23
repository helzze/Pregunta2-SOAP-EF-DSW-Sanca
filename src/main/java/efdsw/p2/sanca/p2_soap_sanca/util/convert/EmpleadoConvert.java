package efdsw.p2.sanca.p2_soap_sanca.util.convert;

import efdsw.p2.sanca.p2_soap_sanca.model.Empleado;
import efdsw.p2.sanca.ws.objects.Empleadows;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpleadoConvert {

    public Empleado mapToEmpleado(Empleadows empleadows) {
        Empleado empleado = new Empleado();
        empleado.setId(empleadows.getIdempleado()); // Asegúrate de que este campo exista en Empleado
        empleado.setNombreempleado(empleadows.getNombreempleado());
        empleado.setApellidoempleado(empleadows.getApellidoempleado());
        empleado.setCargoempleado(empleadows.getCargoempleado());
        empleado.setSalarioempleado(empleadows.getSalarioempleado());
        return empleado;
    }

    public Empleadows mapToEmpleadows(Empleado empleado) {
        Empleadows empleadows = new Empleadows();
        empleadows.setIdempleado(empleado.getId()); // Asegúrate de que este campo exista en Empleadows
        empleadows.setNombreempleado(empleado.getNombreempleado());
        empleadows.setApellidoempleado(empleado.getApellidoempleado());
        empleadows.setCargoempleado(empleado.getCargoempleado());
        empleadows.setSalarioempleado(empleado.getSalarioempleado());
        return empleadows;
    }

    public List<Empleado> mapToEmpleadosList(List<Empleadows> empleadowsList) {
        List<Empleado> empleados = new ArrayList<>();
        for (Empleadows empleadows : empleadowsList) {
            empleados.add(mapToEmpleado(empleadows));
        }
        return empleados;
    }

    public List<Empleadows> mapToEmpleadowsList(List<Empleado> empleadoList) {
        List<Empleadows> empleadowsList = new ArrayList<>();
        for (Empleado empleado : empleadoList) {
            empleadowsList.add(mapToEmpleadows(empleado));
        }
        return empleadowsList;
    }
}


