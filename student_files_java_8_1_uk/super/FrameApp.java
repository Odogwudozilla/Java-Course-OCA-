import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameApp extends Frame {
   Button button;
   TextField text;
   Label label;

  FrameApp() {
    super("this is the title");
    setLayout(null);
    button = new Button("Button");
    add(button).setBounds(10,30,80,20);;
    text = new TextField();
    add(text).setBounds(10,60,100,20);;
    label = new Label("this is a label");
    add(label).setBounds(10,90,100,20);
    setSize(300,200);
    makeCloseable();
    show();
  }

  public static void main(String args[]) {
    new FrameApp();
  }

  void makeCloseable() {
    addWindowListener (
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
        }
      }
    );
  }
}
