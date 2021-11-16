package labs.ch03;

/**
 * класс Runner:
 * concatRunnables(Runnable[] runnables) возвращает runnables с выполненным run()
 * Execute(Runnable[] runnables) запускает runnables в отдельном потоке
 */
public class Runner {

    /**
     * возвращает runnables с выполненным run()
     * @param runnables
     * @return
     */
    public static Runnable concatRunnables(Runnable[] runnables) {
        return () -> {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        };
    }

    /**
     * запускает runnables в отдельном потоке
     * @param runnables
     */
    public static void Execute(Runnable[] runnables) {
        Runnable runnable = concatRunnables(runnables);
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
