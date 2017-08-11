import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {

    @Test
    public void shouldReturnIWhen1IsConverter() {
        RomanConverter testObject = new RomanConverter();
        Assert.assertEquals("I", testObject.convert(1));//
    }
    @Test
            public void shouldReturnIIWhenIsConverted(){
            RomanConverter testObject = new RomanConverter();
            Assert.assertEquals("II" ,testObject.convert(2));

        }
    }

