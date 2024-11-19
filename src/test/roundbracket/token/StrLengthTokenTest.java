package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StrLengthTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        StrLengthToken token = new StrLengthToken();

        assertTrue(token.equals(new StrLengthToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        StrLengthToken token = new StrLengthToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
