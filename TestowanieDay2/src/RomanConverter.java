/**
 * Created by RENT on 2017-08-11.
 */
public class RomanConverter {

    private String[] romanNumers ={"I","IV","V","IX","X","XL","L","XC","C","CD","D","M"};
    private int[] romanValues={1,4,5,9,10,40,50,90,100,400,500,1000};

    public String convert(int number) {
        String result = "";
        int romanIndex=romanNumers.length-1;

        while (number > 0) {

            // romanIndex - najwiekszy element !

            while (romanValues[romanIndex] <= number) {
                result += romanNumers[romanIndex];
                number -= romanValues[romanIndex];
            }
            romanIndex--;
        }
            return result;
        }
    }

