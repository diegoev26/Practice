import javax.swing.*;
public class FormJLabel extends JFrame{
    private JLabel label1;
    private JLabel label2;
    public FormJLabel(){
        setLayout(null);
        label1 = new JLabel("Meli esta loca?");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2 = new JLabel("Siiiii");
        label2 = setBounds(10,100,100,30);
        add(label2);
    }
    public static void main(String args[]){
        FormJLabel formulario1 = new FormJLabel();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
        formulario1.setVisible(true);
    }
}