package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class RoundTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        RoundToken token = new RoundToken();

        assertTrue(token.equals(new RoundToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        RoundToken token = new RoundToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
