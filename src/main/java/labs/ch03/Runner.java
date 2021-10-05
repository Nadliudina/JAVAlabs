package labs.ch03;

/**
 * класс Runner:
 * concatRunnables(Runnable[] runnables) возвращает runnables с выполненным run()
 * Execute(Runnable[] runnables) запускает runnables в отдельном потоке
 */
public class Runner {

    public static Runnable concatRunnables(Runnable[] runnables) {
        return () -> {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        };
    }

    public static void Execute(Runnable[] runnables) {
        Runnable runnable = concatRunnables(runnables);
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
