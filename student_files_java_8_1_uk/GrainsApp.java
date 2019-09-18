
//BugInt implementation
import java.math.BigInteger;

class GrainsApp {
  public static void main(String[] args) {
    BigInteger[][] grainBoard = new BigInteger[8][8];
    BigInteger var = BigInteger.ONE;
    final BigInteger TWO = BigInteger.valueOf(2);

    for (int row = 0; row < grainBoard.length; row++) {
      for (int col = 0; col < grainBoard[row].length; col++) {
        grainBoard[row][col] = var;
        var = var.multiply(TWO);

      }
    }

    for (int row = 0; row < grainBoard.length; row++) {
      BigInteger sum = BigInteger.ZERO;
      for (int col = 0; col < grainBoard[row].length; col++) {
        sum = sum.add(grainBoard[row][col]);
      }
      System.out.println(sum);
    }

    // Normal implementation
    long[][] grainBoard1 = new long[8][8];
    long var1 = 1;

    for (int row = 0; row < grainBoard1.length; row++) {
      for (int col = 0; col < grainBoard1[row].length; col++) {
        grainBoard1[row][col] = var1;
        var1 *= 2;

      }
    }

    for (int row = 0; row < grainBoard1.length; row++) {
      long sum1 = 0;
      for (int col = 0; col < grainBoard1[row].length; col++) {
        sum1 += grainBoard1[row][col];
      }
      System.out.println(sum1);
    }
  }
}