package BusElche;
import java.util.HashMap;
import java.util.Map;

public class Buses {
    Map<String,ParadasBus>paradas=new HashMap<>();
    Map<String,LineasBus>lineasBusMap=new HashMap<>();
    public void Agregarparada(String numeroparada,String nombreparada,String direccionparada){
        ParadasBus paradasBus=new ParadasBus(numeroparada,nombreparada,direccionparada);
        paradas.put(numeroparada,paradasBus);
    }
    public void AgregarLinea(LineasBus linea){
        lineasBusMap.put(linea.getLineabus(),linea);
    }

    }

