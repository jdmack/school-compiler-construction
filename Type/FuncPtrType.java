//---------------------------------------------------------------------
// 
//---------------------------------------------------------------------

class FuncPtrType extends PtrGrpType
{
    //---------------------------------------------------------------------
    //      Constructors
    //---------------------------------------------------------------------
    public 
    FuncPtrType(String strName, int size)
    {
        super(strName, size);
    }

    //---------------------------------------------------------------------
    //      Methods
    //---------------------------------------------------------------------
    public boolean isFuncPtr() { return true; }

}
