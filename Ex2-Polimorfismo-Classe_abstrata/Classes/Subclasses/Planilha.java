package Classes.Subclasses;
import Classes.Documento;

public class Planilha extends Documento
{
    private int qtd_cells;

    public Planilha(String titulo, String autor, int tam, int qtd_cells)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.tam = tam;
        this.qtd_cells = qtd_cells;
    }

    @Override
    public void abrir()
    {
        System.out.println("Planilha aberta:\nTitulo: " + this.titulo + " Autor: " + this.autor + "\n" + "Quantidade de células: " + this.qtd_cells);
    }

    @Override
    public void formatar() 
    {
        System.out.println("Células centralizadas !\n");
    }
}
