package Kata3;

import Kata2.TicketSoport;
import Kata2.Usuario;

public class mainKataTres {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1, "Juan Rodriguez ", "juan@gmail.com");
        Usuario usuario2 = new Usuario(2, "Marcos Pérez ", "marcosperez@gmail.com");

        Tecnico tecnico1 = new Tecnico(1, "Ignacio García ", "Redes");
        Tecnico tecnico2 = new Tecnico(2, "Analía Torres ", " Mantenimiento");

        SistemaSoporte sistema = new SistemaSoporte();

        sistema.crearTicket(1001,"Tenemos problemas con la red ", usuario1);
        sistema.crearTicket(1002, "Intentelo mas tarde ", usuario2);

        sistema.asignarTecnicoATicket(1001, tecnico1);
        sistema.asignarTecnicoATicket(1002, tecnico2);

        System.out.println("\nCantidad total de tickets: " + TicketSoport.getContadorTickets());
        System.out.println("\nLista de todos los tickets: ");
        for (TicketSoport ticket : sistema.getTickets()){
            System.out.println(ticket);
        }
    }

}