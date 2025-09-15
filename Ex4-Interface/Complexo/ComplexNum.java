package Complexo;

public class ComplexNum 
{
 
    private double real;
    private double imag;

    public ComplexNum(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    public double module()
    {
        return Math.sqrt((this.real*this.real + this.imag*this.imag));
    }

    public double getReal() 
    {
        return real;
    }

    public double getImag() 
    {
        return imag;
    }

    public void setImag(double imag) 
    {
        this.imag = imag;
    }

    public void setReal(double real) 
    {
        this.real = real;
    }

    @Override
    public String toString() 
    {
        return "Número Complexo: " + this.real + " + (" + this.imag+")j";    
    }

    public ComplexNum add(ComplexNum n)
    {
        ComplexNum newnumb = new ComplexNum(0, 0);

        newnumb.real = this.real + n.real;
        newnumb.imag = this.imag + n.imag;

        return newnumb;
    }

    public ComplexNum mult(ComplexNum n)
    {
        ComplexNum newnumb = new ComplexNum(0, 0);

        newnumb.real = this.real * n.real + (this.real * n.imag);
        newnumb.imag = -1*(this.imag * n.imag);

        return newnumb;
    }

}