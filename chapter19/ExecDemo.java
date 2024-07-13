package chapter19;

class ExecDemo {
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec(new String[]{"notepad"});
        } catch (Exception e){
            System.out.println("Error executing notepad.");
        }
    }
}
