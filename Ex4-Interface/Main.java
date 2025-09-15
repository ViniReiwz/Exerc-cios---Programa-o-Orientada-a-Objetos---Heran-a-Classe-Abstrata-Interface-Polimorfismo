import Complexo.*;

public class Main 
{

    public static void main(String[] args) 
    {
           
        ComplexCalc calcs = new ComplexCalc(new ComplexSum());

        ComplexNum a = new ComplexNum(1, 2);
        ComplexNum b = new ComplexNum(3, -3);

        calcs.calcular(a, b);

    }

}
