//---------------------------------------------------------------------
//
//---------------------------------------------------------------------

class NotOp extends UnaryOp
{
    // constructors
    public 
    NotOp(strName)
    {
        super(strName);
    }

    // methods
    public STO
    checkOperands(STO op1, STO op2)
    {
        return (new ErrorSTO("NotOp.checkOperands()"));
    }
}
