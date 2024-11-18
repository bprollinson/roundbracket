package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MultiplyFloatTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        MultiplyFloatToken token = new MultiplyFloatToken();

        assertTrue(token.equals(new MultiplyFloatToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        MultiplyFloatToken token = new MultiplyFloatToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
