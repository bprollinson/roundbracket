package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AddIntTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        AddIntToken token = new AddIntToken();

        assertTrue(token.equals(new AddIntToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        AddIntToken token = new AddIntToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
