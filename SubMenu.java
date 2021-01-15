import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SubMenu extends JFrame implements ActionListener{
    private JMenuBar menubar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem item1, item2, item3, item4;
    public SubMenu(){
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);
        menu1 = new JMenu("Opciones");
        menubar.add(menu1);
        menu2 = new JMenu("Tamaño ventana");
        menu1.add(menu2);
        menu3 = new JMenu("Color de fondo");
        menu1.add(menu3);
        item1 = new JMenuItem("300*200");
        menu2.add(item1);
        item1.addActionListener(this);
        item2 = new JMenuItem("640*480");
        menu2.add(item2);
        item2.addActionListener(this);
        item3 = new JMenuItem("Verde");
        menu3.add(item3);
        item3.addActionListener(this);
        item4 = new JMenuItem("Azul");
        menu3.add(item4);
        item4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == item1){
            setSize(300,200);
        } 
        if(e.getSource() == item2){
            setSize(640,480);
        } 
        if(e.getSource() == item3){
            getContentPane().setBackground(new Color(0,255,0));
        } 
        if(e.getSource() == item4){
            getContentPane().setBackground(new Color(0,0,255));
        }
    }
    public static void main(String args[]){
        SubMenu formulario1 = new SubMenu();
        formulario1.setBounds(0,0,300,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}