package Loja;

public class Produto 
{
    public int id;
    public String nome;
    private double preço;
    private int qnt;

    public Produto(int id, String nome, double preço, int qnt)
    {
        this.id = id;
        this.nome = nome;
        this.preço = preço;
        this.qnt = qnt;
    }

    public void vender(int qntSell)
    {
        if((this.qnt - qntSell) < 0){System.out.println("Produtos insuficientes\n");}
        else
        {
            this.qnt -= qntSell;
            System.out.println("Produtos" + this.nome + "vendidos com sucesso !\n");
        }
    }

    public void repor(int qntRep)
    {
        this.qnt += qntRep;
    }

    @Override
    public String toString() 
    {
        return "ID: " + this.id + "\nNome: " + this.nome + "\nPreço: " + this.preço +"\nQuantidade em estoque: " + this.qnt + '\n';
    }

    public String getNome() 
    {
        return this.nome;
    }
}
