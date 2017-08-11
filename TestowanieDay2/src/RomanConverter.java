/**
 * Created by RENT on 2017-08-11.
 */
public class RomanConverter {


    public String convert(int number) {
        String result="";
        if(number==4)return "IV";
        if(number>=5) {
            result ="V";
            number-=5;
        }
//        if(number==6)return "VI";
//        if(number==7)return "VII";
//        if(number==5)return "V";

        for (int i = 0; i <number; i++) {
            result +="I";
        }
//        if (number==3 )return "III";
//        if (number==2 )return "II";
        return result;


    }

}
