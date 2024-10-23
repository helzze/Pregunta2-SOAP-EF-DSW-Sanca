package efdsw.p2.sanca.p2_soap_sanca.util.convert;

import efdsw.p2.sanca.p2_soap_sanca.model.Vehiculo;
import efdsw.p2.sanca.ws.objects.Vehiculows;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VehiculoConvert {

    public Vehiculo mapToVehiculo(Vehiculows vehiculows){
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setIdvehiculo(vehiculows.getIdvehiculo());
        vehiculo.setAnioovehiculo(vehiculows.getAnioovehiculo());
        vehiculo.setMarcavehiculo(vehiculows.getMarcavehiculo());
        vehiculo.setModelovehiculo(vehiculows.getModelovehiculo());
        vehiculo.setPreciovehiculo(vehiculows.getPreciovehiculo());
        return vehiculo;
    }
    public Vehiculows mapToVehiculows(Vehiculo vehiculo){
        Vehiculows vehiculows = new Vehiculows();
        vehiculows.setIdvehiculo(vehiculo.getIdvehiculo());
        vehiculows.setAnioovehiculo(vehiculo.getAnioovehiculo());
        vehiculows.setMarcavehiculo(vehiculo.getMarcavehiculo());
        vehiculows.setModelovehiculo(vehiculo.getModelovehiculo());
        vehiculows.setPreciovehiculo(vehiculo.getPreciovehiculo());
        return vehiculows;
    }
    public List<Vehiculo> mapToVehiculoList(List<Vehiculows> vehiculowsList){
        List<Vehiculo> vehiculoList = new ArrayList<>();
        for (Vehiculows vehiculows : vehiculowsList) {
            vehiculoList.add(mapToVehiculo(vehiculows));
        }
        return vehiculoList;
    }

    public List<Vehiculows> mapToVehiculowsList(List<Vehiculo> vehiculoList){
        List<Vehiculows> vehiculowsList = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculoList){
            vehiculowsList.add(mapToVehiculows(vehiculo));
        }
        return vehiculowsList;
    }
}
