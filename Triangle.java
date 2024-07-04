class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }

    //override area for right triangle
    double area(){
        System.out.println("inside area for triangle.");
        return dim1 * dim2 / 2;
    }
}
