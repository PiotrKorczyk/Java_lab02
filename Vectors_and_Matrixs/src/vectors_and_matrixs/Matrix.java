package vectors_and_matrixs;



public class Matrix {

    private double[][] matrixArray;
    private static int globalMatrixCount = 0;
    private int matrixCount;

    public int getMatrixCount() {
        return matrixCount;
    }

    public int getMatrixLenght() {
        return matrixArray.length;
    }

    public double getIndexOfMatrixArray(int _height, int _width) {
        return matrixArray[_height][_width];
    }

    public void setIndexOfMatrixArray(int _height, int _width, double _value) {
        this.matrixArray[_height][_width] = _value;
    }

    public Matrix(double _x0y0, double _x1y0,
            double _x0y1, double _x1y1) {
        matrixArray = new double[][]{
            {_x0y0, _x1y0},
            {_x0y1, _x1y1}
        };
        matrixCount = ++globalMatrixCount;
    }

    public Matrix(double _x0y0, double _x1y0, double _x2y0,
            double _x0y1, double _x1y1, double _x2y1,
            double _x0y2, double _x1y2, double _x2y2) {
        matrixArray = new double[][]{
            {_x0y0, _x1y0, _x2y0},
            {_x0y1, _x1y1, _x2y1},
            {_x0y2, _x1y2, _x2y2}
        };
        matrixCount = ++globalMatrixCount;
    }

    public void printElementOfMatrix(int _height, int _width) {
        String _str = "Element located on the index [" + _height + "][" + _width + "] of Matrix"
                + matrixCount + ": " + getIndexOfMatrixArray(_height, _width);
        System.out.println(_str);
    }

    public void insertElementOfVector(int _height, int _width, double _newValue) {
        setIndexOfMatrixArray(_height, _width, _newValue);
        String _str = "Matrix" + matrixCount + " after inserted " + _newValue
                + " to positon [" + _height + "][" + _width + "]: " + toString();
        System.out.println(_str);
    }

    @Override
    public String toString() {
        String _str = "Matrix" + matrixCount + ": ";
        for (int i = 0; i <= matrixArray.length - 1; i++) { //height
            for (int j = 0; j <= matrixArray.length - 1; j++) {   //width
                _str += "[" + i + "][" + j + "]" + matrixArray[i][j] + "  ";
            }
            _str +="\n\t ";
        }
        return _str;
    }

}


/*
    Stack exampe
public static void main(String[] args) {

    int[][] foo = new int[][] {
        new int[] { 1, 2, 3 },
        new int[] { 1, 2, 3, 4},
    };

    System.out.println(foo.length); //2
    System.out.println(foo[0].length); //3
    System.out.println(foo[1].length); //4
}*/
