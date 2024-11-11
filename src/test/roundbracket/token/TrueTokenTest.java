package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TrueTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        TrueToken token = new TrueToken();

        assertTrue(token.equals(new TrueToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        TrueToken token = new TrueToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
