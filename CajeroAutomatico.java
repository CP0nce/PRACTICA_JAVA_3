

public class CajeroAutomatico {
    
    private int idUltCaj = 0;
    public int idCaj;
    private int[] billetes;
    public Tarjeta[] listaTarjetas;
    
    
    public CajeroAutomatico() {
        this.setIdCaj(idUltCaj++);
    }
    

    
    public Tarjeta[] getListaTarjetas(){
        return listaTarjetas;
    }
    public void setIdCaj(int idCaj){
        this.idCaj = idCaj;
    }
    public int[] getBilletes() {
        return billetes;
    }
    public void setBilletes(int[] billetes) {
        this.billetes = billetes;
    }

}