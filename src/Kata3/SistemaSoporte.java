package Kata3;

import Kata2.TicketSoport;
import Kata2.Usuario;

import java.util.ArrayList;

public class SistemaSoporte {

    private ArrayList<TicketSoport> tickets;

    public SistemaSoporte(){
        tickets = new ArrayList<>();
    }

    public void crearTicket(int numero, String descriocion, Usuario usuario){
        TicketSoport nuevoTicket = new TicketSoport(numero, descriocion, usuario);
        tickets.add(nuevoTicket);
    }

    public void asignarTecnicoATicket(int numeroTicket, Tecnico tecnico) {
        for (TicketSoport ticket : tickets) {
            if (ticket.getNumero() == numeroTicket) {
                ticket.asignarTecnico(tecnico);
                break;
            }
        }
    }

    public void listarTicketsAbiertos(){
        System.out.println("-----TICKETS ABIERTOS-----");
        for (TicketSoport ticket : tickets){
            if (ticket.getEstado().equals("Abierto")){
                System.out.println(ticket);
            }
        }
    }

    public void listarTicketsCerrados(){
        System.out.println("-----TICKETS CERRADOS-----");
        for (TicketSoport ticket : tickets){
            if (ticket.getEstado().equals("Cerrado")){
                System.out.println(ticket);
            }
        }
    }

    public ArrayList<TicketSoport> getTickets() {
        return tickets;
    }
}