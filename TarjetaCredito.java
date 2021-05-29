 public class TarjetaCredito extends Tarjeta{

    private int saldoDisponible;
    private int creditoDisponible;

    public TarjetaCredito (String nif, int pin, String nombre, String apellido, int saldoDisponible, int creditoDisponible){
        this.setNif(nif);
        this.setPin(pin);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setSaldoDisponible(saldoDisponible);
        this.setCreditoDisponible(creditoDisponible);
        
    }

    public int getCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(int creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public String mostrarTarjeta(){
        return String.format("===================== /n Nombre: %s /n Apellido: %s /n Nif: %s /n Saldo: %d /n Credito: %d", getNombre(), getApellido(), getNif(), getSaldoDisponible(), getCreditoDisponible());
    }

}
