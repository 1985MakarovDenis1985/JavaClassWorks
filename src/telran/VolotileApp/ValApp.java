package telran.VolotileApp;

public class ValApp {
    public static void main(String[] args) throws InterruptedException {
        InfintyLoop task = new InfintyLoop();
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(1000);
        task.setFlag(false);
        System.out.println(task.isFlag());
    }
}
