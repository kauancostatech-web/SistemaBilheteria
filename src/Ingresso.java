
public class Ingresso {
    private int codCliente;
    private int ingresso;
    private double ValorIngresso;
    private String Evento;
    private String TipoIngresso;
    private String Status;

    public int getCodClinete() {
        return codCliente;
    }

    public int getIngresso() {
        return ingresso;
    }
     public void setIngresso(int ingresso) {
        this.ingresso = ingresso;
    }

    public String getEvento() {
        return Evento;
    }

    public double getValorIngresso() {
        return ValorIngresso;
    }

    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        this.Status = status;
    }
    public String getTipoIngresso() {
        return TipoIngresso;
    }
}
