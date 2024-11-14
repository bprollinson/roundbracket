package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FloatToStringTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        FloatToStringToken token = new FloatToStringToken();

        assertTrue(token.equals(new FloatToStringToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        FloatToStringToken token = new FloatToStringToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
