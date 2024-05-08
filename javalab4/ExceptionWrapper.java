class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class ExceptionThrower {
    public void firstmethod() throws MyException {
        throw new MyException("hiiiiiii exception from first method");
    }

    public void secondmethod() throws MyException {
        throw new MyException("hiiiiiii exception from first method");
    }

    public void thirdmethod() throws MyException {
        throw new MyException("hiiiiiii exception from first method");
    }
}

class ExceptionHandler {
    public void callMethods() {
        ExceptionThrower thrower = new ExceptionThrower();
        try {
            thrower.firstmethod();
            thrower.secondmethod();
            thrower.thirdmethod();
        } catch (MyException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

public class ExceptionWrapper {
    public static void main(String[] args)  {
        ExceptionHandler handler = new ExceptionHandler();
        handler.callMethods();
     // throw new MyException("hi from try and catch");
    
    }
}