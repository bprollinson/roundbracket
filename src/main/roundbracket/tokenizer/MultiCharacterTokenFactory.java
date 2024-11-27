package roundbracket.tokenizer;

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
import roundbracket.token.StringIsFloatToken;
import roundbracket.token.StringIsIntToken;
import roundbracket.token.StringIsSetToken;
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

public class MultiCharacterTokenFactory
{
    public Token createToken(String tokenString)
    {
        switch (tokenString)
        {
            case "false":
                return new FalseToken();
            case "true":
                return new TrueToken();
            case "zero":
                return new ZeroToken();
            case "one":
                return new OneToken();
            case "two":
                return new TwoToken();
            case "three":
                return new ThreeToken();
            case "four":
                return new FourToken();
            case "five":
                return new FiveToken();
            case "six":
                return new SixToken();
            case "seven":
                return new SevenToken();
            case "eight":
                return new EightToken();
            case "nine":
                return new NineToken();
            case "ten":
                return new TenToken();
            case "get_bool":
                return new GetBoolToken();
            case "set_bool":
                return new SetBoolToken();
            case "bool_is_set":
                return new BoolIsSetToken();
            case "get_int":
                return new GetIntToken();
            case "set_int":
                return new SetIntToken();
            case "int_is_set":
                return new IntIsSetToken();
            case "get_float":
                return new GetFloatToken();
            case "set_float":
                return new SetFloatToken();
            case "float_is_set":
                return new FloatIsSetToken();
            case "get_char":
                return new GetCharToken();
            case "set_char":
                return new SetCharToken();
            case "char_is_set":
                return new CharIsSetToken();
            case "get_string":
                return new GetStringToken();
            case "set_string":
                return new SetStringToken();
            case "string_is_set":
                return new StringIsSetToken();
            case "int_to_float":
                return new IntToFloatToken();
            case "int_is_char":
                return new IntIsCharToken();
            case "int_to_char":
                return new IntToCharToken();
            case "int_to_string":
                return new IntToStringToken();
            case "float_to_string":
                return new FloatToStringToken();
            case "char_to_int":
                return new CharToIntToken();
            case "char_to_string":
                return new CharToStringToken();
            case "string_is_int":
                return new StringIsIntToken();
            case "string_to_int":
                return new StringToIntToken();
            case "string_is_float":
                return new StringIsFloatToken();
            case "string_to_float":
                return new StringToFloatToken();
            case "and":
                return new AndToken();
            case "or":
                return new OrToken();
            case "not":
                return new NotToken();
            case "minus_int":
                return new MinusIntToken();
            case "add_int":
                return new AddIntToken();
            case "subtract_int":
                return new SubtractIntToken();
            case "multiply_int":
                return new MultiplyIntToken();
            case "divide_int":
                return new DivideIntToken();
            case "mod_int":
                return new ModIntToken();
            case "minus_float":
                return new MinusFloatToken();
            case "add_float":
                return new AddFloatToken();
            case "subtract_float":
                return new SubtractFloatToken();
            case "multiply_float":
                return new MultiplyFloatToken();
            case "divide_float":
                return new DivideFloatToken();
            case "floor":
                return new FloorToken();
            case "round":
                return new RoundToken();
            case "ceiling":
                return new CeilingToken();
            case "empty_str":
                return new EmptyStrToken();
            case "str_length":
                return new StrLengthToken();
            case "concat_str":
                return new ConcatStrToken();
            case "concat_char":
                return new ConcatCharToken();
            case "str_char":
                return new StrCharToken();
            case "if":
                return new IfToken();
            case "else_if":
                return new ElseIfToken();
            case "else":
                return new ElseToken();
            case "end_if":
                return new EndIfToken();
            case "while":
                return new WhileToken();
            case "end_while":
                return new EndWhileToken();
            case "print_string":
                return new PrintStringToken();
            case "read_string":
                return new ReadStringToken();
            default:
                return null;
        }
    }
}
