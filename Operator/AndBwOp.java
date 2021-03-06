//---------------------------------------------------------------------
//
//---------------------------------------------------------------------

class AndBwOp extends BitwiseOp
{
    //---------------------------------------------------------------------
    //      Constructors
    //---------------------------------------------------------------------
    public AndBwOp(String strName)
    {
        super(strName);
    }

    //---------------------------------------------------------------------
    //      Methods
    //---------------------------------------------------------------------

    public STO doOperation(ConstSTO operand1, ConstSTO operand2, Type resultType)
    {
        Double value = new Double(operand1.getIntValue() & operand2.getIntValue());

        return new ConstSTO(operand1.getName() + "&" + operand2.getName() + " Result", resultType, value);
    }


    public boolean isAndBwOp()
    {
        return true;
    }
}
