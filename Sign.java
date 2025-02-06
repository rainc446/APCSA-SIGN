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
        int endLine;
        String newString;
        if (message.length() == 0){
            return null;
        }
        else {
            for(int i = 0; i < numberOfLines(); i++) {
                for(int newLine = ){

                }
                endLine +=
            }

            return newString;
        }

        return null;
    }
}
