package vectors_and_matrixs;

public class Vector {

    private double[] vectorArray;
    private static int globalVectorCount = 0;
    private int vectorCount;
    
    public int getVectorCount(){
        return vectorCount;
    }
    
    public int getVectorLenght(){
        return vectorArray.length;
    }
    
    public double getIndexOfVecArray(int _index){
        return vectorArray[_index];
    }
    
    public void setIndexOfVecArray(int _index, double _value){
        this.vectorArray[_index] = _value;
    }

    public Vector(double _x0, double _x1) {
        vectorArray = new double[]{_x0, _x1};
        vectorCount = ++globalVectorCount;
    }

    public Vector(double _x0, double _x1, double _x2) {
        vectorArray = new double[]{_x0, _x1, _x2};
        vectorCount = ++globalVectorCount;
    }

    public Vector(double _x0, double _x1, double _x2, double _x3) {
        vectorArray = new double[]{_x0, _x1, _x2, _x3};
        vectorCount = ++globalVectorCount;
    }

    public Vector(double _x0, double _x1, double _x2, double _x3, double _x4) {
        vectorArray = new double[]{_x0, _x1, _x2, _x3, _x4};
        vectorCount = ++globalVectorCount;
    }

    public Vector(double _x0, double _x1, double _x2, double _x3, double _x4, double _x5) {
        vectorArray = new double[]{_x0, _x1, _x2, _x3, _x4, _x5};
        vectorCount = ++globalVectorCount;
    }

    
    public void printElementOfVector(int _index){
       String _str = "Element located on the index ["+_index+"] of Vector" 
               +vectorCount+": " + getIndexOfVecArray(_index);
        System.out.println(_str);
    }
    
    public void insertElementOfVector(int _index,double _newValue){
        setIndexOfVecArray(_index,_newValue);
         String _str = "Vector"+vectorCount+" after inserted "+_newValue +
                  " to positon ["+_index+"]: "+toString();
        System.out.println(_str);
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
