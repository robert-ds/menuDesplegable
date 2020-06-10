import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

///////////////////////////////////////////
//
//
//	@Author Robert Vasquez - 2019
//
//
///////////////////////////////////////////

	//Clase Que da forma al menú

public class ventanaMenu implements ActionListener {
	JFrame ventana;
	JMenu opcion1,opcion2,Sopcion1,Sopcion2,Sopcion3,Sopcion4;
	JMenuItem sub1,sub2;
	JMenuBar menubar;
	
	//Metodo para crear Menú
	public void crearMenu(){
		menubar = new JMenuBar();
		
		opcion1 = new JMenu("1");
		opcion2 = new JMenu("2 ");
		
		Sopcion1 = new JMenu("A");
		Sopcion2 = new JMenu("B");
		Sopcion3 = new JMenu("C");
		Sopcion4 = new JMenu("D");
		
		sub1 = new JMenuItem("X");
		sub2 = new JMenuItem("Y");
		
		menubar.add(opcion1);
		menubar.add(opcion2);
		
		opcion1.add(Sopcion1);
		opcion1.add(Sopcion2);
		
		opcion2.add(Sopcion3);
		opcion2.add(Sopcion4);
		
		Sopcion2.add(sub1);
		Sopcion2.add(sub2);
		
		Sopcion1.addActionListener(this);
		Sopcion2.addActionListener(this);
		Sopcion3.addActionListener(this);
		Sopcion4.addActionListener(this);
		
		sub1.addActionListener(this);
		sub2.addActionListener(this);

	}
	
	//Método para crear Ventana
	public void crearVentana(){
		ventana = new JFrame("Ventana con Menú");
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		ventana.setSize(300, 300);
		ventana.setVisible(true);
		ventana.setJMenuBar(menubar);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	}
	
	//Constructor
	public ventanaMenu(){
		crearMenu();
		crearVentana();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == sub1 ){
			ventana.setSize(500,500);
		}
		
	}
}
