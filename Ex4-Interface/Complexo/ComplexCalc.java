package Complexo;

public class ComplexCalc 
{
    private ComplexOp operation;

    public ComplexCalc(ComplexOp operation)
    {
        this.operation = operation;
    }

    public void calcular(ComplexNum a, ComplexNum b)
    {
        System.out.println(this.operation.executar(a, b));
    }

}
