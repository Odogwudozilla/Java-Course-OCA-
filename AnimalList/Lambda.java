import java.util.*;
import java.util.function.*;

class Lambda {

  public static void main(String[] args) {

    Data adata = new Data(1);
    ArrayList<Data> al = new ArrayList<Data>();
    al.add(new Data(1));
    al.add(new Data(2));
    al.add(new Data(3));

    adata.processList(al, (int a, int b) -> System.out.println(a * b));

  }

}

interface Process {
  public void process(int a, int b);
}

class Data {
  int value;

  Data(int value) {
    this.value = value;
  }

  public void processList(ArrayList<Data> dataList, Process p) {
    for (Data d : dataList) {
      p.process(d.value, d.value);
    }
  }
}