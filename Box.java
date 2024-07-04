public class Box {
    private double width;
    private double height;
    private double depth;

    //constructor clone of an object
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructor when all dimensions specified 
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

    Box(double len){
        width = height = depth = len;
    }

    //display volume of a box 
    double volume(){
        return width*depth*height;
    }

    
}
