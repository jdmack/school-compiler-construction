//---------------------------------------------------------------------
//
//---------------------------------------------------------------------

class UnaryOp extends Operator
{
    //---------------------------------------------------------------------
    //      Constructors
    //---------------------------------------------------------------------
    public UnaryOp(String strName)
    {
        super(strName);
    }

    //---------------------------------------------------------------------
    //      Methods
    //---------------------------------------------------------------------
    public STO checkOperand(STO operand)
    {
        return(new ErrorSTO("UnaryOp.checkOperands()"));
    }

    public STO doOperation(ConstSTO operand1, Type resultType)
    {
        return new ErrorSTO("UnaryOp.doOperation Error");
    }

    public boolean isUnaryOp()
    {
        return true;
    }
    
    public boolean getPost()
    {
        return false;
    }

    public void setPost(boolean value)
    {
        // do nothing
    }

}
