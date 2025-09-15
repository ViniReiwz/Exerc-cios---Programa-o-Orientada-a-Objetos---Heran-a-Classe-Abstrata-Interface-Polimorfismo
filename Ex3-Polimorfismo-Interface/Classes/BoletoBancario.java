package Classes;
import Interfaces.*;

public class BoletoBancario implements MetodoPagamento
{
    public double codigo;
    public String data_de_venc;
    private double taxa = 2.1;

    public BoletoBancario(double codigo, String data_de_venc)
    {
        this.codigo = codigo;
        this.data_de_venc = data_de_venc;
    }

    public double getTaxaPagamento() 
    {
        return this.taxa;
    }

    @Override
    public void realizarPagamento(double valor) 
    {
        System.out.println("Pagamento realizado pelo boleto no valor de "+ valor + " + taxa de " + this.taxa+ "\n");
    }
}
