package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class IntToCharTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        IntToCharToken token = new IntToCharToken();

        assertTrue(token.equals(new IntToCharToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        IntToCharToken token = new IntToCharToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
