package BusElche;

import java.util.Scanner;

public class MainBuses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Buses buses=new Buses();
        buses.Agregarparada("001","Doctor Caro","C/Doctor Caro");
        buses.Agregarparada("002","Vicente Blasco Ibañez","Vicente Blasco Ibañez 22");
        buses.Agregarparada("003","Vicente Blasco Ibañez","Vicente Blasco Ibañez 80");
        LineasBus lineasBusA=new LineasBus("A");
        lineasBusA.AgregarParada("001",75);
        lineasBusA.AgregarParada("003",60);
        buses.AgregarLinea(lineasBusA);
        String inicio,linea,destino;
        boolean continuar;

        do{
            System.out.print("Elige parada inicial: ");
            inicio = scanner.next();
            if(buses.paradas.containsKey(inicio)){
                System.out.println("Has elegido " + buses.paradas.get(inicio).getNombreparada() + ", " + buses.paradas.get(inicio).getDireccionparada());
                continuar=true;
            }else{
                System.out.println("No existe el inicio de la parada");
                continuar=false;
            }
        }while (!buses.ValidarNumero(inicio) || !continuar);
        do{
            System.out.print("Bus linea:");
            linea=scanner.next().toUpperCase();
            if(buses.lineasBusMap.containsKey(linea)){
                System.out.println("La linea es la " + buses.lineasBusMap.get(linea).getLineabus());
                continuar=true;
            }else{
                System.out.println("No se encontro la linea");
                continuar=false;
            }

        }while (!buses.ValidarLetra(linea) || !continuar);
        do{
            System.out.print("Elige parada final: ");
            destino = scanner.next();
            if(buses.paradas.containsKey(destino)){
                System.out.println("Has elegido " + buses.paradas.get(destino).getNombreparada() + ", " + buses.paradas.get(destino).getDireccionparada());
                continuar=true;

            }else{
                System.out.println("No existe el destino de la parada");
                continuar=false;
            }
        }while (!buses.ValidarNumero(destino) || !continuar);
    }
}
