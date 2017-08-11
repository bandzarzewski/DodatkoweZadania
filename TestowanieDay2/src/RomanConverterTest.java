import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {
    RomanConverter testObject = new RomanConverter();

    @Test
    public void shouldReturnIWhen1IsConverter() {
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

    private void assertConversion(String expected,int number){
        Assert.assertEquals(expected, testObject.convert(number));

    }
}
