package roundbracket.tokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import roundbracket.token.AndToken;
import roundbracket.token.BoolIsSetToken;
import roundbracket.token.CharIsSetToken;
import roundbracket.token.CharToIntToken;
import roundbracket.token.CharToStringToken;
import roundbracket.token.EightToken;
import roundbracket.token.FalseToken;
import roundbracket.token.FiveToken;
import roundbracket.token.FloatIsSetToken;
import roundbracket.token.FloatToStringToken;
import roundbracket.token.FourToken;
import roundbracket.token.GetBoolToken;
import roundbracket.token.GetCharToken;
import roundbracket.token.GetFloatToken;
import roundbracket.token.GetIntToken;
import roundbracket.token.GetStringToken;
import roundbracket.token.IntIsSetToken;
import roundbracket.token.IntIsCharToken;
import roundbracket.token.IntToCharToken;
import roundbracket.token.IntToFloatToken;
import roundbracket.token.IntToStringToken;
import roundbracket.token.NineToken;
import roundbracket.token.NotToken;
import roundbracket.token.OneToken;
import roundbracket.token.OrToken;
import roundbracket.token.SevenToken;
import roundbracket.token.SetBoolToken;
import roundbracket.token.SetCharToken;
import roundbracket.token.SetFloatToken;
import roundbracket.token.SetIntToken;
import roundbracket.token.SetStringToken;
import roundbracket.token.SixToken;
import roundbracket.token.StringIsFloatToken;
import roundbracket.token.StringIsIntToken;
import roundbracket.token.StringIsSetToken;
import roundbracket.token.StringToFloatToken;
import roundbracket.token.StringToIntToken;
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

    @Test
    public void testCreateTokenCreatesGetBoolToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("get_bool");
        Token expectedToken = new GetBoolToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesSetBoolToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("set_bool");
        Token expectedToken = new SetBoolToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesBoolIsSetToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("bool_is_set");
        Token expectedToken = new BoolIsSetToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesGetIntToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("get_int");
        Token expectedToken = new GetIntToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesSetIntToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("set_int");
        Token expectedToken = new SetIntToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesIntIsSetToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("int_is_set");
        Token expectedToken = new IntIsSetToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesGetFloatToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("get_float");
        Token expectedToken = new GetFloatToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesSetFloatToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("set_float");
        Token expectedToken = new SetFloatToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesFloatIsSetToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("float_is_set");
        Token expectedToken = new FloatIsSetToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesGetCharToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("get_char");
        Token expectedToken = new GetCharToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesSetCharToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("set_char");
        Token expectedToken = new SetCharToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesCharIsSetToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("char_is_set");
        Token expectedToken = new CharIsSetToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesGetStringToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("get_string");
        Token expectedToken = new GetStringToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesSetStringToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("set_string");
        Token expectedToken = new SetStringToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesStringIsSetToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("string_is_set");
        Token expectedToken = new StringIsSetToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesIntToFloatToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("int_to_float");
        Token expectedToken = new IntToFloatToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesIntIsCharToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("int_is_char");
        Token expectedToken = new IntIsCharToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesIntToCharToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("int_to_char");
        Token expectedToken = new IntToCharToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesIntToStringToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("int_to_string");
        Token expectedToken = new IntToStringToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesFloatToStringToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("float_to_string");
        Token expectedToken = new FloatToStringToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesCharToIntToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("char_to_int");
        Token expectedToken = new CharToIntToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesCharToStringToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("char_to_string");
        Token expectedToken = new CharToStringToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesStringIsIntToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("string_is_int");
        Token expectedToken = new StringIsIntToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesStringToIntToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("string_to_int");
        Token expectedToken = new StringToIntToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesStringIsFloatToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("string_is_float");
        Token expectedToken = new StringIsFloatToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesStringToFloatToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("string_to_float");
        Token expectedToken = new StringToFloatToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesAndToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("and");
        Token expectedToken = new AndToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesOrToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("or");
        Token expectedToken = new OrToken();

        assertEquals(expectedToken, token);
    }

    @Test
    public void testCreateTokenCreatesNotToken()
    {
        MultiCharacterTokenFactory tokenFactory = new MultiCharacterTokenFactory();

        Token token = tokenFactory.createToken("not");
        Token expectedToken = new NotToken();

        assertEquals(expectedToken, token);
    }
}
