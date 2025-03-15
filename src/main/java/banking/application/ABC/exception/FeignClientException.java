package banking.application.ABC.exception;

public class FeignClientException extends RuntimeException{
    public FeignClientException(){
        super();
    }
    public FeignClientException(String message){
        super(message);
    }
}