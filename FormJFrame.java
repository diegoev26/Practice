import javax.swing.*;
public class FormJFrame extends JFrame{
    public FormJFrame(){
        setLayout(null);
    }
    public static void main(String args[]){
        FormJFrame formulario1 = new FormJFrame();
        formulario1.setBounds(0,0,400,100);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
}