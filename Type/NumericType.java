//---------------------------------------------------------------------
// 
//---------------------------------------------------------------------


class NumericType extends BasicType
{
    //----------------------------------------------------------------
    //
    //----------------------------------------------------------------
    public 
    NumericType (String strName, int size)
    {
        super(strName, size);
    }

    //----------------------------------------------------------------
    //
    //----------------------------------------------------------------
    public boolean isBasic()   { return true; }
    public boolean isNumeric() { return true; }

    //----------------------------------------------------------------
    //    
    //----------------------------------------------------------------
}