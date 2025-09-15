public class Main 
{
    public static void bubble_sort(Object[] array)
    {
        int n = array.length;
        boolean trocou = false;

        for(int i = 0; i < n - 1; i++)
        {
            Comparável atual = (Comparável) array[i];
            Comparável prox = (Comparável) array[i + 1];
            
            if(atual.comparaCom(prox) > 0)
            {
                Object temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;

                trocou = true;
            }
            if(!trocou){break;}
        }
            
        
    }

    public static void print_vec(Object[] array)
    {
        int n = array.length;
        for(int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) 
    {
        
        Funcionário[] farr = new Funcionário[4]; 
        farr[0] = new Funcionário(-1, "Kingo");
        farr[1] = new Funcionário(-2, "Gelinda");
        farr[2] = new Funcionário(-3, "Tamdiva");
        farr[3] = new Funcionário(-4, "Caimona");
        
        print_vec(farr);
        bubble_sort(farr);
        System.out.println("\n\n Após ordenação por salário: \n\n");
        print_vec(farr);

        System.out.println("\n\n");

        Avião[] aarr = new Avião[4];
        aarr[0] = new Avião(123.3231f, 3);
        aarr[1] = new Avião(6152.2314f, 2);
        aarr[2] = new Avião(12498f, 1);
        aarr[3] = new Avião(123.8f, 0);

        print_vec(aarr);
        bubble_sort(aarr);
        System.out.println("\n\n Após ordenação por acentos: \n\n");
        print_vec(aarr);

    }    
}
