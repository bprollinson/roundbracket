package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SetBoolTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        SetBoolToken token = new SetBoolToken();

        assertTrue(token.equals(new SetBoolToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        SetBoolToken token = new SetBoolToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
