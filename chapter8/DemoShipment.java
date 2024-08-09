package chapter8;

class DemoShipment {
    public static void main(String[] args){
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        //it can use all the variables from class Box, BoxWeight, and Shipment 
        vol = shipment1.volume();
        System.out.println(vol);
        System.out.println(shipment1.weight);
        System.out.println(shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println(vol);
        System.out.println(shipment2.weight);
        System.out.println(shipment2.cost);
    }
}
