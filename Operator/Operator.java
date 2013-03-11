//---------------------------------------------------------------------
//
//---------------------------------------------------------------------

abstract class Operator
{
    //---------------------------------------------------------------------
    //      Instance Variables
    //---------------------------------------------------------------------
    private String m_opName;


    //---------------------------------------------------------------------
    //      Constructors
    //---------------------------------------------------------------------
    public Operator(String strName)
    {
        setName(strName);
    }

    //---------------------------------------------------------------------
    //      Methods
    //---------------------------------------------------------------------
    public String getName()
    {
        return m_opName;
    }

    public void setName(String str)
    {
        m_opName = str;
    }

    //---------------------------------------------------------------------
    //      Is Methods
    //---------------------------------------------------------------------
    public boolean isComparison()
    {
        return false;
    }

}
