package MorseConverter;

public class MorseConverter {
    public static String morseConverter(String morseCode) {

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..","   " };

        String[] alfabeto = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?" ," "};

        String[] array = morseCode.split(" ");
        String convertWord = "";
        // Morse code  -- . .-. -.-. .- -.. ---   .-.. .. -... .-. .
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if(array[i].equals(morse[j])){
                    convertWord = convertWord + alfabeto[j];
                    break;
                }
            }
        }
        return convertWord;
    }
}
