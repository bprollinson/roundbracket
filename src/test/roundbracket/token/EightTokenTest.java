package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EightTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        EightToken token = new EightToken();

        assertTrue(token.equals(new EightToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        EightToken token = new EightToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
