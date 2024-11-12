package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FloatIsSetTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        FloatIsSetToken token = new FloatIsSetToken();

        assertTrue(token.equals(new FloatIsSetToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        FloatIsSetToken token = new FloatIsSetToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
