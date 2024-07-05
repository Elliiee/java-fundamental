package mypack;

class AccountBalance {
    public static void main(String[] args){
        Balance[] current = new Balance[3];

        current[0] = new Balance("Fielding", 123.123);
        current[1] = new Balance("Will", 157.02);
        current[2] = new Balance("Tom", -12.33);

        for (int i = 0; i < current.length; i++){
            current[i].show();
        }
    }
}
