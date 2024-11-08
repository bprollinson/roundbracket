package roundbracket.tokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import roundbracket.token.CloseParenToken;
import roundbracket.token.EightToken;
import roundbracket.token.FalseToken;
import roundbracket.token.FiveToken;
import roundbracket.token.FourToken;
import roundbracket.token.NineToken;
import roundbracket.token.OneToken;
import roundbracket.token.OpenParenToken;
import roundbracket.token.SevenToken;
import roundbracket.token.SixToken;
import roundbracket.token.TenToken;
import roundbracket.token.ThreeToken;
import roundbracket.token.Token;
import roundbracket.token.TrueToken;
import roundbracket.token.TwoToken;
import roundbracket.token.ZeroToken;

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
    public void testTokenizeTokenizesTrue()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("true");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new TrueToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesFalse()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("false");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new FalseToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesZero()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("zero");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new ZeroToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesOne()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("one");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new OneToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesTwo()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("two");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new TwoToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesThree()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("three");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new ThreeToken());

        assertEquals(expectedTokens, tokens);
    }
 
    @Test
    public void testTokenizeTokenizesFour()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("four");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new FourToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesFive()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("five");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new FiveToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesSix()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("six");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new SixToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesSeven()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("seven");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new SevenToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesEight()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("eight");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new EightToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesNine()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("nine");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new NineToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesTen()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("ten");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new TenToken());

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
