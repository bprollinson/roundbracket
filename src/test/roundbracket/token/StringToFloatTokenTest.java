package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StringToFloatTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        StringToFloatToken token = new StringToFloatToken();

        assertTrue(token.equals(new StringToFloatToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        StringToFloatToken token = new StringToFloatToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
