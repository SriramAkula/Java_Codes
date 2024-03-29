class A extends Thread{
    public void run(){
        for(int i=0;i<=15;i++){
            
            System.out.println("Executing A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=15;i++){
            
            System.out.println("From B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
public class A1_threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());
        //obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
//Thread implements from runnable(fun interface )
//It has fun run(). So must be implemented(compulsory)
//To call the method use start method