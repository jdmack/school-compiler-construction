//---------------------------------------------------------------------
// 
//---------------------------------------------------------------------


class NullPtrType extends PointerType
{
    //----------------------------------------------------------------
    //
    //----------------------------------------------------------------
    public 
    NullPtrType (String strName, int size)
    {
        super(strName, size);
    }


    //----------------------------------------------------------------
    //
    //----------------------------------------------------------------


    //----------------------------------------------------------------
    //    
    //----------------------------------------------------------------
    public boolean isNullPtr() { return true; }

    //----------------------------------------------------------------
    //    
    //----------------------------------------------------------------
}