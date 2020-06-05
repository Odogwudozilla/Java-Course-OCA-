
public class VarPrimitive {
  public static void main(String[] args) {
    int iVar = 100;
    float fVar = 100.100f;
    double dVar = 123;

    // a smaller type cannot be assigned to a larger type without an explicit cast
    iVar = (int) fVar;
    fVar = iVar;
    dVar = fVar;
    fVar = (float) dVar;
    dVar = iVar;
    iVar = (int) dVar;

    System.out.println(iVar);
    System.out.println(fVar);
    System.out.println(dVar);
  }
}