package vectors_and_matrixs;

public class Calculator {

    public Calculator() {

    }

    private boolean canIAddVectors(Vector _v1, Vector _v2) {
        return _v1.getVectorLenght() == _v2.getVectorLenght();
    }

    public void addVectors(Vector _v1, Vector _v2) {
        String _str = "Vector" + _v1.getVectorCount() + " + Vector" + _v2.getVectorCount()
                + ": ";
        if (canIAddVectors(_v1, _v2) == true) {
            for (int i = 0; i <= _v1.getVectorLenght() - 1; i++) {
                double _tmp = _v1.getIndexOfVecArray(i) + _v2.getIndexOfVecArray(i);
                _str += "  [" + i + "]" + _tmp;
            }
            System.out.println(_str);
        } else {
            System.out.println("Can't add vectors different lenght!");
        }
    }

    public void calculateScalar(Vector _v1, Vector _v2, double _degrees) {
        String _str = "Vector" + _v1.getVectorCount() + " (scalar) Vector" + _v2.getVectorCount()
                + ": ";
        double _tmp = 0;
        if (canIAddVectors(_v1, _v2) == true) {
            for (int i = 0; i <= _v1.getVectorLenght() - 1; i++) {
                _tmp += _v1.getIndexOfVecArray(i) * _v2.getIndexOfVecArray(i);
            }
            System.out.println(_str += (_tmp * Math.cos(_degrees)));
        } else {
            System.out.println("Can't calculate scalar vectors different lenght!");
        }
    }

    private boolean canIMultiplyMatrixByVector(Matrix _matrix, Vector _vector) {
        return _vector.getVectorLenght() == _matrix.getMatrixLenght();
    }

    public void matrixMultiplyVector(Matrix _matrix, Vector _vector) {
        String _str = "Matrix" + _matrix.getMatrixCount() + " multiplied Vector" + _vector.getVectorCount()
                + ": ";
        double _tmp = 0;
        if (canIMultiplyMatrixByVector(_matrix, _vector) == true) {        //height
            for (int i = 0; i <= _matrix.getMatrixLenght() - 1; i++) {      //width
                for (int j = 0; j <= _matrix.getMatrixLenght() - 1; j++) {
                    _tmp += _matrix.getIndexOfMatrixArray(i, j) * _vector.getIndexOfVecArray(i);
                }
                _str += "["+i+"]"+_tmp+"  ";
                _tmp =0;
            }
            System.out.println(_str);
        } else {
            System.out.println("Can't multiply matrix by vectors different lenght!");
        }
    }

}
