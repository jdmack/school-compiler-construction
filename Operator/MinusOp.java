//---------------------------------------------------------------------
//
//---------------------------------------------------------------------

class MinusOp extends ArithmeticOp
{
    //---------------------------------------------------------------------
    //      Constructors
    //---------------------------------------------------------------------
    public MinusOp(String strName)
    {
        super(strName);
    }

    //---------------------------------------------------------------------
    //      Methods
    //---------------------------------------------------------------------

    public STO doOperation(ConstSTO operand1, ConstSTO operand2, Type resultType)
    {
        Double value = 0.0;

        if(resultType.isInt()) {
            value = new Double(operand1.getIntValue() - operand2.getIntValue());
        }
        else if(resultType.isFloat()) {
            value = new Double(operand1.getFloatValue() - operand2.getFloatValue());
        }

        return new ConstSTO("MinusOp.doOperation Result", resultType, value);
    }

    public boolean isMinusOp()
    {
        return true;
    }
}
