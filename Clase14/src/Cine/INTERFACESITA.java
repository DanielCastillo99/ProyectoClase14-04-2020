package Cine;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class INTERFACESITA  extends JFrame implements ActionListener{
//Constructor: es un metodo para construir objetos, se llama igual que la clase y no retorna nada
    //1.Contenedor principal
    //2.Determinar Layout - flow
    //3.Declaro, instancio y agrego
    //4.implementar accionlistener
    //5.agregar acciones
    Ver v = new Ver();
    JTextField tpeli,ttiquet;
    JTextArea tarea,tmostrar;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3,l4;
    public INTERFACESITA() {
        setTitle("CiNe CoLumbus");
        setBounds(500, 100, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        tpeli=new JTextField(10);
        ttiquet=new JTextField(10);
        tarea=new JTextArea("<<CARTELERA HOY>>\n"+"1)50 Sombras de Grey\n"+"2)Parasitos\n"+"3)Django Sin Cadenas\n"+
                "4)Wall-E\n"+"5)Forrest Gump\n"+"6)Gladiator\n"+"7)El Caballero Oscuro\n"+
                "8)Matrix\n"+"9)Mision Imposible:Repercusión\n"+"10)Titanic",10,20);
        tmostrar=new JTextArea(5,10);
        b1=new JButton("Informacion");
        b2=new JButton("Vender");
        b3=new JButton("Salir");
        b4=new JButton("Limpiar");
        l1=new JLabel("Nombre De pelicula a ver");
        l2=new JLabel("Cantidad de Tiquetes");
        add(tarea);
        add(l1);
        add(tpeli);
        add(l2);
        add(ttiquet);
        add(b1);
        add(b2);
        add(b4);
        add(b3);
        add(tmostrar);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setVisible(true);
    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        String accion;
        accion=e.getActionCommand();
        if (accion.equalsIgnoreCase("Informacion")){
           v.Llenado();
           v.Buscar(tpeli.getText());
        }else{
            System.out.println("");
        }
        if (accion.equalsIgnoreCase("Vender")){
            int i;
            i=Integer.parseInt(ttiquet.getText());
            tmostrar.setText("total  a pagar : " + i*7500 + "Tiquetes" + i);
            JOptionPane.showMessageDialog(null, "total  a pagar : " + i + "Tiquetes" );
        }
        if (accion.equalsIgnoreCase("limpiar")){
            tmostrar.setText(null);
            tpeli.setText(null);
            ttiquet.setText(null);
        }
        if (accion.equalsIgnoreCase("Salir")){
            System.exit(0);
        }
    }

}
