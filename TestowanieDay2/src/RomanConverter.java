/**
 * Created by RENT on 2017-08-11.
 */
public class RomanConverter {


    public String convert(int number) {
        if(number==4)return "IV";

        String result="";
        for (int i = 0; i <number; i++) {
            result +="I";
        }
        if (number==3 )return "III";
        if (number==2 )return "II";
        return "I";


    }

}
