public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor 
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box(double len){
        width = height = depth = len;
    }

    //display volume of a box 
    double volume(){
        return width*depth*height;
    }

    
}
