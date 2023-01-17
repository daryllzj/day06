package sdf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

        List <Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Tim", "Ong", 1000));
        employees.add(new Employee(2, "Tom", "Ang", 2000));
        employees.add(new Employee(3, "Tam", "Eng", 3000));
        employees.add(new Employee(4, "Timmy", "Ng", 4000));
        employees.add(new Employee(5, "Tommy", "Long", 5000));

        System.out.println("before sorted");
        employees.forEach(e -> System.out.println(e));

        

        // contains is case sensitive. need to change names to lower
        // List<Employee> filteredEmployee = employees.stream().filter(e -> e.getLastname().toLowerCase().contains("on")).collect(Collectors.toList());

        // create sorted list
        List<Employee> filteredEmployee = employees.stream().filter(e -> e.getLastname().contains("on")).collect(Collectors.toList());
        System.out.println("filtered list");
        filteredEmployee.forEach(emp -> System.out.println(emp));

        System.out.println("after sorted");
        employees.sort(Comparator.comparing(e -> e.getFirstName()));
        employees.forEach(e -> System.out.println(e));

        System.out.println("after reversed sorted");
        Comparator<Employee> compare = Comparator.comparing(e-> e.getFirstName());
        employees.sort(compare.reversed());
        employees.forEach(e -> System.out.println(e));

        System.out.println("sort by group");
        Comparator<Employee> groupBycompare = Comparator.comparing(Employee::getFirstName).thenComparing(e -> e.getLastname());
        employees.sort(groupBycompare);
        employees.forEach(e -> System.out.println(e));

    }
}
