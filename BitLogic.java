public class BitLogic {
    public static void main(String[] args){
        String[] binary = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", //0 - 7
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" //8 - 15
        };
        int a = 3;
        int b = 6; 
        int c = a | b; //OR
        int d = a & b; //AND
        int e = a ^ b; //XOR
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println("a = " + binary[a]);    //0011
        System.out.println("b = " + binary[b]);    //0110
        System.out.println("a|b = " + binary[c]);  //0111
        System.out.println("a&b " + binary[d]);    //0010
        System.out.println("a^b " + binary[e]);    //0101
        System.out.println("~a&b | b&~a " + binary[f]); //0101
        System.out.println("~a " + binary[g]); //1100
    }
}
