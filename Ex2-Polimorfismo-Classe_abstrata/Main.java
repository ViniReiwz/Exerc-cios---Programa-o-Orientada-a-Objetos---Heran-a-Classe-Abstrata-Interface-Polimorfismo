import java.util.ArrayList;
import java.util.List;
import Classes.*;
import Classes.Subclasses.*;

public class Main 
{

    public static void main(String[] args) 
    {
        List<Documento> docs = new ArrayList<>();

        docs.add(new Apresentação("Apresentação-POO","Cleber Machado",2,100));
        docs.add(new Texto("Texto-POO", "Vinicius Reis", 100000000, 2));
        docs.add(new Planilha("Planilha-POO", "Antonio Nunes", 50, 325));

        for(Documento doc : docs)
        {
            doc.abrir();
            doc.formatar(); 
            System.out.println(doc);
        }
    }
     
}