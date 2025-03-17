package BusElche;

import java.util.*;

public class LineasBus {
    private String lineabus;
    private List<String>paradas;
    private Map<String,Integer> tiempos;

    public LineasBus(String lineabus) {
        this.lineabus = lineabus;
        this.paradas=new ArrayList<>();
        this.tiempos=new HashMap<>();

    }
    public void AgregarParada(String parada,int tiempo){
        if(!paradas.isEmpty()){
            String paradasclave=paradas.get(paradas.size()-1) + "-" + paradas;
            tiempos.put(paradasclave,tiempo);
        }
        paradas.add(parada);
    }

    public String getLineabus() {
        return lineabus;
    }

    public List<String> getParadas() {
        return paradas;
    }

    public Map<String, Integer> getTiempos() {
        return tiempos;
    }

    @Override
    public String toString() {
        return "LineasBus{" +
                "lineabus='" + lineabus + '\'' +
                ", paradas=" + paradas +
                ", tiempos=" + tiempos +
                '}';
    }
}
