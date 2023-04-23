import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Bienvenida extends JFrame implements ActionListener{
    private JTextField textField;
    private JLabel label1, label2, label3, label4;
    private JButton boton;
    public static String nameUser = "";
    public Bienvenida(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Bienvenido/a");
        getContentPane().setBackground(Color.red);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);

        label2 = new JLabel("Sistema de control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        label3 = new JLabel("Ingresa tu numbre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono",1,12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        label4 = new JLabel("©2023 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono",1, 12));
        label4.setForeground(Color.white);
        add(label4);

        textField = new JTextField();
        textField.setBounds(45,240,255,25);
        textField.setBackground(new Color(224, 224, 244));
        textField.setFont(new Font("Andale Mono",1, 14));
        textField.setForeground(Color.red);
        add(textField);

        boton = new JButton("Ingresar");
        boton.setBounds(125,280,100,30);
        boton.setBackground(Color.white);
        boton.setFont(new Font("Andale Mono", 1, 14));
        boton.setForeground(Color.red);
        boton.addActionListener(this);
        add(boton);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton){
            nameUser = textField.getText().trim();
            if(nameUser.equals("")){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre");
            }else{
                this.setVisible(false);

                Licencia ventanaLicencia = new Licencia();
                ventanaLicencia.setBounds(0,0,600,360);
                ventanaLicencia.setVisible(true);
                ventanaLicencia.setResizable(false);
                ventanaLicencia.setLocationRelativeTo(null);
            }
        }
    }
    public static void main(String args[]) {
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0,0,350,450);
        ventanaBienvenida.setVisible(true);
        ventanaBienvenida.setResizable(false);
        ventanaBienvenida.setLocationRelativeTo(null);
    }
}