package oppconcept;

public class FunctionBasic {
    public static void main(String[] args) {
        FunctionBasic fb = new FunctionBasic();

        int a = 7;
        int b = 3;
        int result = fb.multiply(a, b);
        int result1 = fb.add(a, b);
        int result2= fb.subtract( a, b);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);



    }

    public int multiply(int a, int b) {
        return a * b;

    }

    public int add(int a, int b) {
        return (a + b);
    }
    public int subtract(int a,int b) {
        return (a -b);
    }



}
