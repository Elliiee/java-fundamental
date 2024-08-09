package chapter8;

//3 variables, 4 constructors, 1 method 
class Box {
    double width;
    double height;
    double depth;

    Box(Box ob){ 
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //default constructor 
    Box(){
        width = -1; 
        height = -1; 
        depth = -1; 
    }

    //constructor to make a cube 
    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}
