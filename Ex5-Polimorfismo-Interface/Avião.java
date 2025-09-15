public class Avião implements Comparável
{
    private float potencia;
    private int acentos;

    public Avião(float potencia, int acentos)
    {
        this.potencia = potencia;
        this.acentos = acentos;
    }

    public float getPotencia() 
    {
        return potencia;
    }

    public int comparaCom(Comparável c)
    {
        if(this.acentos > ((Avião)c).acentos){return 1;}
        else if(this.acentos < ((Avião)c).acentos){return -1;}
        return 0;
    }

    @Override
    public String toString() 
    {
        return "Potência: " + this.potencia + "n° Acentos: " + this.acentos; 
    }
}