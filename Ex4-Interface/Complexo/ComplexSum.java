package Complexo;

public class ComplexSum implements ComplexOp
{
    public ComplexNum executar(ComplexNum a, ComplexNum b) 
    {
        ComplexNum result = new ComplexNum(0, 0);

        double real = a.getReal() + b.getReal();
        double imag = a.getImag() + b.getImag();

        result.setReal(real);
        result.setImag(imag);

        return result;
    }
}
