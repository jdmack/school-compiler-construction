//---------------------------------------------------------------------
// 
//---------------------------------------------------------------------


class StructType extends CompositeType
{
    //----------------------------------------------------------------
    //
    //----------------------------------------------------------------
    public 
    StructType (String strName, int size)
    {
        super(strName, size);
    }


    //----------------------------------------------------------------
    //
    //----------------------------------------------------------------


    //----------------------------------------------------------------
    //    
    //----------------------------------------------------------------
    public boolean isStruct() { return true; }

    //----------------------------------------------------------------
    //    
    //----------------------------------------------------------------
}