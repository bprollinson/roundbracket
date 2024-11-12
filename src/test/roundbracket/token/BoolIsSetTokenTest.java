package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BoolIsSetTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        BoolIsSetToken token = new BoolIsSetToken();

        assertTrue(token.equals(new BoolIsSetToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        BoolIsSetToken token = new BoolIsSetToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
