package sdf;

@FunctionalInterface
public interface MyRunnerInterface<T> {

    T process (T a, T b);

    // T printMessage (T a);
    
}
