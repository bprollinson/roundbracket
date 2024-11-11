package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class NineTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        NineToken token = new NineToken();

        assertTrue(token.equals(new NineToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        NineToken token = new NineToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
