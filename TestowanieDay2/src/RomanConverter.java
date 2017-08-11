/**
 * Created by RENT on 2017-08-11.
 */
public class RomanConverter {

    private String[] RomanNumer={"I","IV","V","IX","X"};
    private int[] romanValues={1,4,5,9,10};

    public String convert(int number) {
        String result = "";

        for (int romanIndex=RomanNumer.length-1;number>0;romanIndex--){
            // romanIndex - najwiekszy element !
            result += RomanNumer[romanIndex];
            number -=romanValues[romanIndex];
        }
        return result;
//
//        if (number >= 10) {
//            for (;number >= 10;) { // To jest ciekawy zapis !
//            result += "X";
//            number -= 10; // tutaj odejmujemy
//        }
//        }
//        if (number == 9) return result += "IX";
//        if (number == 4) return result += "IV"; // sklejamy 10 i 4
//        if (number >= 5) {
//            result += "V";
//            number -= 5;
//        }
//        for (int i = 0; i < number; i++) {
//            result += "I";
//        }

    }
}
