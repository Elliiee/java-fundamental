package chapter20;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd){
        name = n;
        s = street;
        c = city;
        st = state;
        cd = code;
    }

    public String toString(){
        return (name + " " + street + " " + city + " " + state + " " + code); 
    }
}
