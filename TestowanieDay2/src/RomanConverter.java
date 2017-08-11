/**
 * Created by RENT on 2017-08-11.
 */
public class RomanConverter {

    private String[] romanNumers ={"I","IV","V","IX","X"};
    private int[] romanValues={1,4,5,9,10};

    public String convert(int number) {
        String result = "";
        int romanIndex=romanNumers.length-1;

        for (; number > 0;) {

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

