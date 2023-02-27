package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ventana extends JFrame {
    private boolean activado=true,punto=true;
    private double n1,n2,total=0;
    private String cadenaNumeros="",operacion="nula";
    private JMenuBar barramenu;
    private JMenu menu;
    private JMenuItem estandar,divisas;
    private JSeparator separador;
    private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsuma,bresta,bmult,bdivi,braiz,bclear,bborrar,bnegat,bcoma,bigual;
    private JPanel panel;
    private JLabel textoGrande,textoPeque;
    public Ventana(){
        setSize(335,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Calculadora");
        iniciarComponentes();
        this.addKeyListener(ah);
    }
    private void iniciarComponentes(){
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
        bsuma=new JButton("+");bresta=new JButton("-");bmult=new JButton("x");bdivi=new JButton("÷");braiz=new JButton("√");
        bclear=new JButton("C");bcoma=new JButton(".");bborrar=new JButton("⌫");bnegat=new JButton("±");bigual=new JButton("=");

        bnegat.setBounds(0,450,80,60);
        bnegat.setFont(new Font("Arial",Font.BOLD,20));
        bnegat.setBackground(new Color(140,205,255));
        panel.add(bnegat);
        b0.setBounds(80,450,80,60);
        b0.setFont(new Font("Arial",Font.BOLD,20));
        b0.setBackground(new Color(200,255,255));
        panel.add(b0);
        bcoma.setBounds(160,450,80,60);
        bcoma.setFont(new Font("Arial",Font.BOLD,20));
        bcoma.setBackground(new Color(140,205,255));
        panel.add(bcoma);
        bigual.setBounds(240,450,80,60);
        bigual.setFont(new Font("Arial",Font.BOLD,20));
        bigual.setBackground(new Color(200,255,200));
        panel.add(bigual);
        b1.setBounds(0,390,80,60);
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.setBackground(new Color(200,255,255));
        panel.add(b1);
        b2.setBounds(80,390,80,60);
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.setBackground(new Color(200,255,255));
        panel.add(b2);
        b3.setBounds(160,390,80,60);
        b3.setFont(new Font("Arial",Font.BOLD,20));
        b3.setBackground(new Color(200,255,255));
        panel.add(b3);
        bsuma.setBounds(240,390,80,60);
        bsuma.setFont(new Font("Arial",Font.BOLD,20));
        bsuma.setBackground(new Color(200,255,200));
        panel.add(bsuma);
        b4.setBounds(0,330,80,60);
        b4.setFont(new Font("Arial",Font.BOLD,20));
        b4.setBackground(new Color(200,255,255));
        panel.add(b4);
        b5.setBounds(80,330,80,60);
        b5.setFont(new Font("Arial",Font.BOLD,20));
        b5.setBackground(new Color(200,255,255));
        panel.add(b5);
        b6.setBounds(160,330,80,60);
        b6.setFont(new Font("Arial",Font.BOLD,20));
        b6.setBackground(new Color(200,255,255));
        panel.add(b6);
        bresta.setBounds(240,330,80,60);
        bresta.setFont(new Font("Arial",Font.BOLD,20));
        bresta.setBackground(new Color(200,255,200));
        panel.add(bresta);
        b7.setBounds(0,270,80,60);
        b7.setFont(new Font("Arial",Font.BOLD,20));
        b7.setBackground(new Color(200,255,255));
        panel.add(b7);
        b8.setBounds(80,270,80,60);
        b8.setFont(new Font("Arial",Font.BOLD,20));
        b8.setBackground(new Color(200,255,255));
        panel.add(b8);
        b9.setBounds(160,270,80,60);
        b9.setFont(new Font("Arial",Font.BOLD,20));
        b9.setBackground(new Color(200,255,255));
        panel.add(b9);
        bmult.setBounds(240,270,80,60);
        bmult.setFont(new Font("Arial",Font.BOLD,20));
        panel.add(bmult);
        bmult.setBackground(new Color(200,255,200));
        bclear.setBounds(0,210,80,60);
        bclear.setFont(new Font("Arial",Font.BOLD,20));
        bclear.setBackground(new Color(255,100,100));
        panel.add(bclear);
        braiz.setBounds(80,210,80,60);
        braiz.setFont(new Font("Arial",Font.BOLD,20));
        braiz.setBackground(new Color(200,255,200));
        panel.add(braiz);
        bdivi.setBounds(160,210,80,60);
        bdivi.setFont(new Font("Arial",Font.BOLD,20));
        bdivi.setBackground(new Color(200,255,200));
        panel.add(bdivi);
        bborrar.setBounds(240,210,80,60);
        bborrar.setBackground(new Color(255,200,200));
        panel.add(bborrar);

        ActionListener m0 = e -> {
            if(!cadenaNumeros.equals("")){
                cadenaNumeros+="0";
                textoGrande.setText(cadenaNumeros);
            }
        };
        b0.addActionListener(m0);
        b0.addKeyListener(ah);
        ActionListener m1 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="1";
            }
            else{
                cadenaNumeros+="1";
            }
            textoGrande.setText(cadenaNumeros);
            activado=true;
        };
        b1.addActionListener(m1);
        b1.addKeyListener(ah);
        ActionListener m2 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="2";
            }
            else{
                cadenaNumeros+="2";
            }
            textoGrande.setText(cadenaNumeros);
            activado=true;
        };
        b2.addActionListener(m2);
        b2.addKeyListener(ah);
        ActionListener m3 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="3";
            }
            else{
                cadenaNumeros+="3";
            }
            textoGrande.setText(cadenaNumeros);
            activado=true;
        };
        b3.addActionListener(m3);
        b3.addKeyListener(ah);
        ActionListener m4 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="4";
            }
            else{
                cadenaNumeros+="4";
            }
            textoGrande.setText(cadenaNumeros);
            activado=true;
        };
        b4.addActionListener(m4);
        b4.addKeyListener(ah);
        ActionListener m5 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="5";
            }
            else{
                cadenaNumeros+="5";
            }
            textoGrande.setText(cadenaNumeros);
            activado=true;
        };
        b5.addActionListener(m5);
        b5.addKeyListener(ah);
        ActionListener m6 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="6";
            }
            else{
                cadenaNumeros+="6";
            }
            textoGrande.setText(cadenaNumeros);
            activado=true;
        };
        b6.addActionListener(m6);
        b6.addKeyListener(ah);
        ActionListener m7 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="7";
            }
            else{
                cadenaNumeros+="7";
            }
            textoGrande.setText(cadenaNumeros);
            activado=true;
        };
        b7.addActionListener(m7);
        b7.addKeyListener(ah);
        ActionListener m8 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="8";
            }
            else{
                cadenaNumeros+="8";
            }
            textoGrande.setText(cadenaNumeros);
            activado=true;
        };
        b8.addActionListener(m8);
        b8.addKeyListener(ah);
        ActionListener m9 = e -> {
            if(cadenaNumeros.equals("0")){
                cadenaNumeros="9";
            }
            else{
                cadenaNumeros+="9";
            }
            textoGrande.setText(cadenaNumeros);
            activado=true;
        };
        b9.addActionListener(m9);
        b9.addKeyListener(ah);
        //botón de suma
        ActionListener sumar = e -> {
            if(activado){
                n1=Double.parseDouble(cadenaNumeros);
                textoPeque.setText(cadenaNumeros+" + ");
                cadenaNumeros="";
                operacion="sumar";
            }
            activado=false;
            punto=true;
        };
        bsuma.addActionListener(sumar);
        bsuma.addKeyListener(ah);
        //botón de resta
        ActionListener restar = e ->{
            if(activado){
                n1=Double.parseDouble(cadenaNumeros);
                textoPeque.setText((cadenaNumeros+" - "));
                cadenaNumeros="";
                operacion="restar";
            }
            activado=false;
            punto=true;
        };
        bresta.addActionListener(restar);
        bresta.addKeyListener(ah);
        //boton de multiplicación
        ActionListener multi = e ->{
            if(activado){
                n1=Double.parseDouble(cadenaNumeros);
                textoPeque.setText((cadenaNumeros+" x "));
                cadenaNumeros="";
                operacion="multiplicar";
            }
            activado=false;
            punto=true;
        };
        bmult.addActionListener(multi);
        bmult.addKeyListener(ah);
        //boton de división
        ActionListener divis = e ->{
            if(activado){
                n1=Double.parseDouble(cadenaNumeros);
                textoPeque.setText((cadenaNumeros+" ÷ "));
                cadenaNumeros="";
                operacion="dividir";
            }
            activado=false;
            punto=true;
        };
        bdivi.addActionListener(divis);
        bdivi.addKeyListener(ah);
        //boton de raiz cuadrada
        ActionListener raiz = e ->{
            n1=Double.parseDouble(cadenaNumeros);
            textoPeque.setText("√("+cadenaNumeros+")");
            total = Math.sqrt(n1);
            textoGrande.setText(String.format("%.9f",total));
            cadenaNumeros = String.valueOf(total);
            punto=false;
        };
        braiz.addActionListener(raiz);
        braiz.addKeyListener(ah);
        //boton igual
        ActionListener resultado = e -> {
            switch (operacion) {
                case "nula" -> textoGrande.setText(cadenaNumeros);
                case "sumar" -> {
                    n2 = Double.parseDouble(cadenaNumeros);
                    total = n1 + n2;
                    textoGrande.setText(String.format("%.2f", total));
                    cadenaNumeros = String.valueOf(total); //esto copia el resultado del total de la suma.
                    operacion = "nula";
                }
                case "restar" -> {
                    n2 = Double.parseDouble(cadenaNumeros);
                    total = n1 - n2;
                    textoGrande.setText(String.format("%.2f", total));
                    cadenaNumeros = String.valueOf(total);
                    operacion = "nula";
                }
                case "multiplicar" -> {
                    n2 = Double.parseDouble(cadenaNumeros);
                    total = n1 * n2;
                    textoGrande.setText(String.format("%.2f", total));
                    cadenaNumeros = String.valueOf(total);
                    operacion = "nula";
                }
                case "dividir" -> {
                    n2 = Double.parseDouble(cadenaNumeros);
                    total = n1 / n2;
                    textoGrande.setText(String.format("%.9f", total));
                    cadenaNumeros = String.valueOf(total);
                    operacion = "nula";
                }
            }
            textoPeque.setText("");
            activado=true;

        };
        bigual.addActionListener(resultado);
        bigual.addKeyListener(ah);
        //boton de coma
        ActionListener coma = e -> {
            if(punto){
                if(cadenaNumeros.equals("")){
                    cadenaNumeros="0.";
                }
                else{
                    cadenaNumeros +=".";
                }
                textoGrande.setText(cadenaNumeros);
            }
            punto=false;
        };
        bcoma.addActionListener(coma);
        bcoma.addKeyListener(ah);
        //boton de +/-
        ActionListener masmenos = e ->{
            if(cadenaNumeros.charAt(0) !='-'){
                cadenaNumeros="-"+cadenaNumeros;
            }
            else{
                cadenaNumeros=cadenaNumeros.substring(1); //substring corta la cadena desde un punto hasta el que le
            }                                                      //Indiquemos. Normalmente, bastará con indicar el principio.
            textoGrande.setText(cadenaNumeros);
        };
        bnegat.addActionListener(masmenos);
        bnegat.addKeyListener(ah);
        //boton de borrar
        ActionListener borrar = e ->{
            int tamanio = cadenaNumeros.length();
            if(tamanio>0){
                if(tamanio==1){
                    cadenaNumeros="0";
                }
                else{
                    cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length()-1);
                }
                textoGrande.setText(cadenaNumeros);
            }
        };
        bborrar.addActionListener(borrar);
        bborrar.addKeyListener(ah);

        //boton de ClearScreen
        ActionListener cls = e ->{
            cadenaNumeros="0";
            operacion="nula";
            activado=true;
            punto=true;
            textoGrande.setText(cadenaNumeros);
            textoPeque.setText("");
        };
        bclear.addActionListener(cls);
        bclear.addKeyListener(ah);
    }
    private void mostrarEtiqueta(){
        textoGrande = new JLabel();
        textoGrande.setText("0");
        textoGrande.setFont(new Font("Arial",Font.PLAIN,35));
        textoGrande.setHorizontalAlignment(SwingConstants.RIGHT);
        textoGrande.setBounds(0,140,315,70);
        panel.add(textoGrande);

        textoPeque=new JLabel();
        textoPeque.setText("");
        textoPeque.setFont(new Font("Arial",Font.PLAIN,25));
        textoPeque.setHorizontalAlignment(SwingConstants.RIGHT);
        textoPeque.setBounds(0,70,315,40);
        panel.add(textoPeque);
    }
    private void mostrarMenu(){
        barramenu = new JMenuBar();
        barramenu.setBounds(0,0,320,20);
        panel.add(barramenu);

        menu = new JMenu();
        menu.setText("Opciones");
        barramenu.add(menu);

        estandar = new JMenuItem("Calculadora Estándar");
        menu.add(estandar);
        divisas = new JMenuItem("Conversor de Divisas");
        menu.add(divisas);

        ActionListener iraConversor = e -> {
            VentanaDivisas conversor = new VentanaDivisas();
            conversor.setVisible(true);

            dispose(); //Dispose cierra la ventana actual. No cierra el programa, pero si la ventana actual, así que
                       //hay que usarlo con sumo cuidado para no hacer un programa que no se vea. Para programas multiventanas
                       //irá que ni pintado para que no se pierdan recursos y se pueda optimizar al máximo.
        };
        divisas.addActionListener(iraConversor);
        separador = new JSeparator();
        menu.add(separador);

        JMenuItem salir = new JMenuItem("Salir");
        ActionListener salte = e -> System.exit(0);
        salir.addActionListener(salte);

        JMenuItem acercade = new JMenuItem("Acerca de");
        ActionListener info = e -> JOptionPane.showMessageDialog(null,"Desarrollado por Putozeros© Todos los derechos reservados\n5 de Enero de 2023"+
                "\nVersión 1.1: Ahora el teclado numérico funciona.");
        acercade.addActionListener(info);
        menu.add(acercade);
        menu.add(salir);
    }
    KeyListener ah = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD0){
                if(!cadenaNumeros.equals("")) {
                    cadenaNumeros += "0";
                    textoGrande.setText(cadenaNumeros);
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="1";
                }
                else{
                    cadenaNumeros+="1";
                }
                textoGrande.setText(cadenaNumeros);
                activado=true;
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="2";
                }
                else{
                    cadenaNumeros+="2";
                }
                textoGrande.setText(cadenaNumeros);
                activado=true;
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="3";
                }
                else{
                    cadenaNumeros+="3";
                }
                textoGrande.setText(cadenaNumeros);
                activado=true;
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="4";
                }
                else{
                    cadenaNumeros+="4";
                }
                textoGrande.setText(cadenaNumeros);
                activado=true;
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="5";
                }
                else{
                    cadenaNumeros+="5";
                }
                textoGrande.setText(cadenaNumeros);
                activado=true;
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="6";
                }
                else{
                    cadenaNumeros+="6";
                }
                textoGrande.setText(cadenaNumeros);
                activado=true;
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="7";
                }
                else{
                    cadenaNumeros+="7";
                }
                textoGrande.setText(cadenaNumeros);
                activado=true;
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="8";
                }
                else{
                    cadenaNumeros+="8";
                }
                textoGrande.setText(cadenaNumeros);
                activado=true;
            }
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
                if(cadenaNumeros.equals("0")){
                    cadenaNumeros="9";
                }
                else{
                    cadenaNumeros+="9";
                }
                textoGrande.setText(cadenaNumeros);
                activado=true;
            }
            if (e.getKeyCode() == KeyEvent.VK_ADD){
                if(activado){
                    n1=Double.parseDouble(cadenaNumeros);
                    textoPeque.setText(cadenaNumeros+" + ");
                    cadenaNumeros="";
                    operacion="sumar";
                }
                activado=false;
                punto=true;
            }
            if(e.getKeyCode() == KeyEvent.VK_SUBTRACT){
                if(activado){
                    n1=Double.parseDouble(cadenaNumeros);
                    textoPeque.setText((cadenaNumeros+" - "));
                    cadenaNumeros="";
                    operacion="restar";
                }
                activado=false;
                punto=true;
            }
            if(e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
                if (activado) {
                    n1 = Double.parseDouble(cadenaNumeros);
                    textoPeque.setText((cadenaNumeros + " x "));
                    cadenaNumeros = "";
                    operacion = "multiplicar";
                }
                activado = false;
                punto = true;
            }
                if (e.getKeyCode() == KeyEvent.VK_DIVIDE) {
                    if (activado) {
                        n1 = Double.parseDouble(cadenaNumeros);
                        textoPeque.setText((cadenaNumeros + " ÷ "));
                        cadenaNumeros = "";
                        operacion = "dividir";
                    }
                    activado = false;
                    punto = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_DECIMAL) {
                    if (punto) {
                        if (cadenaNumeros.equals("")) {
                            cadenaNumeros = "0.";
                        } else {
                            cadenaNumeros += ".";
                        }
                        textoGrande.setText(cadenaNumeros);
                    }
                    punto = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    switch (operacion) {
                        case "nula" -> textoGrande.setText(cadenaNumeros);
                        case "sumar" -> {
                            n2 = Double.parseDouble(cadenaNumeros);
                            total = n1 + n2;
                            textoGrande.setText(String.format("%.2f", total));
                            cadenaNumeros = String.valueOf(total); //esto copia el resultado del total de la suma.
                            operacion = "nula";
                        }
                        case "restar" -> {
                            n2 = Double.parseDouble(cadenaNumeros);
                            total = n1 - n2;
                            textoGrande.setText(String.format("%.2f", total));
                            cadenaNumeros = String.valueOf(total);
                            operacion = "nula";
                        }
                        case "multiplicar" -> {
                            n2 = Double.parseDouble(cadenaNumeros);
                            total = n1 * n2;
                            textoGrande.setText(String.format("%.2f", total));
                            cadenaNumeros = String.valueOf(total);
                            operacion = "nula";
                        }
                        case "dividir" -> {
                            n2 = Double.parseDouble(cadenaNumeros);
                            total = n1 / n2;
                            textoGrande.setText(String.format("%.9f", total));
                            cadenaNumeros = String.valueOf(total);
                            operacion = "nula";
                        }
                    }
                }
            }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };

    public static void main(String[] args) {
        Ventana c1=new Ventana();
        c1.setVisible(true);
    }
}