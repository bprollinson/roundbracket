package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class IntIsCharTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        IntIsCharToken token = new IntIsCharToken();

        assertTrue(token.equals(new IntIsCharToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        IntIsCharToken token = new IntIsCharToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
