import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class RomanConverterTest {
    private final String expectedOutput;
    private final int number;
    RomanConverter testObject = new RomanConverter();

    // To jest framework
    // https://www.mkyong.com/unittest/junit-4-tutorial-6-parameterized-test/
    @Parameters(name = "{1}-> {0}")
    public static Object[][] data() {
        return new Object[][]{
                {"I", 1},
                {"II", 2},
                {"III", 3},
                {"IV", 4},
                {"V", 5},
                {"VI", 6},
                {"VII", 7},
                {"VIII", 8},
                {"IX",9},
                {"X",10},
                {"XI",11},
                {"XIV",14},
                {"XV",15},
                {"XIX",19},
                {"XX",20},
        };
    }

    // Konstruktor
    public RomanConverterTest(String expectedOutput, int number) {

        this.expectedOutput = expectedOutput;
        this.number = number;
    }
    @Test

    public  void assertConvertedNumber(){
        assertConversion(expectedOutput,number);
    }

    private void assertConversion(String expected, int number) {
        Assert.assertEquals(expected, testObject.convert(number));

    }
}
