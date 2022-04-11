package Week2.Day2.Complex;

public class ComplexNum implements Complexable {

    protected double x;
    protected double y;

    public ComplexNum(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ComplexNum() {
        this(0, 0);
    }

    @Override
    public void add(ComplexNum z) {
        this.x += z.x;
        this.y += z.y;
    }

    @Override
    public void subtract(ComplexNum z) {
        this.x -= z.x;
        this.y -= z.y;
    }

    @Override
    public void multiply(ComplexNum z) {
        this.x *= z.x;
        this.y *= z.y;
    }

    @Override
    public void divide(ComplexNum z) {
        if (z.x != 0 && z.y != 0) {
            this.x /= z.x;
            this.y /= z.y;
        }
    }

    @Override
    public ComplexNum add(ComplexNum z1, ComplexNum z2) {
        return new ComplexNum(z1.x + z2.x, z1.y + z2.y);
    }

    public static ComplexNum addComplex(ComplexNum z1, ComplexNum z2) {
        return new ComplexNum(z1.x + z2.x, z1.y + z2.y);
        // return new ComplexNum(z1.x + z2.x, z1.y + z2.y);
    }

    @Override
    public ComplexNum subtract(ComplexNum z1, ComplexNum z2) {
        return new ComplexNum(z1.x - z2.x, z1.y - z2.y);
    }

    public static ComplexNum subtractComplex(ComplexNum z1, ComplexNum z2) {
        return new ComplexNum(z1.x - z2.x, z1.y - z2.y);
    }

    @Override
    public ComplexNum multiply(ComplexNum z1, ComplexNum z2) {
        return new ComplexNum(z1.x * z2.x, z1.y * z2.y);
    }

    public static ComplexNum multiplyComplex(ComplexNum z1, ComplexNum z2) {
        return new ComplexNum(z1.x * z2.x, z1.y * z2.y);
    }

    @Override
    public ComplexNum divide(ComplexNum z1, ComplexNum z2) {
        if (z2.x != 0 && z2.y != 0) {
            return new ComplexNum(z1.x / z2.x, z1.y / z2.y);
        } else {
            return new ComplexNum();
        }
    }

    public static ComplexNum divideComplex(ComplexNum z1, ComplexNum z2) {
        if (z2.x != 0 && z2.y != 0) {
            return new ComplexNum(z1.x / z2.x, z1.y / z2.y);
        } else {
            return new ComplexNum();
        }
    }

    @Override
    public ComplexNum conjugate() {
        return new ComplexNum(x, Math.abs(y));
    }

    @Override
    public double mag() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public ComplexNum square() {
        return new ComplexNum(Math.pow(x, 2), Math.pow(y, 2));
    }

    @Override
    public ComplexNum pow(ComplexNum z, int power) {
        return new ComplexNum(Math.pow(x, power), Math.pow(y, power));
    }

    @Override
    public ComplexNum parseComplex(String s) {
        String[] parts = s.split("+");
        double x = Double.valueOf(parts[0]);
        double y = Double.valueOf(parts[1].replace("i", ""));
        return new ComplexNum(x, y);
    }

    public static ComplexNum parseComplexComplex(String s) {
        String[] parts = s.split("\\+");
        double x = Double.valueOf(parts[0]);
        double y = Double.valueOf(parts[1].replace("i", ""));
        return new ComplexNum(x, y);
    }

    @Override
    public String toString() {
        return "" + x + " + " + y + "i";
    }

    @Override
    public ComplexNum inverse() {
        return new ComplexNum(x * -1, y * -1);
    }

    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /*
         * Check if o is an instance of Complex or not
         * "null instanceof [type]" also returns false
         */
        if (!(o instanceof ComplexNum)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        ComplexNum c = (ComplexNum) o;

        // Compare the data members and return accordingly
        return Double.compare(x, c.x) == 0
                && Double.compare(y, c.y) == 0;
    }

}
