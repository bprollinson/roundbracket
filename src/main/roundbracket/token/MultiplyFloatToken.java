package roundbracket.token;

public class MultiplyFloatToken implements Token
{
    public boolean equals(Object other)
    {
        return this.getClass().equals(other.getClass());
    }
}
