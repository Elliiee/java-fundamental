public class Box {
    double width;
    double height;
    double depth;

    //constructor 
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //display volume of a box 
    double volume(){
        return width*depth*height;
    }

    
}
