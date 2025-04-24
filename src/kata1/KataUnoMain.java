package kata1;



public class KataUnoMain {
    public static void main(String[] args) {
        ticketSoporte ticket = new ticketSoporte(1, "No puedo acceder al sistema.","Abiero");

        System.out.println("--- Detalle del ticket ---");
        System.out.println(ticket.mostrarDetalle());

        ticket.CerrarTicket();

        System.out.println("--- Ticket despues de cerralo ---");
        System.out.println(ticket.mostrarDetalle());


    }
}