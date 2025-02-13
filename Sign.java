public class Sign {

    private final String message;
    private final int lineWidth;
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
        String newString = "";
        int i = 0;
        if (message.isEmpty()) {
            return null;
        }
        while (i < message.length()) {
            newString += message.charAt(i);
            i++;
            if (i % lineWidth == 0 && i != message.length()){
                newString += ";";
            }
        }
        return newString;
    }
}
