package Classes.Subclasses;
import Classes.Documento;

public class Apresentação extends Documento
{
    private int qtd_slides;

    public Apresentação(String titulo, String autor, int tam, int qtd_slides)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.tam = tam;
        this.qtd_slides = qtd_slides;
    }

    @Override
    public void abrir() 
    {
        System.out.println("Apresentação aberta:\nTitulo: " + this.titulo+ " Autor: " + this.autor + "\nNúmero de Slides: " + this.qtd_slides);
    }

    @Override
    public void formatar() 
    {
        System.out.println("Slides formatados!\n");
    }
}