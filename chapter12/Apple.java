package chapter12;

//Use an enum constructor, instance variable, and method
enum Apple {
    //the number is the price for each apple 
    //the constructor is called for each constant
    Johnathan(10), GoldenDel(9), RedDel(), Winesap(15), Cortland(8);

    private int price; //price of each apple 

    //constructor 
    Apple(int p){
        price = p;
    }

    //overloaded constructor
    //default constructor 
    Apple() {price = -1;}

    int getPrice(){
        return price;
    }
}
