package chapter8;

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    double area(){
        double area = dim1 * dim2;
        System.out.println(area);
        return area;
    }
}
