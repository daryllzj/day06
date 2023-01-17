package sdf;

public class MyRunnableImplementation implements Runnable{
    
    private String taskname;

    public MyRunnableImplementation() {
    }

    public MyRunnableImplementation(String taskname) {
        this.taskname = taskname;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + taskname+ "\tRunnable ..." + i);
        }

    }
    
}
