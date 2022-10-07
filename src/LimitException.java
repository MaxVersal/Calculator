public class LimitException extends RuntimeException{
    private final int attempts;

    public LimitException(int attempts){
        this.attempts = attempts;
    }
    public LimitException(String message, int attempts){
        super(message);
        this.attempts = attempts;
    }

    public int getAttempts(){
        return attempts;
    }

    public String getDetailMessage(){
        return "Превышен лимит ошибок ввода: " + getAttempts();
    }
}
