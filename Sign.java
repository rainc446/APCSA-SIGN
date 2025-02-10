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
        if (!message.isEmpty()){
            int newLine = 0;
            int lastLine = 0;
//            for(int i = 0; i < numberOfLines(); i++) {
//                for(int k = 0; k > lineWidth; k++){
//                    newString += message.substring(k + lastLine
//                            , k+1 + lastLine);
//                    System.out.println(newString);
//                    System.out.println(k);
//                }
//                lastLine += lineWidth;
//                newString += ";";
//            }

            for (int i = 1; i < message.length(); i++){
                if(i % lineWidth == 0){
                    newString += ";"
                }
            }
            return newString;
        }
        return null;
    }
}
