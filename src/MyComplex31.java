public class MyComplex31 {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex31() {
        this.real = 0.0;
        this.imag = 0.0;
    }


    public MyComplex31(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;

    }
    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return real + "+" + imag + "i";
    }


    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }


    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex31 another) {
        return this.real == another.real && this.imag == another.imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex31 addInto(MyComplex31 right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex31 addNew(MyComplex31 right) {
        return new MyComplex31(this.real + right.real, this.imag + right.imag);
    }


}
