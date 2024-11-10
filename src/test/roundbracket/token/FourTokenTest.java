package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FourTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        FourToken token = new FourToken();

        assertTrue(token.equals(new FourToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        FourToken token = new FourToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
