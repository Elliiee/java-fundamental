package chapter12;

class AutoBox3 {
    public static void main(String[] args){
        Integer iob;
        //Integer iob2; 
        //int i; 

        iob = 100;
        System.out.println("original value of iob: " + iob);

        ++iob; //unbox and rebox
        System.out.println("After ++iob: " + iob);
    }
}
