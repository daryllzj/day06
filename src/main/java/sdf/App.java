package sdf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        // Thread thread1 = new Thread(new Runnable() {

        //     @Override
        //     public void run(){
        //         for (int i = 0; i < 5; i++) {
        //             System.out.println(Thread.currentThread().getName() + "\tRunnable ..." + i + " thread 1");
        //         }
        //     }
            
        // });

        // thread1.start();

        MyRunnableImplementation mRI1 = new MyRunnableImplementation("Task 1");
        MyRunnableImplementation mRI2 = new MyRunnableImplementation("Task 2");
        MyRunnableImplementation mRI3 = new MyRunnableImplementation("Task 3");
        MyRunnableImplementation mRI4 = new MyRunnableImplementation("Task 4");
        MyRunnableImplementation mRI5 = new MyRunnableImplementation("Task 5");

        // Thread thread2 = new Thread(mRI);
        // thread2.start();

        // Thread thread3 = new Thread(mRI);
        // thread3.start();

        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);
        // executorService.shutdown();

        // ExecutorService executorService = Executors.newFixedThreadPool(3);
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);
        // executorService.execute(mRI3);
        // executorService.execute(mRI4);
        // executorService.execute(mRI5);
        // executorService.shutdown();

        // ExecutorService executorService = Executors.newCachedThreadPool();
        // executorService.execute(mRI1);
        // executorService.execute(mRI2);
        // executorService.execute(mRI3);
        // executorService.execute(mRI4);
        // executorService.execute(mRI5);
        // executorService.shutdown();

        // MyRunnerInterface<Integer> addOperation = (a, b) -> {
        //     return a + b;
        // };

        MyRunnerInterface<Integer> multiplyOperation = (a, b) -> {
            return a * b;
        };

        MyRunnerInterface<Integer> minusOperation = (a, b) -> {
            return a - b;
        };

        // without {} for short line of code
        MyRunnerInterface<Integer> addOperation = (a, b) -> a + b;

        MyRunnerInterface<String> concatenateString = (a , b) -> {return a + b;};

        MyMessageInterface printString = (a) -> { System.out.println(a);};

        System.out.println("addOperation: " + addOperation.process(1, 1));
        System.out.println("multiplyOperation: " + multiplyOperation.process(2, 5));
        System.out.println("minusOperation: " + minusOperation.process(10, 2));
        System.out.println("concatenateString: " + concatenateString.process("dog and ", "cat"));
        printString.printMessage("dog and cat via printString");
    
    }
}
