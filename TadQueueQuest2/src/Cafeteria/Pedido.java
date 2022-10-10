package Cafeteria;
public class Pedido {
    private String boleto;
    private String prato;


    public Pedido(String boleto, String prato) {
        this.boleto = boleto;
        this.prato = prato;
    }


    public String getBoleto() {
        return boleto;
    }


    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }


    public String getPrato() {
        return prato;
    }


    public void setPrato(String prato) {
        this.prato = prato;
    }


    @Override
    public String toString() {
        return "Pedido [boleto= " + boleto + ", prato= " + prato + "]";
    }

    

}
