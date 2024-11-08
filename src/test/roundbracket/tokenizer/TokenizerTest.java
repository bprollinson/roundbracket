package roundbracket.tokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import roundbracket.token.CloseParenToken;
import roundbracket.token.OpenParenToken;
import roundbracket.token.Token;

import java.util.ArrayList;
import java.util.List;

public class TokenizerTest
{
    @Test
    public void testTokenizeTokenizesEmptyString()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("");
        List<Token> expectedTokens = new ArrayList<Token>();

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesOpenParenthesis()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("(");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new OpenParenToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesCloseParenthesis()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize(")");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new CloseParenToken());
 
        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMultipleParentheses()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("(())");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new OpenParenToken());
        expectedTokens.add(new OpenParenToken());
        expectedTokens.add(new CloseParenToken());
        expectedTokens.add(new CloseParenToken());

        assertEquals(expectedTokens, tokens);
    }
}
