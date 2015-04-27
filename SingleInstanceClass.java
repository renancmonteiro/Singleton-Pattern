package singleton;

public class SingleInstanceClass {

    private static SingleInstanceClass instance;
    private String message;

    private SingleInstanceClass() {
    }

    public static SingleInstanceClass getInstance() {
        if (instance == null) {
            instance = new SingleInstanceClass();
        }
        return instance;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        return "Message: " + this.message;
    }
}
