package BusElche;

import java.util.Scanner;

public class MainBuses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Buses buses=new Buses();
        buses.Agregarparada("001","Doctor Caro","C/Doctor Caro");
        LineasBus lineasBusA=new LineasBus("A");
        lineasBusA.AgregarParada("001",75);
        buses.AgregarLinea(lineasBusA);
        LineasBus lineasBusI=new LineasBus("I");
        lineasBusI.AgregarParada("003",60);
        buses.AgregarLinea(lineasBusI);
        System.out.print("Elige parada inicial: ");
        String inicio = scanner.next();
        System.out.println("Has elegido " + buses.paradas.get(inicio).getNumeroparada());

        System.out.print("Elige parada final: ");
        String destino = scanner.next();
        System.out.println("Has elegido " + buses.paradas.get(destino).getNumeroparada());



    }
}
