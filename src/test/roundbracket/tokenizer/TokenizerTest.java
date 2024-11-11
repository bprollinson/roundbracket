package roundbracket.tokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import roundbracket.token.BoolIsSetToken;
import roundbracket.token.CharIsSetToken;
import roundbracket.token.CloseParenToken;
import roundbracket.token.EightToken;
import roundbracket.token.FalseToken;
import roundbracket.token.FiveToken;
import roundbracket.token.FloatIsSetToken;
import roundbracket.token.FourToken;
import roundbracket.token.GetBoolToken;
import roundbracket.token.GetCharToken;
import roundbracket.token.GetFloatToken;
import roundbracket.token.GetIntToken;
import roundbracket.token.GetStringToken;
import roundbracket.token.IntIsSetToken;
import roundbracket.token.NineToken;
import roundbracket.token.OneToken;
import roundbracket.token.OpenParenToken;
import roundbracket.token.SetBoolToken;
import roundbracket.token.SetCharToken;
import roundbracket.token.SetFloatToken;
import roundbracket.token.SetIntToken;
import roundbracket.token.SetStringToken;
import roundbracket.token.SevenToken;
import roundbracket.token.SixToken;
import roundbracket.token.StringIsSetToken;
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
    public void testTokenizeTokenizesGetBool()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("get_bool");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new GetBoolToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesSetBool()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("set_bool");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new SetBoolToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesBoolIsSet()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("bool_is_set");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new BoolIsSetToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesGetInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("get_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new GetIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesSetInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("set_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new SetIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesIntIsSet()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("int_is_set");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new IntIsSetToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesGetFloat()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("get_float");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new GetFloatToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesSetFloat()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("set_float");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new SetFloatToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesFloatIsSet()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("float_is_set");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new FloatIsSetToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesGetChar()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("get_char");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new GetCharToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesSetChar()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("set_char");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new SetCharToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesCharIsSet()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("char_is_set");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new CharIsSetToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesGetString()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("get_string");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new GetStringToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesSetString()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("set_string");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new SetStringToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesStringIsSet()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("string_is_set");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new StringIsSetToken());

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
