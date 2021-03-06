//---------------------------------------------------------------------
// This is the top of the Type hierarchy. You most likely will need to
// create sub-classes(since this one is abstract) that handle specific
// types, such as IntType, FloatType, ArrayType, etc.
//---------------------------------------------------------------------

abstract class Type
{
    //---------------------------------------------------------------------
    //      Instance Variables
    //---------------------------------------------------------------------
    private String m_typeName;
    private int    m_size;

    //---------------------------------------------------------------------
    //      Constructors
    //---------------------------------------------------------------------
    public Type(String strName, int size)
    {
        setName(strName);
        setSize(size);
    }

    //---------------------------------------------------------------------
    //      Methods
    //---------------------------------------------------------------------
    public String getName()
    {
        return m_typeName;
    }

    public void setName(String str)
    {
        m_typeName = str;
    }

    public int getSize()
    {
        return m_size;
    }

    protected void setSize(int size)
    {
        m_size = size;
    }

    public boolean isEquivalent(Type type)
    {
        return (this.getClass() == type.getClass());
    }

    // meaning: param = this
    public boolean isAssignable(Type type)
    {
        if(isEquivalent(type)) {
            return true;
        }

        return false;
    }

    //----------------------------------------------------------------
    //    It will be helpful to ask a Type what specific Type it is.
    //    The Java operator instanceof will do this, but you may
    //    also want to implement methods like isNumeric(), isInt(),
    //    etc. Below is an example of isInt(). Feel free to
    //    change this around.
    //----------------------------------------------------------------
    public boolean isBasic()
    {
        return false;
    }
    public boolean isVoid()
    {
        return false;
    }
    public boolean isComposite()
    {
        return false;
    }
    public boolean isNumeric()
    {
        return false;
    }
    public boolean isBool()
    {
        return false;
    }
    public boolean isInt()
    {
        return false;
    }
    public boolean isFloat()
    {
        return false;
    }
    public boolean isArray()
    {
        return false;
    }
    public boolean isStruct()
    {
        return false;
    }
    public boolean isPtrGrp()
    {
        return false;
    }
    public boolean isPointer()
    {
        return false;
    }
    public boolean isFuncPtr()
    {
        return false;
    }
    public boolean isNullPtr()
    {
        return false;
    }
    public boolean isString()
    {
    	return false;
    }
}
