package kata1;

import java.time.LocalDate;

public class ticketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;


    public ticketSoporte(int id, String descripcion, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }

    public void CerrarTicket(){
        this.estado = "Cerrado";
    };

    public String mostrarDetalle(){
        return "Ticket #" + id + "\n" + "Descripcion: " + descripcion + "\n" + "Estado: " + estado + "\n" + "Fecha de creacion: " + fechaCreacion;

    }
}