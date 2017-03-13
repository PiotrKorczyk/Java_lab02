package vectors_and_matrixs;

import java.util.*;

public class Vector {

    private double[] vectorArray;
    private static int vectorCount = 0;
    
    public double getIndexOfVecArray(int _index){
        return vectorArray[_index];
    }

    public Vector(double _x0, double _x1) {
        vectorArray = new double[]{_x0, _x1};
        vectorCount++;
    }

    public Vector(double _x0, double _x1, double _x2) {
        vectorArray = new double[]{_x0, _x1, _x2};
        vectorCount++;
    }

    public Vector(double _x0, double _x1, double _x2, double _x3) {
        vectorArray = new double[]{_x0, _x1, _x2, _x3};
        vectorCount++;
    }

    public Vector(double _x0, double _x1, double _x2, double _x3, double _x4) {
        vectorArray = new double[]{_x0, _x1, _x2, _x3, _x4};
        vectorCount++;
    }

    public Vector(double _x0, double _x1, double _x2, double _x3, double _x4, double _x5) {
        vectorArray = new double[]{_x0, _x1, _x2, _x3, _x4, _x5};
        vectorCount++;
    }

    @Override
    public String toString() {
        String _str ="Vector" + vectorCount +": ";
        for(int i =0;i<=vectorArray.length-1;i++){
            _str += "["+i+"]"+vectorArray[i]+"   ";
        }
        return _str;
    }

}
