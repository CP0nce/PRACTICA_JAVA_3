

public class Tarjeta {

    private String nif;
    private int pin;
    private String nombre;
    private String apellido;
    private boolean estado;

    public String getNif(){
        return nif;
    }
    public void setNif (String newNif){
        this.nif = newNif;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
     public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String mostrarTarjeta(){
        return toString();

    }

}