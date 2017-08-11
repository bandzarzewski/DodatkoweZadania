/**
 * Created by RENT on 2017-08-11.
 */
public class RomanConverter {


    public String convert(int number) {
        String result = "";
        if (number == 9) return "IX";

        if (number >= 10) {
            result = "X";
            number -= 10; // tutaj odejmujemy
        }

        if (number == 4) return result += "IV"; // sklejamy 10 i 4
        if (number >= 5) {
            result = "V";
            number -= 5;
        }
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }
}
