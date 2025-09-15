package Classes;

public abstract class Documento 
{
    protected String titulo;
    protected String autor;
    protected int tam;

    public abstract void abrir();
    public abstract void formatar();

    @Override
    public String toString() 
    {
        return "Titulo: " + this.titulo + " Autor: " + this.autor + '\n';
    }
}
