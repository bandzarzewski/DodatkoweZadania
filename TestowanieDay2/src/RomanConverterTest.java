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

    @Parameters
    public static Object[][] data() {
        return new Object[][]{{"I", 1}};
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

    @Test
    public  void shouldReturnIWhen1IsConverter() {
        assertConversion("I", 1);//
    }

    @Test
    public void shouldReturnIIWhen2IsConverted() {
        assertConversion("II", 2);
    }

    @Test
    public void shouldReturnIIIWhen3IsConverted() {
        assertConversion("III", 3);
    }

    @Test
    public void shouldReturnIVWhen4IsConverted() {
        assertConversion("IV", 4);
    }

    @Test
    public void shouldReturnVWhen5IsConverted() {
        assertConversion("V", 5);
    }

    @Test
    public void shouldReturnVIWhen6IsConverted() {
        assertConversion("VI", 6);
    }

    @Test
    public void shouldReturnVIIWhen7IsConverted() {
        assertConversion("VII", 7);
    }

    @Test
    public void shouldReturnVIIIWhen8IsConverted() {
        assertConversion("VIII", 8);
    }

    private void assertConversion(String expected, int number) {
        Assert.assertEquals(expected, testObject.convert(number));

    }
}
