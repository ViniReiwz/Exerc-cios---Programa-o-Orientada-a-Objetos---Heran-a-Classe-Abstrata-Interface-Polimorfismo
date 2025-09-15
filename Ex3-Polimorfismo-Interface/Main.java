import Interfaces.*;

import java.util.ArrayList;
import java.util.List;

import Classes.*;

public class Main 
{
    public static void main(String[] args) 
    {
        List<MetodoPagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new CartaoCredito("1234-5678-9876-5432", 1000));
        pagamentos.add(new BoletoBancario(23793, "2025-04-10"));
        pagamentos.add(new Pix("usuario@pix.com"));

        double valorCompra = 300;
        double total = 0;

        for(MetodoPagamento metodo:pagamentos)
        {
            metodo.realizarPagamento(valorCompra);
            total += metodo.getTaxaPagamento(); 
        }
        char percent='%';
        System.out.printf("O total de taxa pago foi de %.1f%c\n",total,percent);
    }
}
