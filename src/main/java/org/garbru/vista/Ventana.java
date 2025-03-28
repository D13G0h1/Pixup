package org.garbru.vista;
//FALTA CALCULAR SOMETHING
import org.garbru.interfaces.Ejecutable;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable
{
    private static Ventana ventana;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;

    private Ventana( )
    {
        super( "Programa de Pixup" );
        init( );
    }

    private void init()
    {
        jLabel = new JLabel( "Dame un Estado" );
        jLabel.setBounds( 10, 10, 100, 20);
        jTextField = new JTextField( );
        jTextField.setBounds( 120, 10, 100, 20);
        jButton = new JButton( "Aññadir" );
        jButton.setBounds( 10, 40, 100, 20);

        getContentPane().setLayout( null );
        getContentPane().add( jLabel );
        getContentPane().add( jTextField );
        getContentPane().add( jButton );

        jButton.addActionListener( (event) ->{
                }
        );
    }

    public static Ventana getInstance( )
    {
        if(ventana==null)
        {
            ventana=new Ventana();
        }
        return ventana;
    }

    @Override
    public void run()
    {
        setBounds( 100, 100, 300, 200);
        setVisible( true );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }
}