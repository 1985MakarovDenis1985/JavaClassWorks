package telran.VolotileApp;

import java.util.concurrent.atomic.AtomicBoolean;

public class InfintyLoop implements Runnable{
//    volatile boolean flag = true;
    AtomicBoolean flag = new AtomicBoolean(true);
    public boolean isFlag() {
//        return flag;
        return flag.get();
    }

    public void setFlag(boolean flag) {
//        this.flag = flag;
        this.flag.set(flag);

    }

    @Override
    public void run() {
//        while (flag);
        while (flag.get());
        System.out.println("Finished");
    }
}


