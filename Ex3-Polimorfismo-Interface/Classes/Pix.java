package Classes;
import Interfaces.*;

public class Pix implements MetodoPagamento
{
    public String chave_pix;
    private double taxa = 0.0;

    public Pix(String chave_pix)
    {
        this.chave_pix=chave_pix;
    }

    public double getTaxaPagamento() 
    {
        return this.taxa;
    }

    public void realizarPagamento(double valor) 
    {
        System.out.println("Pagamento de "+ valor +" pelo pix + taxa de " + this.taxa + "\n");
    }

}
