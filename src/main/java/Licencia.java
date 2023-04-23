import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
public class Licencia extends JFrame implements ActionListener, ChangeListener{
    private JLabel label1,label2;
    private JCheckBox checkBox;
    private JButton boton1, boton2;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    String nombre="";

    public Licencia() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        //obtenemos el nombre del usuario
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombre = ventanaBienvenida.nameUser;

        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(Color.black);
        add(label1);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Andale Mono", 0, 9));
        textArea.setText("\n\n          TERMINOS Y CONDICIONES");

        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 40, 575, 200);
        add(scrollPane);

        checkBox = new JCheckBox("Yo "+nombre+" Acepto");
        checkBox.setBounds(10, 250, 300, 30);
        checkBox.addChangeListener(this);
        add(checkBox);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon imagen = new ImageIcon("images/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315, 135, 300, 300);
        add(label2);
    }
    public void stateChanged( ChangeEvent e){
        if(checkBox.isSelected()){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            this.setVisible(false);

            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0,0,640,535);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);

        }else if(e.getSource()==boton2){
            this.setVisible(false);

            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0,0,350,450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
        }
    }
}
