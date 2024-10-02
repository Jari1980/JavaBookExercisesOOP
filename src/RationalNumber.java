public class RationalNumber {
    int denominator;
    int numerator;

    public RationalNumber(int denominator, int numerator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public String rational(){
        return numerator + "/" + denominator;
    }
}
