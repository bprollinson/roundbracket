package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StrCharTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        StrCharToken token = new StrCharToken();

        assertTrue(token.equals(new StrCharToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        StrCharToken token = new StrCharToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
