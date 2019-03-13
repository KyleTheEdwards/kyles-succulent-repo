public class Element {
  public int i;
  public double d;
  public String str;
  private int type;

  public Element(int type){
    this.type = type;
  }

  public int getType(){
    return type;
  }

  public boolean set(int iVal, double dVal, String sVal){
    switch(getType()){
      case 0:
      i = iVal;
      break;

      case 1:
      d = dVal;
      break;

      case 2:
      str = sVal;
      break;
    }

    return true;
  }
}