package Loja;

public class Estoque 
{
    private Produto[] produtos = null;
    private int pos = 0;

    
    public void adicionarProduto(Produto prod)
    {
        if(this.produtos == null)
        {
            this.produtos = new Produto[100];
        }
        this.produtos[this.pos] = prod;
        this.pos++;
    }

    public void removerProduto(int id)
    {   
        int i;
        for(i = 0; i < this.pos; i ++)
        {
            if(this.produtos[i].id == id)
            {
                while (i < pos)
                {
                    this.produtos[i] = this.produtos[i+1];
                    i++;
                }
            }
        }

        this.pos--;
    }

    public Produto BuscaPorNome(String nomebuscado)
    {
        for(int i =0; i < this.pos; i++)
        {
            if(this.produtos[i].nome == nomebuscado){return this.produtos[i];}
        }
        System.out.println("Produto não encontrado !");
        return null;
    }

    @Override
    public String toString() 
    {
        String prod_names="";
        for(int i = 0; i < this.pos; i ++)
        {
            prod_names += this.produtos[i].getNome() + ", ";
        }

        return prod_names;
    }
}
