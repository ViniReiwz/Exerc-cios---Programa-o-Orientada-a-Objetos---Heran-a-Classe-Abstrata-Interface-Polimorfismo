public class Funcionário implements Comparável
{
    private float sal_base;
    private String nome;

    public Funcionário(float sal_base,String nome)
    {
        this.sal_base=sal_base;
        this.nome=nome;
    }

    public String getNome() 
    {
        return "O nome é"  + nome;
    }

    public int comparaCom(Comparável c)
    {
        if((this.sal_base) > (((Funcionário)c).sal_base))
        {
            return 1;
        }

        else if((this.sal_base) < (((Funcionário)c).sal_base))
        {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() 
    {
        return "Nome: " + this.nome + "Salário: " + this.sal_base;
    }
}