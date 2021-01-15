import javax.swing.*;
public class ScrollPane extends JFrame{
    private JTextField textfield1;
    private JScrollPane scrollfield1;
    private JTextArea textarea1;
    public ScrollPane(){
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        textarea1 = new JTextArea();
        scrollfield1 = new JScrollPane(textarea1);
        scrollfield1.setBounds(10,50,400,300);
        add(scrollfield1);
    }
    public static void main(String args[]){
        ScrollPane formulario1 = new ScrollPane();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}