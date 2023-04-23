import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Principal extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelApaterno, labelAMaterno,
                    labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
    private JTextField txtNombre, txtAPaterno, txtAMaterno;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    String nombreAdmin="";
    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Pantalla principal");
        getContentPane().setBackground(Color.red);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        //obtenemos nombre de usuario
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombreAdmin = ventanaBienvenida.nameUser;



        menuBar = new JMenuBar();
        menuBar.setBackground(Color.red);
        setJMenuBar(menuBar);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(Color.red);
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(Color.white);
        menuBar.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(Color.red);
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(Color.white);
        menuBar.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(Color.red);
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(Color.white);
        menuBar.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color Fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(Color.red);
        menuOpciones.add(menuColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setForeground(Color.red);
        miCalculo.addActionListener(this);
        menuCalcular.add(miCalculo);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        miRojo.setForeground(Color.red);
        miRojo.addActionListener(this);
        menuColorFondo.add(miRojo);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setForeground(Color.red);
        miNegro.addActionListener(this);
        menuColorFondo.add(miNegro);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono", 1, 14));
        miMorado.setForeground(Color.red);
        miMorado.addActionListener(this);
        menuColorFondo.add(miMorado);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(Color.red);
        miNuevo.addActionListener(this);
        menuOpciones.add(miNuevo);

        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));
        miElCreador.setForeground(Color.red);
        miElCreador.addActionListener(this);
        menuAcercaDe.add(miElCreador);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(Color.red);
        miSalir.addActionListener(this);
        menuOpciones.add(miSalir);

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5, 5, 250, 100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido "+nombreAdmin);
        labelBienvenido.setBounds(280, 30, 300, 50);
        labelBienvenido.setFont(new Font("Andae Mono", 1, 32));
        labelBienvenido.setForeground(Color.white);
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono", 0, 24));
        labelTitle.setForeground(Color.white);
        add(labelTitle);

        //pedir nombre
        labelNombre = new JLabel("Nombre completo: ");
        labelNombre.setBounds(25, 188, 180, 25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(Color.white);
        add(labelNombre);
        txtNombre = new JTextField();
        txtNombre.setBounds(25, 213, 150, 25);
        txtNombre.setBackground(new Color(224, 224, 224));
        txtNombre.setFont(new Font("Andale Mono", 1, 14));
        txtNombre.setForeground(Color.red);
        add(txtNombre);

        //pedir apellido paterno
        labelApaterno = new JLabel("Apellido paterno");
        labelApaterno.setBounds(25, 248, 180, 25);
        labelApaterno.setFont(new Font("Andale Mono", 1, 12));
        labelApaterno.setForeground(Color.white);
        add(labelApaterno);
        txtAPaterno = new JTextField();
        txtAPaterno.setBounds(25, 273, 150, 25);
        txtAPaterno.setBackground(new Color(224, 224, 224));
        txtAPaterno.setFont(new Font("Andale Mono", 1, 14));
        txtAPaterno.setForeground(Color.red);
        add(txtAPaterno);

        //pedir apellido materno
        labelAMaterno = new JLabel("Apellido materno");
        labelAMaterno.setBounds(25, 308, 180, 25);
        labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAMaterno.setForeground(Color.white);
        add(labelAMaterno);
        txtAMaterno = new JTextField();
        txtAMaterno.setBounds(25, 334, 150, 25);
        txtAMaterno.setBackground(new Color(224, 224, 224));
        txtAMaterno.setFont(new Font("Andale Mono", 1, 14));
        txtAMaterno.setForeground(Color.red);
        add(txtAMaterno);

        //tipo de departamento que trabajo
        labelDepartamento = new JLabel("Departamento");
        labelDepartamento.setBounds(220, 188, 180, 25);
        labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(Color.white);
        add(labelDepartamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220, 213, 220, 25);
        comboDepartamento.setBackground(new Color(224, 224, 224));
        comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(Color.red);
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atencion al cliente");
        comboDepartamento.addItem("Departamento de Logistica");
        comboDepartamento.addItem("Departamento de Gerencia");

        //antiguedad
        labelAntiguedad = new JLabel("Antiguedad");
        labelAntiguedad.setBounds(220, 248, 180, 25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(Color.white);
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220, 273, 220, 25);
        comboAntiguedad.setBackground(new Color(224, 224, 224));
        comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
        comboAntiguedad.setForeground(Color.red);
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 anio de servicio");
        comboAntiguedad.addItem("2 a 6 anios de servicio");
        comboAntiguedad.addItem("7 anios a mas de servicio");

        //resultados
        labelResultado = new JLabel("Resultados del calculo");
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(Color.white);
        add(labelResultado);

        textArea = new JTextArea();
        textArea.setBackground(new Color(224,224,224));
        textArea.setFont(new Font("Andale Mono", 1, 11));
        textArea.setForeground(Color.red);
        textArea.setText("\n  Aqui aparece el resulado del calculo de las vacaciones");
        textArea.setEditable(false);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(220,333,385,90);
        add(scrollPane);

        labelFooter = new JLabel("©2023 the Coca-Cola Company | todos los derechps reservadps");
        labelFooter.setBounds(135,445,500,30);
        labelFooter.setFont(new Font("Andale Mono", 1, 12));
        labelFooter.setForeground(Color.white);
        add(labelFooter);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == miCalculo){
            String nombreTrab = txtNombre.getText();
            String AP = txtAPaterno.getText();
            String AM = txtAMaterno.getText();
            String Departamento = comboDepartamento.getSelectedItem().toString();
            String Antiguedad = comboAntiguedad.getSelectedItem().toString();

            if(nombreTrab.equals("") || AP.equals("") || AM.equals("") ||
            Departamento.equals("") || Antiguedad.equals("")){
                JOptionPane.showMessageDialog(null,"Debe llenar todos los compos");
            }else{
                if(Antiguedad.equals("1 anio de servicio")){
                    textArea.setText("\n El trabajador "+ nombreTrab+" "+AP+" "+AM+
                            "\n quien labora en el "+ Departamento+" con "+ Antiguedad +
                            "\n recibe 10 dias de vacaciones");
                }
                if(Antiguedad.equals("2 a 6 anios de servicio")){
                    textArea.setText("\n El trabajador "+ nombreTrab+" "+AP+" "+AM+
                            "\n quien labora en el "+ Departamento+" con "+ Antiguedad +
                            "\n recibe 25 dias de vacaciones");

                }if(Antiguedad.equals("7 anios a mas de servicio")){
                    textArea.setText("\n El trabajador "+ nombreTrab+" "+AP+" "+AM+
                            "\n quien labora en el "+ Departamento+" con "+ Antiguedad +
                            "\n recibe 40 dias de vacaciones");
                }
            }
        }
        if(e.getSource() == miRojo){
            getContentPane().setBackground(Color.red);
        }
        if(e.getSource() == miNegro){
            getContentPane().setBackground(Color.black);
        }
        if(e.getSource() == miMorado){
            getContentPane().setBackground(new Color(51,0,51));
        }
        if(e.getSource() == miNuevo){
            txtNombre.setText("");
            txtAMaterno.setText("");
            txtAPaterno.setText("");
            comboAntiguedad.setSelectedIndex(0);
            comboDepartamento.setSelectedIndex(0);
            textArea.setText("\n  Aqui aparece el resulado del calculo de las vacaciones");
        }
        if(e.getSource() == miSalir){
            this.setVisible(false);

            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0,0,350,450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
        }
        if(e.getSource() == miElCreador){
            JOptionPane.showMessageDialog(null,"Desarrollado por ZepolCode Company");
        }
    }

    /*public static void main(String args[]){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }*/
}
