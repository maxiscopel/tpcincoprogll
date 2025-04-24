package Kata2;
import Kata3.Tecnico;

public class mainKataDos {
    public static void main(String[] args) {
        Usuario Usuario1 = new Usuario(1,"Juan Rodriguez", "juanrodriguez@gmail.com");

        TicketSoport ticket1 = new TicketSoport(1001, "No puedo acceder al sistema",Usuario1);
        TicketSoport ticket2 = new TicketSoport(1002, "Error al imprimir");

        Tecnico tecnico1 = new Tecnico(1, "Pedro García", "Soporte Técnico");
        ticket2.asignarTecnico(tecnico1);

        System.out.println(ticket1);
        System.out.println(ticket2);
    }
}