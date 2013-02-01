
//---------------------------------------------------------------------
//
//  Token.java
//
//---------------------------------------------------------------------

public class Token
{
    //-----------------------------------------------------------------
    //
    //-----------------------------------------------------------------
    public Token(int nCode, String strLexeme)
    {
        m_nCode = nCode;
        m_strLexeme = strLexeme;
    }


    //-----------------------------------------------------------------
    //
    //-----------------------------------------------------------------
    public String
    GetLexeme()
    {
        return(m_strLexeme);
    }


    //-----------------------------------------------------------------
    //
    //-----------------------------------------------------------------
    public int
    GetCode()
    {
        return(m_nCode);
    }


    //-----------------------------------------------------------------
    //
    //-----------------------------------------------------------------
    public String
    toString()
    {
       return  "Code: " + m_nCode + ", Lexeme: " + m_strLexeme;
    }


    //-----------------------------------------------------------------
    //
    //-----------------------------------------------------------------
    private int     m_nCode;
    private String  m_strLexeme;
}
