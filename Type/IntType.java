//---------------------------------------------------------------------
// 
//---------------------------------------------------------------------

class IntType extends NumericType
{
    // Constants
    private static final String INT_NAME = "int";
    private static final int INT_SIZE    = 4;

    //----------------------------------------------------------------
    //
    //----------------------------------------------------------------
    public 
    IntType ()
    {
        this(INT_NAME, INT_SIZE);
    }

    public 
    IntType (String strName)
    {
        this(strName, INT_SIZE);
    }

    public
    IntType (String strName, int size)
    {
        super(strName, size);
    }

    //----------------------------------------------------------------
    //
    //----------------------------------------------------------------
    public boolean isBasic()   { return true; }
    public boolean isNumeric() { return true; }
    public boolean isInt()     { return true; }

    //----------------------------------------------------------------
    //    
    //----------------------------------------------------------------
}