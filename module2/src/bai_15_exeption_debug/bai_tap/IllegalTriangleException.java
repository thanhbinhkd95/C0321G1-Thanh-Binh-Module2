package bai_15_exeption_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    String errorMessage;

    public IllegalTriangleException(String inErrorMessage) {
        this.errorMessage = inErrorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
