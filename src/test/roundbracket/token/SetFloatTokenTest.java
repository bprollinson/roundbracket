package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SetFloatTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        SetFloatToken token = new SetFloatToken();

        assertTrue(token.equals(new SetFloatToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        SetFloatToken token = new SetFloatToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
