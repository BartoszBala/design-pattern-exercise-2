package account;



public class Logger {

    private static Logger INSTANCE;

    public Logger() {
    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            synchronized (Logger.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Logger();

                }

            }
        }

return INSTANCE;
    }

    public void log (String s)
    {
        System.out.println(s);
    }
}
