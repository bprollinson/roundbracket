package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PrintStringTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        PrintStringToken token = new PrintStringToken();

        assertTrue(token.equals(new PrintStringToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        PrintStringToken token = new PrintStringToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
