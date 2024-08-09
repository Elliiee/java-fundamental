package chapter8;

//subclass of Box
class BoxWeight extends Box{
    double weight;

    //可以直接用superclass的variables
    //但是可以用super()这样比较简洁
    //而且如果superclass variables are private, subclass 只能用super()不能直接用了
    BoxWeight(double w, double h, double d, double wei){
        //width = w; 
        //height = h; 
        //depth = d; 
        super(w, h, d);
        weight = wei; 
    }

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(){
        super();
        weight = -1; 
    }

    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}
