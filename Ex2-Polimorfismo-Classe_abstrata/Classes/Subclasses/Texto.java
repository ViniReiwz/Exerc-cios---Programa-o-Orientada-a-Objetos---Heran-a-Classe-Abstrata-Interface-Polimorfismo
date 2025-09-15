package Classes.Subclasses;
import Classes.Documento;

public class Texto extends Documento 
{
    private int word_n;

    public Texto(String titulo, String autor, int tam, int word_n)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.tam = tam;
        this.word_n = word_n;
    }


    @Override
    public void abrir() 
    {
        System.out.println("Texto aberto:\n" + "Autor: " + this.autor + " Titulo: " + this.titulo + "\n" + "Nro de palavras: " + this.word_n);
    }

    @Override
    public void formatar()
    {
        System.out.println("Palavras do texto justificadas !\n");
    }
}
