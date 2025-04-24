package Kata2;

import Kata3.Tecnico;

// CLASE USADA TAMBIEN USADA EN KATA 3

public class TicketSoport {

    private static int contadorTickets;
    private int numero;
    private String descripcion;
    private Tecnico tecnicoAsignado;
    private Usuario usuario;
    private String estado;

    public TicketSoport(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.tecnicoAsignado = null;
        this.usuario = null;
    }

    public TicketSoport(int numero, String descripcion, Usuario usuario) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.tecnicoAsignado = null;
        this.usuario = usuario;
        this.estado = "Abierto";
        contadorTickets++;
    }

    public static int getContadorTickets(){
        return contadorTickets;
    }

    public void asignarTecnico(Tecnico tecnico){
        this.tecnicoAsignado = tecnico;
    }

    public void cerrarTicket(){
        this.estado = "Cerrado";
    }

    public String getEstado(){
        return estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setTecnicoAsignado(Tecnico tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString(){
        return "TicketSoporte{" +
                "numero=" + numero +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", tecnicoAsignado='" + tecnicoAsignado + '\'' +
                ", usuario=" + (usuario != null ? usuario.getNombre() : "Sin usuario") +
                '}';
    }


}