package roundbracket.token;

public class TenToken implements Token
{
    public boolean equals(Object other)
    {
        return this.getClass().equals(other.getClass());
    }
}
