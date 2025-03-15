package banking.application.ABC.exception;

public class UnauthorizedAccessException extends RuntimeException{
    public static final String code = "00580";

    public static final String message = "Unauthorized Access on this functionality";
    public UnauthorizedAccessException(){
        super(message);
    }

    public UnauthorizedAccessException(String message){
        super(message);
    }
}
