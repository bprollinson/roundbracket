package roundbracket.token;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EndIfTokenTest
{
    @Test
    public void testEqualsReturnsTrueForTokenWithSameClass()
    {
        EndIfToken token = new EndIfToken();

        assertTrue(token.equals(new EndIfToken()));
    }

    @Test
    public void testEqualsReturnsFalseForTokenWithDifferentClass()
    {
        EndIfToken token = new EndIfToken();

        assertFalse(token.equals(new CloseParenToken()));
    }
}
