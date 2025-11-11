package Meeting5;

public class Math {
    private int a, b, c;
    private double d, e;

    public Math(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int add(int a, int b) {
        return a + b;
    }

}

class MathAdvanced extends Math {
    public MathAdvanced(int a, int b) {
        super(a, b);
    }
    public int modulus(int a, int b) {
        return a % b;
    }
}

class MathVeryAdvanced extends MathAdvanced {
    public MathVeryAdvanced(int a, int b) {
        super(a, b);
    }
    public static int sumThree(int a, int b, int c) {
        return a + b + c;
    }
}

class MathAdvancedAction {
    public static void main(String[] args) {
        MathAdvanced m = new MathAdvanced(1, 2);
        System.out.println(m.modulus(10, 2));
        System.out.println(m.add(10, 2));
        System.out.println(m.multiply(10, 2));
    }
}

class MathVeryAdvancedAction {
    public static void main(String[] args) {
        MathVeryAdvanced mv  = new MathVeryAdvanced(3, 4);
        System.out.println(mv.modulus(10, 2));
        System.out.println(mv.add(10, 2));
        System.out.println(mv.multiply(10, 2));
        System.out.println(mv.sumThree(10, 2, 5));
    }
}