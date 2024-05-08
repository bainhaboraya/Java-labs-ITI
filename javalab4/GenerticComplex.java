import java.math.BigDecimal;

class ComplexNumber {
    private BigDecimal real;
    private BigDecimal imaginary;

    public ComplexNumber(BigDecimal real, BigDecimal imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public BigDecimal getReal() {
        return real;
    }

    public BigDecimal getImag() {
        return imaginary;
    }

   
    public ComplexNumber addComplex(ComplexNumber number) {
        BigDecimal newReal = this.real.add(number.real);
        BigDecimal newImaginary = this.imaginary.add(number.imaginary);
        return new ComplexNumber(newReal, newImaginary);
    }

    
    public ComplexNumber subtractComplex(ComplexNumber number) {
        BigDecimal newReal = this.real.subtract(number.real);
        BigDecimal newImaginary = this.imaginary.subtract(number.imaginary);
        return new ComplexNumber(newReal, newImaginary);
    }
}

public class GenerticComplex {

    public static void main(String[] args) {
        if (args.length == 4 &&
                args[0].matches("-?\\d+(\\.\\d+)?") && args[1].matches("-?\\d+(\\.\\d+)?") &&
                args[2].matches("-?\\d+(\\.\\d+)?") && args[3].matches("-?\\d+(\\.\\d+)?")) {
            BigDecimal real1 = new BigDecimal(args[0]);
            BigDecimal imaginary1 = new BigDecimal(args[1]);
            BigDecimal real2 = new BigDecimal(args[2]);
            BigDecimal imaginary2 = new BigDecimal(args[3]);

            ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);
            ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

            ComplexNumber result = complex1.addComplex(complex2);
            System.out.println("Addition: " + result.getReal() + " + " + result.getImag() + "i");

            result = complex1.subtractComplex(complex2);
            System.out.println("Subtraction: " + result.getReal() + " + " + result.getImag() + "i");
        } else {
            System.out.println("Invalid Input");
        }
    }
}