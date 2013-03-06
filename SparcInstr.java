/////////////////////////////////////////////////////////////////
// Common SPARC Instructions
// This static final singleton class provides string literals for
// 131 programming assignment 2. Each is a SPARC instruction
/////////////////////////////////////////////////////////////////


// I recommend defining all operations as well as formats.  
// Operations are things like add, mul, set, etc.
// Formats are like {OPERATION} {REG_1}, {REG_2}, {REG_3} etc.

class SparcInstr
{
    /////////////////////////////////////////////////////////////
    // Separator
    /////////////////////////////////////////////////////////////
    public static final String SEPARATOR = "    ";
    
    /////////////////////////////////////////////////////////////
    // Set
    /////////////////////////////////////////////////////////////
    public static final String SET_OP  = "set";
    
    /////////////////////////////////////////////////////////////
    // Move
    /////////////////////////////////////////////////////////////
    public static final String MOVE_OP = "mov";

    /////////////////////////////////////////////////////////////
    // Simple Arithmetic
    /////////////////////////////////////////////////////////////
    public static final String ADD_OP = "add";
    public static final String ADDCC_OP = "addcc";
    public static final String SUB_OP = "sub";
    public static final String SUBCC_OP = "subcc";
    
    /////////////////////////////////////////////////////////////
    // Increment/Decrement
    /////////////////////////////////////////////////////////////
    public static final String INC_OP  = "inc";
    public static final String INCCC_OP = "inccc";
    public static final String DEC_OP  = "dec";
    public static final String DECCC_OP = "deccc";
    
    /////////////////////////////////////////////////////////////
    // Shifting
    /////////////////////////////////////////////////////////////
    public static final String SLL_OP = "sll";
    public static final String SRL_OP = "srl";
    public static final String SRA_OP = "sra";

    /////////////////////////////////////////////////////////////
    // Load
    /////////////////////////////////////////////////////////////
    public static final String LOAD_OP = "ld";

    /////////////////////////////////////////////////////////////
    // Store
    /////////////////////////////////////////////////////////////
    public static final String STORE_OP = "st";

    /////////////////////////////////////////////////////////////
    // Compare
    /////////////////////////////////////////////////////////////
    public static final String COMP_OP = "cmp";

    /////////////////////////////////////////////////////////////
    // Branch
    /////////////////////////////////////////////////////////////
    public static final String BLE_OP = "ble";
    public static final String BGE_OP = "bge";
    public static final String BL_OP  = "bl";
    public static final String BLE_OP = "ble";
    public static final String BE_OP  = "be";
    public static final String BNE_OP = "bne";
    public static final String BA_OP  = "ba";
    
    /////////////////////////////////////////////////////////////
    // Call
    /////////////////////////////////////////////////////////////
    public static final String CALL_OP = "call";
    public static final String NOP_OP  = "nop";
    
    /////////////////////////////////////////////////////////////
    // Multiplication/Division/Modulus Arithmetic
    /////////////////////////////////////////////////////////////
    public static final String MUL_OP = "mul";
    public static final String DIV_OP = "div";
    public static final String REM_OP = "rem";

    /////////////////////////////////////////////////////////////
    // Negating/2's Complement
    /////////////////////////////////////////////////////////////
    public static final String NEG_OP = "neg";

    /////////////////////////////////////////////////////////////
    // Clear Register
    /////////////////////////////////////////////////////////////
    public static final String CLR_OP = "clr";

    /////////////////////////////////////////////////////////////
    // Bitwise Ops
    /////////////////////////////////////////////////////////////
    public static final String AND_OP = "and";
    public static final String ADDCC_OP = "andcc";
    public static final String OR_OP = "or";
    public static final String ORCC = "orcc";
    public static final String XOR_OP = "xor";
    public static final String XORCC_OP = "xorcc";
    
    /////////////////////////////////////////////////////////////
    // Param
    /////////////////////////////////////////////////////////////
    public static final String ONE_PARAM = "%s" + SEPARATOR + "%s\n";
    public static final String TWO_PARAM = "%s" + SEPARATOR + "%s, %s\n";

}
