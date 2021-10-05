package labs.ch03;

/**
 * 14
 */
public class Runner  {
    Runnable[] actions;

    public static Runnable concatRunnables(Runnable[] runnables) {
        return () -> {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        };
    }
    public static void Execute(Runnable[] runnables){
        Runnable runnable = concatRunnables(runnables);
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
