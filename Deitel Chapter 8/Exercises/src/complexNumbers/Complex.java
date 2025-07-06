package complexNumbers;

public class Complex {
    private float realPart;
    private float imaginaryPart;

    public Complex() {
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex number) {
        float sumReal = realPart + number.realPart;
        float sumImaginary = imaginaryPart + number.imaginaryPart;
        return new Complex(sumReal, sumImaginary);
    }

    public Complex subtract(Complex number) {
        float differenceReal = realPart - number.realPart;
        float differenceImaginary = imaginaryPart - number.imaginaryPart;
        return new Complex(differenceReal, differenceImaginary);
    }

    @Override
    public String toString() {
        return "(" + realPart + ", " + imaginaryPart + ")";
    }

    public void print() {
        System.out.println(toString());
    }
}

class ComplexTest {
    public static void main(String[] args) {
        Complex number1 = new Complex(1, 2);
        Complex number2 = new Complex(3, 4);
        Complex number3 = new Complex();

        Complex sum = number1.add(number2);
        sum.print();

        Complex difference = number2.subtract(number3);
        difference.print();
    }
}
