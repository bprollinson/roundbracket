package roundbracket.tokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import roundbracket.token.AddFloatToken;
import roundbracket.token.AddIntToken;
import roundbracket.token.AndToken;
import roundbracket.token.BoolIsSetToken;
import roundbracket.token.CeilingToken;
import roundbracket.token.CharIsSetToken;
import roundbracket.token.CharToIntToken;
import roundbracket.token.CharToStringToken;
import roundbracket.token.ConcatCharToken;
import roundbracket.token.ConcatStrToken;
import roundbracket.token.CloseParenToken;
import roundbracket.token.DivideFloatToken;
import roundbracket.token.DivideIntToken;
import roundbracket.token.EightToken;
import roundbracket.token.ElseIfToken;
import roundbracket.token.ElseToken;
import roundbracket.token.EmptyStrToken;
import roundbracket.token.EndIfToken;
import roundbracket.token.EndWhileToken;
import roundbracket.token.FalseToken;
import roundbracket.token.FiveToken;
import roundbracket.token.FloatIsSetToken;
import roundbracket.token.FloatToStringToken;
import roundbracket.token.FloorToken;
import roundbracket.token.FourToken;
import roundbracket.token.GetBoolToken;
import roundbracket.token.GetCharToken;
import roundbracket.token.GetFloatToken;
import roundbracket.token.GetIntToken;
import roundbracket.token.GetStringToken;
import roundbracket.token.IfToken;
import roundbracket.token.IntIsCharToken;
import roundbracket.token.IntIsSetToken;
import roundbracket.token.IntToCharToken;
import roundbracket.token.IntToFloatToken;
import roundbracket.token.IntToStringToken;
import roundbracket.token.MinusFloatToken;
import roundbracket.token.MinusIntToken;
import roundbracket.token.ModIntToken;
import roundbracket.token.MultiplyFloatToken;
import roundbracket.token.MultiplyIntToken;
import roundbracket.token.NineToken;
import roundbracket.token.NotToken;
import roundbracket.token.OneToken;
import roundbracket.token.OpenParenToken;
import roundbracket.token.OrToken;
import roundbracket.token.PrintStringToken;
import roundbracket.token.ReadStringToken;
import roundbracket.token.RoundToken;
import roundbracket.token.SetBoolToken;
import roundbracket.token.SetCharToken;
import roundbracket.token.SetFloatToken;
import roundbracket.token.SetIntToken;
import roundbracket.token.SetStringToken;
import roundbracket.token.SevenToken;
import roundbracket.token.SixToken;
import roundbracket.token.StrCharToken;
import roundbracket.token.StringIsIntToken;
import roundbracket.token.StringIsSetToken;
import roundbracket.token.StringIsFloatToken;
import roundbracket.token.StringToFloatToken;
import roundbracket.token.StringToIntToken;
import roundbracket.token.StrLengthToken;
import roundbracket.token.SubtractFloatToken;
import roundbracket.token.SubtractIntToken;
import roundbracket.token.TenToken;
import roundbracket.token.ThreeToken;
import roundbracket.token.Token;
import roundbracket.token.TrueToken;
import roundbracket.token.TwoToken;
import roundbracket.token.WhileToken;
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
    public void testTokenizeTokenizesIntToFloat()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("int_to_float");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new IntToFloatToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesIntIsChar()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("int_is_char");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new IntIsCharToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesIntToChar()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("int_to_char");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new IntToCharToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesIntToString()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("int_to_string");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new IntToStringToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesFloatToString()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("float_to_string");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new FloatToStringToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesCharToInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("char_to_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new CharToIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesCharToString()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("char_to_string");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new CharToStringToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesStringIsInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("string_is_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new StringIsIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesStringToInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("string_to_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new StringToIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesStringIsFloat()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("string_is_float");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new StringIsFloatToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesStringToFloat()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("string_to_float");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new StringToFloatToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesNot()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("not");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new NotToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesAnd()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("and");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new AndToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesOr()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("or");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new OrToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMinusInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("minus_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new MinusIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesAddInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("add_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new AddIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesSubtractInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("subtract_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new SubtractIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMultiplyInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("multiply_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new MultiplyIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesDivideInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("divide_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new DivideIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesModInt()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("mod_int");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new ModIntToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMinusFloat()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("minus_float");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new MinusFloatToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesAddFloat()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("add_float");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new AddFloatToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesSubtractFloat()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("subtract_float");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new SubtractFloatToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMultiplyFloat()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("multiply_float");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new MultiplyFloatToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesDivideFloat()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("divide_float");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new DivideFloatToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesFloor()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("floor");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new FloorToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesRound()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("round");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new RoundToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesCeiling()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("ceiling");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new CeilingToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesEmptyStr()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("empty_str");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new EmptyStrToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesStrLength()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("str_length");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new StrLengthToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesConcatStr()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("concat_str");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new ConcatStrToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesConcatChar()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("concat_char");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new ConcatCharToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesStrChar()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("str_char");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new StrCharToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesIf()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("if");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new IfToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesElseIf()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("else_if");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new ElseIfToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesElse()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("else");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new ElseToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesEndIf()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("end_if");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new EndIfToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesWhile()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("while");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new WhileToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesEndWhile()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("end_while");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new EndWhileToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesPrintString()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("print_string");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new PrintStringToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesReadString()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("read_string");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new ReadStringToken());

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

    @Test
    public void testTokenizeTokenizesMultipleParenthesesSeparatedBySpaces()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("( ( ) )");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new OpenParenToken());
        expectedTokens.add(new OpenParenToken());
        expectedTokens.add(new CloseParenToken());
        expectedTokens.add(new CloseParenToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMultipleParenthesesSeparatedByTabs()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("(\t(\t)\t)");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new OpenParenToken());
        expectedTokens.add(new OpenParenToken());
        expectedTokens.add(new CloseParenToken());
        expectedTokens.add(new CloseParenToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMultipleParenthesesSeparatedByCarriageReturns()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("(\r(\r)\r)");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new OpenParenToken());
        expectedTokens.add(new OpenParenToken());
        expectedTokens.add(new CloseParenToken());
        expectedTokens.add(new CloseParenToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMultipleParenthesesSeparatedByLineFeeds()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("(\n(\n)\n)");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new OpenParenToken());
        expectedTokens.add(new OpenParenToken());
        expectedTokens.add(new CloseParenToken());
        expectedTokens.add(new CloseParenToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeIgnoresWhitespacePrefixBeforeParenthesisToken()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize(" \t\r\n(");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new OpenParenToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeIgnoresWhitespaceSuffixAfterParenthesisToken()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("( \t\r\n");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new OpenParenToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMultipleMultiCharacterTokensSeparatedBySpaces()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("true false zero one");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new TrueToken());
        expectedTokens.add(new FalseToken());
        expectedTokens.add(new ZeroToken());
        expectedTokens.add(new OneToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMultipleMultiCharacterTokensSeparatedByTabs()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("true\tfalse\tzero\tone");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new TrueToken());
        expectedTokens.add(new FalseToken());
        expectedTokens.add(new ZeroToken());
        expectedTokens.add(new OneToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMultipleMultiCharacterTokensSeparatedByCarriageReturns()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("true\rfalse\rzero\rone");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new TrueToken());
        expectedTokens.add(new FalseToken());
        expectedTokens.add(new ZeroToken());
        expectedTokens.add(new OneToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeTokenizesMultipleMultiCharacterTokensSeparatedByLineFeeds()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("true\nfalse\nzero\none");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new TrueToken());
        expectedTokens.add(new FalseToken());
        expectedTokens.add(new ZeroToken());
        expectedTokens.add(new OneToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeIgnoresWhitespacePrefixBeforeMultiCharacterToken()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize(" \t\r\ntrue");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new TrueToken());

        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testTokenizeIgnoresWhitespaceSuffixAfterMultiCharacterToken()
    {
        Tokenizer tokenizer = new Tokenizer();

        List<Token> tokens = tokenizer.tokenize("true \t\r\n");
        List<Token> expectedTokens = new ArrayList<Token>();
        expectedTokens.add(new TrueToken());

        assertEquals(expectedTokens, tokens);
    }
}
