package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AddFloatTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        AddFloatToken token = new AddFloatToken();

        assertTrue(token.equals(new AddFloatToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        AddFloatToken token = new AddFloatToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
