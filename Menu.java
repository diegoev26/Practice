import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends JFrame implements ActionListener{
    private JMenuBar menubar;
    private JMenu menu1;
    private JMenuItem item1, item2, item3;
    public Menu(){
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);
        menu1 = new JMenu ("Opciones");
        menubar.add(menu1);
        item1 = new JMenuItem("Bojo");
        item1.addActionListener(this);
        menu1.add(item1);
        item2 = new JMenuItem("Verde");
        item2.addActionListener(this);
        menu1.add(item2);
        item3 = new JMenuItem("Azul");
        item3.addActionListener(this);
        menu1.add(item3);
    }
    public void actionPerformed(ActionEvent e){
        Container fondo = this.getContentPane();
        if(e.getSource() == item1){
            fondo.setBackground(new Color(255,0,0));
        }
        if(e.getSource() == item2){
            fondo.setBackground(new Color(0,255,0));
        }
        if(e.getSource() == item3){
            fondo.setBackground(new Color(0,0,255));
        }
    }
    public static void main(String args[]){
        Menu formulario1 = new Menu();
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}