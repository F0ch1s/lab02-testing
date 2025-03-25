package caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();
        shift = shift % 26;
        for (int i = 0; i < length; i++) {
            currentChar = message.charAt(i);
            if (currentChar == ' ') {
                sb.append(' ');
                continue;
            }
            if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";
            }
            char shiftedChar = (char) (currentChar + shift);
            if (shiftedChar > 'z') {
                shiftedChar -= 26;
            }
            if (shiftedChar < 'a') {
                shiftedChar += 26;
            }
            sb.append(shiftedChar);
        }
        return sb.toString();
    }
}
