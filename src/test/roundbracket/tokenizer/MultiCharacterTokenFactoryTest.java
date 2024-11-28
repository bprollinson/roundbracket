package roundbracket.tokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import roundbracket.token.EightToken;
import roundbracket.token.FalseToken;
import roundbracket.token.FiveToken;
import roundbracket.token.FourToken;
import roundbracket.token.NineToken;
import roundbracket.token.OneToken;
import roundbracket.token.SevenToken;
import roundbracket.token.SixToken;
import roundbracket.token.TenToken;
import roundbracket.token.ThreeToken;
import roundbracket.token.Token;
import roundbracket.token.TrueToken;
import roundbracket.token.TwoToken;
import roundbracket.token.ZeroToken;

public class MultiCharacterTokenFactoryTest
{
    @Test
    public void testCreateTokenCreatesFalseToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("false");
        Token expectedToken = new FalseToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesTrueToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("true");
        Token expectedToken = new TrueToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesZeroToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("zero");
        Token expectedToken = new ZeroToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesOneToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("one");
        Token expectedToken = new OneToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesTwoToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("two");
        Token expectedToken = new TwoToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesThreeToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("three");
        Token expectedToken = new ThreeToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesFourToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("four");
        Token expectedToken = new FourToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesFiveToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("five");
        Token expectedToken = new FiveToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesSixToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("six");
        Token expectedToken = new SixToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesSevenToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("seven");
        Token expectedToken = new SevenToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesEightToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("eight");
        Token expectedToken = new EightToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesNineToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("nine");
        Token expectedToken = new NineToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesTenToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("ten");
        Token expectedToken = new TenToken();

        assertEquals(expectedToken, token);
    }
}
