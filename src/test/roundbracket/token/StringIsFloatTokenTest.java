package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StringIsFloatTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        StringIsFloatToken token = new StringIsFloatToken();

        assertTrue(token.equals(new StringIsFloatToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        StringIsFloatToken token = new StringIsFloatToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
