package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FiveTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        FiveToken token = new FiveToken();

        assertTrue(token.equals(new FiveToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        FiveToken token = new FiveToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
