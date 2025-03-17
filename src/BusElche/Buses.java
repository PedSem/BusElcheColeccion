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
    public boolean ValidarLetra(String Letra){
        for(int i=0;i<Letra.length();i++){
            if(!Character.isLetter(Letra.charAt(i))){
                return false;
            }
        }
        return true;

    }
    public boolean ValidarNumero(String numero){
        for(int i=0;i<numero.length();i++){
            if(!Character.isDigit(numero.charAt(i))){
                return false;
            }
        }
        return true;

    }



    }

