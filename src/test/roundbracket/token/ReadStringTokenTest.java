package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ReadStringTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        ReadStringToken token = new ReadStringToken();

        assertTrue(token.equals(new ReadStringToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        ReadStringToken token = new ReadStringToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
