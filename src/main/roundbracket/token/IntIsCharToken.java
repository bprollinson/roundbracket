package roundbracket.token;

public class IntIsCharToken implements Token
{
    public boolean equals(Object other)
    {
        return this.getClass().equals(other.getClass());
    }
}