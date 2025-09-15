package Classes;
import Interfaces.*;

public class CartaoCredito implements MetodoPagamento
{
    private String nro_cartao;
    public double limite;
    private double taxa = 5.2;

    public CartaoCredito(String nro_cartao, double limite)
    {
        this.nro_cartao = nro_cartao;
        this.limite = limite;
    }
    
    public String getNro_cartao() 
    {
        return nro_cartao;
    }

    public void realizarPagamento(double Valor)
    {
        this.limite -= Valor;
        System.out.println("Pagamento de " + Valor + " reais feito pelo cartao de crédito + taxa de " + this.taxa +"\n");
    }

    public double getTaxaPagamento()
    {
        return this.taxa;
    }

    
}

