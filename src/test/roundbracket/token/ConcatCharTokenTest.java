package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ConcatCharTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        ConcatCharToken token = new ConcatCharToken();

        assertTrue(token.equals(new ConcatCharToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        ConcatCharToken token = new ConcatCharToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
