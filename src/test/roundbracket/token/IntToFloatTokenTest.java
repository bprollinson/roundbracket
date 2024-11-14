package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class IntToFloatTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        IntToFloatToken token = new IntToFloatToken();

        assertTrue(token.equals(new IntToFloatToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        IntToFloatToken token = new IntToFloatToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
