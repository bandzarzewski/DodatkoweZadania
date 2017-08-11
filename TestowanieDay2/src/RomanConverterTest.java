import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {

    @Test
    public void nothing(){
        RomanConverter testObject = null;
        Assert.assertEquals("I",testObject.convert(1));//

    }
}
