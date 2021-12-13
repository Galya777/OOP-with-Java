package zad5;

public class MorseCode {


    String morseLetters(char letter){
        return switch (letter) {
            case 'A' -> ".-";
            case 'B' -> "-...";
            case 'C' -> "-.-.";
            case 'D' -> "-..";
            case 'E' -> ".";
            case 'F' -> "..-.";
            case 'G' -> "--.";
            case 'H' -> "....";
            case 'I' -> "..";
            case 'J' -> ".---";
            case 'K' -> "-.-";
            case 'L' -> ".-..";
            case 'M' -> "--";
            case 'N' -> "-.";
            case 'O' -> "---";
            case 'P' -> ".--.";
            case 'Q' -> "--.--";
            case 'R' -> ".-.";
            case 'S' -> "...";
            case 'T' -> "-";
            case 'U' -> "...-";
            case 'V' -> "...-";
            case 'W' -> ".--";
            case 'X' -> "-..-";
            case 'Y' -> "-.--";
            case 'Z' -> "--..";
            default -> "";
        };
    }
    String encode(String plainText){
        char[] text=plainText.toCharArray();
        char[] encode= new char[plainText.length()*5];
        int counter=0;
        for(int i=0; i<plainText.length();++i){
            String code= morseLetters(text[i]);
            for(int j=0; j<code.length();++i){
                encode[counter]=code.charAt(i);
                ++counter;
            }
            encode[counter]=' ';
            ++counter;
        }
     return new String(encode);
    }
   
}
