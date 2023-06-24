
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Apr 24 21:21:48 CDT 2021
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Apr 24 21:21:48 CDT 2021
  */
public class Sintaxis extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintaxis() {super();}

  /** Constructor which sets the default scanner. */
  public Sintaxis(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintaxis(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\005\000\002\002\004\000\002\002\011\000\002\002" +
    "\010\000\002\003\005\000\002\003\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\026\000\006\004\006\021\004\001\002\000\004\015" +
    "\024\001\002\000\004\002\023\001\002\000\004\021\007" +
    "\001\002\000\004\015\010\001\002\000\004\016\011\001" +
    "\002\000\004\017\012\001\002\000\004\004\014\001\002" +
    "\000\004\020\022\001\002\000\004\023\015\001\002\000" +
    "\006\010\017\022\016\001\002\000\004\020\ufffe\001\002" +
    "\000\004\024\020\001\002\000\004\022\021\001\002\000" +
    "\004\020\ufffd\001\002\000\004\002\000\001\002\000\004" +
    "\002\001\001\002\000\004\016\025\001\002\000\004\017" +
    "\026\001\002\000\004\004\014\001\002\000\004\020\030" +
    "\001\002\000\004\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\026\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\012\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\003\026\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintaxis$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintaxis$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintaxis$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintaxis$actions {
  private final Sintaxis parser;

  /** Constructor */
  CUP$Sintaxis$actions(Sintaxis parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintaxis$do_action(
    int                        CUP$Sintaxis$act_num,
    java_cup.runtime.lr_parser CUP$Sintaxis$parser,
    java.util.Stack            CUP$Sintaxis$stack,
    int                        CUP$Sintaxis$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintaxis$result;

      /* select the action based on the action number */
      switch (CUP$Sintaxis$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= Int Identificador Igual Numero Punto_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIA ::= Int Identificador Punto_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Main Parentesis_abierto Parentesis_cerrado Llave_abierta SENTENCIA Llave_cerrada 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-5)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Int Main Parentesis_abierto Parentesis_cerrado Llave_abierta SENTENCIA Llave_cerrada 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).value;
		RESULT = start_val;
              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintaxis$parser.done_parsing();
          return CUP$Sintaxis$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
