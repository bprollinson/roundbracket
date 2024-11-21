package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EndWhileTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        EndWhileToken token = new EndWhileToken();

        assertTrue(token.equals(new EndWhileToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        EndWhileToken token = new EndWhileToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
