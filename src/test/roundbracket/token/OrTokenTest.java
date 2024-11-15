package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class OrTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        OrToken token = new OrToken();

        assertTrue(token.equals(new OrToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        OrToken token = new OrToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
