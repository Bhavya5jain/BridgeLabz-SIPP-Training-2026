package coreJavaPractice.gcr_codebase.ExceptionHandling.PracticeProblem;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}