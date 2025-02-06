public class Sign {

    private String message;
    private int lineWidth;
    public Sign(String message, int lineWidth){
        this.message = message;
        this.lineWidth = lineWidth;
    }
    public int numberOfLines(){
        int lines = message.length() / lineWidth;
        if(message.length() % lineWidth == 0) return lines;
        else return lines + 1;
    }
    public String getLines(){
        if (message.length() == 0){
            return null;
        }
        else {

            return newString;
        }

        return null;
    }
}
