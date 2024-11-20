package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ElseIfTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        ElseIfToken token = new ElseIfToken();

        assertTrue(token.equals(new ElseIfToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        ElseIfToken token = new ElseIfToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
