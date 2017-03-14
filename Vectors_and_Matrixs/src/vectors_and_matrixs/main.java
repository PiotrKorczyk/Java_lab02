package vectors_and_matrixs;

/**
 *
 * @author user
 */
public class main {

    /**
     * j
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector v = new Vector(2, 3, 4, 5, 4);
        Vector a = new Vector(2, -1);
        Vector z = new Vector(3, 4);
//        System.out.println(v);
//        v.printElementOfVector(3);
//        z.printElementOfVector(1);
//        v.insertElementOfVector(3, 31);
//        z.insertElementOfVector(0, -132);
//        a.insertElementOfVector(2, 23.21);
        Calculator calc = new Calculator();
//        calc.addVectors(z, a);
//        calc.calculateScalar(a, z, 0);   

        Matrix m1 = new Matrix(0, 0, 0, 2, 4, 6, 2, 4, 6);
        System.out.println(m1);
        Vector v1 = new Vector(4, 4, 4);
        calc.matrixMultiplyVector(m1, v1);

    }

}
