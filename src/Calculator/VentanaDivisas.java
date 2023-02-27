package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VentanaDivisas extends JFrame {
    private double dinero,cambio;
    private String cadenaNumeros = "",moneda1="",moneda2="",cantidad;
    private JMenuBar barramenu;
    private JMenu menu;
    private JMenuItem estandar,divisas;
    private JSeparator separador;
    private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bclear,bborrar,bcoma;
    private JPanel panel;
    private JLabel divisaA,divisaB,valor1,valor2;
    private JComboBox divisa1,divisa2;
    private boolean punto=true;

    public VentanaDivisas(){
        setSize(335,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Conversor de Divisas");
        iniciarComponentes();

    }
    private void iniciarComponentes(){
        this.addKeyListener(eh);
        mostrarPanel();
        mostrarBotones();
        mostrarEtiqueta();
        mostrarMenu();
    }
    private void mostrarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(215,205,205));
        this.add(panel);
    }
    private void mostrarBotones(){
        b1 = new JButton("1");b2=new JButton("2");b3=new JButton("3");b4=new JButton("4");b5=new JButton("5");
        b6=new JButton("6");b7=new JButton("7");b8=new JButton("8");b9=new JButton("9");b0=new JButton("0");
        bclear=new JButton("C");bcoma=new JButton(".");bborrar=new JButton("⌫");

        b0.setBounds(0,450,214,60);
        b0.setFont(new Font("Arial",Font.BOLD,20));
        b0.setBackground(new Color(200,255,255));
        panel.add(b0);
        bcoma.setBounds(214,450,107,60);
        bcoma.setFont(new Font("Arial",Font.BOLD,20));
        bcoma.setBackground(new Color(140,205,255));
        panel.add(bcoma);
        b1.setBounds(0,390,107,60);
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.setBackground(new Color(200,255,255));
        panel.add(b1);
        b2.setBounds(107,390,107,60);
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.setBackground(new Color(200,255,255));
        panel.add(b2);
        b3.setBounds(214,390,107,60);
        b3.setFont(new Font("Arial",Font.BOLD,20));
        b3.setBackground(new Color(200,255,255));
        panel.add(b3);
        b4.setBounds(0,330,107,60);
        b4.setFont(new Font("Arial",Font.BOLD,20));
        b4.setBackground(new Color(200,255,255));
        panel.add(b4);
        b5.setBounds(107,330,107,60);
        b5.setFont(new Font("Arial",Font.BOLD,20));
        b5.setBackground(new Color(200,255,255));
        panel.add(b5);
        b6.setBounds(214,330,107,60);
        b6.setFont(new Font("Arial",Font.BOLD,20));
        b6.setBackground(new Color(200,255,255));
        panel.add(b6);
        b7.setBounds(0,270,107,60);
        b7.setFont(new Font("Arial",Font.BOLD,20));
        b7.setBackground(new Color(200,255,255));
        panel.add(b7);
        b8.setBounds(107,270,107,60);
        b8.setFont(new Font("Arial",Font.BOLD,20));
        b8.setBackground(new Color(200,255,255));
        panel.add(b8);
        b9.setBounds(214,270,107,60);
        b9.setFont(new Font("Arial",Font.BOLD,20));
        b9.setBackground(new Color(200,255,255));
        panel.add(b9);
        bclear.setBounds(0,210,160,60);
        bclear.setFont(new Font("Arial",Font.BOLD,20));
        bclear.setBackground(new Color(255,100,100));
        panel.add(bclear);
        bborrar.setBounds(160,210,160,60);
        bborrar.setBackground(new Color(255,200,200));
        panel.add(bborrar);

        ActionListener m0 = e -> {
            if(!cadenaNumeros.equals("")){
                cadenaNumeros+="0";
                valor1.setText(cadenaNumeros);
            }
            obtenerDinero();
        };
        b0.addActionListener(m0);
        b0.addKeyListener(eh);
        ActionListener m1 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="1";
            }
            else{
                cadenaNumeros+="1";
            }
            valor1.setText(cadenaNumeros);
            obtenerDinero();
        };
        b1.addActionListener(m1);
        b1.addKeyListener(eh);
        ActionListener m2 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="2";
            }
            else{
                cadenaNumeros+="2";
            }
            valor1.setText(cadenaNumeros);
            obtenerDinero();
        };
        b2.addActionListener(m2);
        b2.addKeyListener(eh);
        ActionListener m3 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="3";
            }
            else{
                cadenaNumeros+="3";
            }
            valor1.setText(cadenaNumeros);
            obtenerDinero();
        };
        b3.addActionListener(m3);
        b3.addKeyListener(eh);
        ActionListener m4 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="4";
            }
            else{
                cadenaNumeros+="4";
            }
            valor1.setText(cadenaNumeros);
            obtenerDinero();
        };
        b4.addActionListener(m4);
        b4.addKeyListener(eh);
        ActionListener m5 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="5";
            }
            else{
                cadenaNumeros+="5";
            }
            valor1.setText(cadenaNumeros);
            obtenerDinero();
        };
        b5.addActionListener(m5);
        b5.addKeyListener(eh);
        ActionListener m6 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="6";
            }
            else{
                cadenaNumeros+="6";
            }
            valor1.setText(cadenaNumeros);
            obtenerDinero();
        };
        b6.addActionListener(m6);
        b6.addKeyListener(eh);
        ActionListener m7 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="7";
            }
            else{
                cadenaNumeros+="7";
            }
            valor1.setText(cadenaNumeros);
            obtenerDinero();
        };
        b7.addActionListener(m7);
        b7.addKeyListener(eh);
        ActionListener m8 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="8";
            }
            else{
                cadenaNumeros+="8";
            }
            valor1.setText(cadenaNumeros);
            obtenerDinero();
        };
        b8.addActionListener(m8);
        ActionListener m9 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="9";
            }
            else{
                cadenaNumeros+="9";
            }
            valor1.setText(cadenaNumeros);
            obtenerDinero();
        };
        b9.addActionListener(m9);
        b9.addKeyListener(eh);
        ActionListener coma = e -> {
            if(punto){
                if(cadenaNumeros.equals("")){
                    cadenaNumeros="0.";
                }
                else{
                    cadenaNumeros +=".";
                }
                valor1.setText(cadenaNumeros);
            }
            punto=false;
        };
        bcoma.addActionListener(coma);
        bcoma.addKeyListener(eh);
        ActionListener borrar = e ->{
            int tamanio = cadenaNumeros.length();
            if(tamanio>0){
                if(tamanio==1){
                    cadenaNumeros="0";
                }
                else{
                    cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length()-1);
                }
                valor1.setText(cadenaNumeros);
            }
            obtenerDinero();
        };
        bborrar.addActionListener(borrar);
        bborrar.addKeyListener(eh);

        ActionListener cls = e ->{
            cadenaNumeros="0";
            punto=true;
            valor1.setText("0");
            valor2.setText("0");
        };
        bclear.addActionListener(cls);
        bclear.addKeyListener(eh);
    }
    private void mostrarEtiqueta(){
        divisaA=new JLabel();
        divisaA.setText("$");
        divisaA.setFont(new Font("Arial",Font.PLAIN,45));
        divisaA.setHorizontalAlignment(SwingConstants.RIGHT);
        divisaA.setBounds(0,40,100,40);
        panel.add(divisaA);

        valor1=new JLabel();
        valor1.setText("0");
        valor1.setFont(new Font("Arial",Font.PLAIN,45));
        valor1.setHorizontalAlignment(SwingConstants.LEFT);
        valor1.setBounds(105,40,200,40);
        panel.add(valor1);

        divisaB = new JLabel();
        divisaB.setText("$");
        divisaB.setFont(new Font("Arial",Font.PLAIN,45));
        divisaB.setHorizontalAlignment(SwingConstants.RIGHT);
        divisaB.setBounds(0,120,100,40);
        panel.add(divisaB);

        valor2=new JLabel();
        valor2.setText("0");
        valor2.setFont(new Font("Arial",Font.PLAIN,45));
        valor2.setHorizontalAlignment(SwingConstants.LEFT);
        valor2.setBounds(105,120,200,40);
        panel.add(valor2);

        String[] divisas = new String[]{"US Dolar","Euro","Peso Argentino"};

        divisa1 = new JComboBox<>(divisas);
        divisa1.setFont(new Font("Arial",Font.PLAIN,14));
        divisa1.setBounds(60,90,200,20);
        panel.add(divisa1);

        ActionListener cambio = e -> {
            moneda1=(String) divisa1.getSelectedItem();
            if(moneda1.equals("US Dolar")){
                divisaA.setText("$");
            }
            if(moneda1.equals("Euro")){
                divisaA.setText("€");
            }
            if(moneda1.equals("Peso Argentino")){
                divisaA.setText("AR$");
            }
            obtenerDinero();
        };
        divisa1.addActionListener(cambio);

        divisa2 = new JComboBox<>(divisas);
        divisa2.setFont(new Font("Arial",Font.PLAIN,14));
        divisa2.setBounds(60,170,200,20);
        panel.add(divisa2);

        ActionListener cambio2 = e -> {
            moneda2=(String) divisa2.getSelectedItem();
            if(moneda2.equals("US Dolar")){
                divisaB.setText("$");
            }
            if(moneda2.equals("Euro")){
                divisaB.setText("€");
            }
            if(moneda2.equals("Peso Argentino")){
                divisaB.setText("AR$");
            }
            obtenerDinero();
        };
        divisa2.addActionListener(cambio2);
    }

    private void obtenerDinero(){
        cantidad=valor1.getText();
        dinero=Double.parseDouble(cantidad);
        cambioDinero();
        dinero*=cambio;
        valor2.setText(String.format("%.4f",dinero));
    }

    private void cambioDinero(){
        if(divisa1.getSelectedItem()==divisa2.getSelectedItem()){
            cambio = 1;
        }
        else if(divisa1.getSelectedItem() =="US Dolar" && divisa2.getSelectedItem() =="Euro"){
            cambio = 0.94;
        }
        else if(divisa1.getSelectedItem()=="US Dolar" && divisa2.getSelectedItem()=="Peso Argentino"){
            cambio = 178.57;
        }
        else if(divisa1.getSelectedItem()=="Euro"&& divisa2.getSelectedItem()=="US Dolar"){
            cambio = 1.06;
        }
        else if(divisa1.getSelectedItem()=="Euro"&& divisa2.getSelectedItem()=="Peso Argentino"){
            cambio = 189.52;
        }
        else if(divisa1.getSelectedItem()=="Peso Argentino" && divisa2.getSelectedItem()=="US Dolar"){
            cambio = 0.0056;
        }
        else if(divisa1.getSelectedItem()=="Peso Argentino" && divisa2.getSelectedItem()=="Euro"){
            cambio = 0.0053;
        }
    }
    KeyListener eh = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
                if (!cadenaNumeros.equals("")) {
                    cadenaNumeros += "0";
                    valor1.setText(cadenaNumeros);
                }
                obtenerDinero();
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="1";
                }
                else{
                    cadenaNumeros+="1";
                }
                valor1.setText(cadenaNumeros);
                obtenerDinero();
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="2";
                }
                else{
                    cadenaNumeros+="2";
                }
                valor1.setText(cadenaNumeros);
                obtenerDinero();
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="3";
                }
                else{
                    cadenaNumeros+="3";
                }
                valor1.setText(cadenaNumeros);
                obtenerDinero();
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="4";
                }
                else{
                    cadenaNumeros+="4";
                }
                valor1.setText(cadenaNumeros);
                obtenerDinero();
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="5";
                }
                else{
                    cadenaNumeros+="5";
                }
                valor1.setText(cadenaNumeros);
                obtenerDinero();
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="6";
                }
                else{
                    cadenaNumeros+="6";
                }
                valor1.setText(cadenaNumeros);
                obtenerDinero();
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="7";
                }
                else{
                    cadenaNumeros+="7";
                }
                valor1.setText(cadenaNumeros);
                obtenerDinero();
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="8";
                }
                else{
                    cadenaNumeros+="8";
                }
                valor1.setText(cadenaNumeros);
                obtenerDinero();
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="9";
                }
                else{
                    cadenaNumeros+="9";
                }
                valor1.setText(cadenaNumeros);
                obtenerDinero();
            }
            if (e.getKeyCode() == KeyEvent.VK_DECIMAL){
                if(punto){
                    if(cadenaNumeros.equals("")){
                        cadenaNumeros="0.";
                    }
                    else{
                        cadenaNumeros +=".";
                    }
                    valor1.setText(cadenaNumeros);
                }
                punto=false;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };
    private void mostrarMenu(){
        barramenu = new JMenuBar();
        barramenu.setBounds(0,0,320,20);
        panel.add(barramenu);

        menu = new JMenu();
        menu.setText("Opciones");
        barramenu.add(menu);

        estandar = new JMenuItem("Calculadora Estándar");
        menu.add(estandar);

        ActionListener iraCalculadora = e -> {
            Ventana calculadora = new Ventana();
            calculadora.setVisible(true);

            dispose();
        };
        estandar.addActionListener(iraCalculadora);

        divisas = new JMenuItem("Conversor de Divisas");
        menu.add(divisas);

        separador = new JSeparator();
        menu.add(separador);

        JMenuItem salir = new JMenuItem("Salir");
        ActionListener salte = e -> System.exit(0);
        salir.addActionListener(salte);

        JMenuItem acercade = new JMenuItem("Acerca de");
        ActionListener info = e -> JOptionPane.showMessageDialog(null, """
                Desarrollado por Putozeros© Todos los derechos reservados
                5 de Enero de 2023
                Versión 1.1: Ahora el teclado numérico funciona.""");
        acercade.addActionListener(info);
        menu.add(acercade);
        menu.add(salir);
    }
}