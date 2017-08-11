import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {
    RomanConverter testObject = new RomanConverter();

    @Test
    public void shouldReturnIWhen1IsConverter() {
        Assert.assertEquals("I", testObject.convert(1));//
    }
    @Test
    public void shouldReturnIIWhen2IsConverted() {
        Assert.assertEquals("II", testObject.convert(2));
    }
    @Test
    public void shouldReturnIIIWhen3IsConverted() {
        assertConversion("III", 3);
    }
    private void assertConversion(String expected,int number){
        Assert.assertEquals(expected, testObject.convert(number));

    }
}
