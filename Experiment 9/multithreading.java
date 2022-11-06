class multithreading implements multi{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}

public class MultiInterface{
    public static void main(String args[]){
        multi m = new multithreading();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);

        t1.start();
        t2.start();
        t3.start();
}