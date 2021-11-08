package telran.MultiThreadingInTo.tasks;

public class MyTaskImplements implements Runnable{
    private  String name;
    private int max;

    public MyTaskImplements(String name, int max) {
        this.name = name;
        this.max = max;
    }

    @Override
    public void run() {
        System.out.println(name + " starting...");
        for (int i=0; i<max; i++){
            System.out.println("In thread " + name + ", count = " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("----- " + name + " ...end");
    }
}
