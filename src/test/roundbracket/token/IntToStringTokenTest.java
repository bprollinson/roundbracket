package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class IntToStringTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        IntToStringToken token = new IntToStringToken();

        assertTrue(token.equals(new IntToStringToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        IntToStringToken token = new IntToStringToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
