

public class TarjetaDebito extends Tarjeta{

    private int saldoDisponible;

    public TarjetaDebito (String nif, int pin, String nombre, String apellido, int saldoDisponible){
        this.setNif(nif);
        this.setPin(pin);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setSaldoDisponible(saldoDisponible);
        
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public String mostrarTarjeta(){
        return String.format("===================== /n Nombre: %s /n Apellido: %s /n Nif: %s /n Saldo: %d", getNombre(), getApellido(), getNif(), getSaldoDisponible());
    }

}