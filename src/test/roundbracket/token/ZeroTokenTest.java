package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ZeroTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        ZeroToken token = new ZeroToken();

        assertTrue(token.equals(new ZeroToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        ZeroToken token = new ZeroToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
