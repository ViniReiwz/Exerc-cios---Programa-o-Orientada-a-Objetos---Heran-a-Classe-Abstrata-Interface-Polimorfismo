import Loja.*;

public class Main
{
    public static void main(String args[])
    {
        Estoque est = new Estoque();
        est.adicionarProduto(new Produto(1, "Mouse Gamer", 120.0, 5));
        est.adicionarProduto(new Produto(2, "Teclado Mecãnico", 120.0, 5));
        est.adicionarProduto(new Produto(3, "Monitor LED", 900.0, 5));
        est.removerProduto(3);
        Produto pbusc = est.BuscaPorNome("Mouse Gamer");
        pbusc.vender(3);
        pbusc.repor(2);
        System.out.println(est);
    }
}
