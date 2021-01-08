package Presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JToolBar;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.SwingConstants;

/**
 * The Class pnlDibujarRuta.
 */
public class pnlDibujarRuta extends JPanel {
	
	/** The tool bar. */
	private JToolBar toolBar;
	
	/** The btn caliente. */
	private JButton btnCaliente;
	
	/** The btn frio. */
	private JButton btnFrio;
	
	/** The btn ubicacion. */
	private JButton btnUbicacion;
	
	/** The btn dibujar. */
	private JButton btnDibujar;
	
	/** The btn fauna. */
	private JButton btnFauna;
	
	/** The btn flora. */
	private JButton btnFlora;
	
	/** The btn borrar. */
	private JButton btnBorrar;
	
	/** The btn cargar mapa. */
	private JButton btnCargarMapa;
	
	/** The scroll pane. */
	private JScrollPane scrollPane;
	
	/** The mi area dibujo. */
	private MiAreaDibujo miAreaDibujo;
	
	/** The imagen. */
	private ImageIcon imagen;

	/** The modo. */
	int modo = -1;
	
	/** The dibujar. */
	private final int DIBUJAR = 1;
	
	/** The borrar. */
	private final int BORRAR = 2;
	
	/** The fauna. */
	private final int FAUNA = 3;
	
	/** The flora. */
	private final int FLORA = 4;
	
	/** The caliente. */
	private final int CALIENTE = 5;
	
	/** The frio. */
	private final int FRIO = 6;
	
	/** The ubicacion. */
	private final int UBICACION = 7;

	/** The imag dibujar. */
	private Image imagDibujar;
	
	/** The imag borrar. */
	private Image imagBorrar;
	
	/** The imag fauna. */
	private Image imagFauna;
	
	/** The imag flora. */
	private Image imagFlora;
	
	/** The imag caliente. */
	private Image imagCaliente;
	
	/** The imag frio. */
	private Image imagFrio;
	
	/** The imag ubicacion. */
	private Image imagUbicacion;

	/** The imag cursor dibujar. */
	private Image imagCursorDibujar;
	
	/** The imag cursor borrar. */
	private Image imagCursorBorrar;
	
	/** The imag cursor fauna. */
	private Image imagCursorFauna;
	
	/** The imag cursor flora. */
	private Image imagCursorFlora;
	
	/** The imag cursor caliente. */
	private Image imagCursorCaliente;
	
	/** The imag cursor frio. */
	private Image imagCursorFrio;
	
	/** The imag cursor ubicacion. */
	private Image imagCursorUbicacion;

	/** The Cursor dibujar. */
	private Cursor CursorDibujar;
	
	/** The Cursor borrar. */
	private Cursor CursorBorrar;
	
	/** The Cursor cliente. */
	private Cursor CursorCliente;
	
	/** The Cursor vip. */
	private Cursor CursorVip;
	
	/** The Cursor caliente. */
	private Cursor CursorCaliente;
	
	/** The Cursor frio. */
	private Cursor CursorFrio;
	
	/** The Cursor pagar. */
	private Cursor CursorPagar;

	/** The toolkit. */
	private Toolkit toolkit;
	
	/** The y. */
	private int x, y;
	
	/** The btn remove all. */
	private JButton btnRemoveAll;

	/**
	 * Create the panel.
	 */
	public pnlDibujarRuta() {
		setLayout(new BorderLayout(0, 0));
		{
			toolBar = new JToolBar();
			add(toolBar, BorderLayout.NORTH);
			{
				btnCargarMapa = new JButton("");
				btnCargarMapa.setMnemonic('L');
				btnCargarMapa.addActionListener(new BtnCargarMapaActionListener());
				btnCargarMapa
						.setIcon(new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/mapa.png")));
				toolBar.add(btnCargarMapa);
			}
			{
				btnDibujar = new JButton("");

				btnDibujar.setMnemonic('D');
				btnDibujar.addActionListener(new BtnDibujarActionListener());
				btnDibujar
						.setIcon(new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/editar.png")));
				toolBar.add(btnDibujar);
			}
			{
				btnBorrar = new JButton("");
				btnBorrar.setMnemonic('B');
				btnBorrar.addActionListener(new BtnBorrarActionListener());
				btnBorrar.setIcon(
						new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/goma-de-borrar.png")));
				toolBar.add(btnBorrar);
			}
			{
				btnFauna = new JButton("");
				btnFauna.setIcon(
						new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/animal_ico32.png")));

				btnFauna.setMnemonic('C');
				btnFauna.addActionListener(new BtnFaunaActionListener());

				toolBar.add(btnFauna);
			}
			{
				btnFlora = new JButton("");
				btnFlora.setIcon(
						new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/planta_ico32.png")));

				btnFlora.setMnemonic('V');
				btnFlora.addActionListener(new BtnFloraActionListener());

				toolBar.add(btnFlora);
			}
			{
				btnCaliente = new JButton("");

				btnCaliente.setMnemonic('H');
				btnCaliente.addActionListener(new BtnCalienteActionListener());
				btnCaliente.setIcon(
						new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/caliente.png")));
				toolBar.add(btnCaliente);
			}
			{
				btnFrio = new JButton("");

				btnFrio.setMnemonic('J');
				btnFrio.addActionListener(new BtnFrioActionListener());
				btnFrio.setIcon(new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/frio.png")));
				toolBar.add(btnFrio);
			}
			{
				btnUbicacion = new JButton("");

				btnUbicacion.setMnemonic('P');
				btnUbicacion.addActionListener(new BtnUbicacionActionListener());
				btnUbicacion.setIcon(
						new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/ubicación_ico32.png")));
				toolBar.add(btnUbicacion);
			}
			{
				btnRemoveAll = new JButton("");
				btnRemoveAll.setMnemonic('X');
				btnRemoveAll.addActionListener(new BtnRemoveAllActionListener());
				btnRemoveAll
						.setIcon(new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/boton-x.png")));
				btnRemoveAll.setHorizontalTextPosition(SwingConstants.RIGHT);
				btnRemoveAll.setHorizontalAlignment(SwingConstants.RIGHT);
				toolBar.add(btnRemoveAll);
			}
		}
		{
			scrollPane = new JScrollPane();
			add(scrollPane, BorderLayout.CENTER);
		}
		miAreaDibujo = new MiAreaDibujo();
		miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
		miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
		miAreaDibujo.setIcon(null);
		scrollPane.setViewportView(miAreaDibujo);

		// CreacioÌ�n de imaÌ�genes y cursores
		toolkit = Toolkit.getDefaultToolkit();
		imagDibujar = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/editar.png"));
		imagBorrar = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/goma-de-borrar.png"));
		imagFauna = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/animal_ico32.png"));
		imagFlora = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/planta_ico32.png"));
		imagCaliente = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/caliente.png"));
		imagFrio = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/frio.png"));
		imagUbicacion = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/ubicación_ico32.png"));

		imagCursorDibujar = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/dibujar.png"));
		imagCursorBorrar = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/borrar.png"));
		imagCursorFauna = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/animal_ico16.png"));
		imagCursorFlora = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/planta_ico16.png"));
		imagCursorCaliente = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/caliente.png"));
		imagCursorFrio = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/frio.png"));
		imagCursorUbicacion = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/ubicación_ico16.png"));

		// Creacion de cursores

		CursorDibujar = toolkit.createCustomCursor(imagCursorDibujar, new Point(0, 0), "CURSOR_DIBUJAR");

		CursorBorrar = toolkit.createCustomCursor(imagCursorBorrar, new Point(0, 0), "CURSOR_BORRAR");

		CursorCliente = toolkit.createCustomCursor(imagCursorFauna, new Point(0, 0), "CURSOR_FAUNA");

		CursorVip = toolkit.createCustomCursor(imagCursorFlora, new Point(0, 0), "CURSOR_FLORA");

		CursorCaliente = toolkit.createCustomCursor(imagCursorCaliente, new Point(0, 0), "CURSOR_CALIENTE");

		CursorFrio = toolkit.createCustomCursor(imagCursorFrio, new Point(0, 0), "CURSOR_FRIO");

		CursorPagar = toolkit.createCustomCursor(imagCursorUbicacion, new Point(0, 0), "CURSOR_UBICACION");

		miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
		miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());

		ImageIcon miniatura = null;
		try {
			miniatura = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/mapa.jpg" + ""));

		} catch (Exception e) {
			miniatura = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/mapa.jpg"));
		} finally {
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(1024, 1024, java.awt.Image.SCALE_SMOOTH);
			miniatura = new ImageIcon(newimg);
			imagen = new ImageIcon(newimg);
		}

		miAreaDibujo.setIcon(imagen);

		habilitarBotones(true);
	}

	/**
	 * Habilitar botones.
	 *
	 * @param bool the bool
	 */
	private void habilitarBotones(boolean bool) {
		btnBorrar.setEnabled(bool);
		btnCaliente.setEnabled(bool);
		btnFauna.setEnabled(bool);
		btnDibujar.setEnabled(bool);
		btnFrio.setEnabled(bool);
		btnUbicacion.setEnabled(bool);
		btnFlora.setEnabled(bool);
		btnRemoveAll.setEnabled(bool);
	}

	/**
	 * The listener interface for receiving btnCargarMapaAction events.
	 * The class that is interested in processing a btnCargarMapaAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnCargarMapaActionListener<code> method. When
	 * the btnCargarMapaAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnCargarMapaActionEvent
	 */
	private class BtnCargarMapaActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			int valorDevuelto = fcAbrir.showOpenDialog(miAreaDibujo);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				imagen = new ImageIcon(file.getAbsolutePath());
				miAreaDibujo.setIcon(imagen);
				miAreaDibujo.removeAll();
				miAreaDibujo.repaint();
				habilitarBotones(true);
			}
		}
	}

	/**
	 * The listener interface for receiving btnDibujarAction events.
	 * The class that is interested in processing a btnDibujarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnDibujarActionListener<code> method. When
	 * the btnDibujarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnDibujarActionEvent
	 */
	private class BtnDibujarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			modo = DIBUJAR;
			setCursor(CursorDibujar);

		}
	}

	/**
	 * The listener interface for receiving btnBorrarAction events.
	 * The class that is interested in processing a btnBorrarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnBorrarActionListener<code> method. When
	 * the btnBorrarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnBorrarActionEvent
	 */
	private class BtnBorrarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			modo = BORRAR;
			setCursor(CursorBorrar);
		}
	}

	/**
	 * The listener interface for receiving btnFaunaAction events.
	 * The class that is interested in processing a btnFaunaAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnFaunaActionListener<code> method. When
	 * the btnFaunaAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnFaunaActionEvent
	 */
	private class BtnFaunaActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			modo = FAUNA;
			setCursor(CursorCliente);
		}
	}

	/**
	 * The listener interface for receiving btnFloraAction events.
	 * The class that is interested in processing a btnFloraAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnFloraActionListener<code> method. When
	 * the btnFloraAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnFloraActionEvent
	 */
	private class BtnFloraActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			modo = FLORA;
			setCursor(CursorVip);
		}
	}

	/**
	 * The listener interface for receiving btnCalienteAction events.
	 * The class that is interested in processing a btnCalienteAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnCalienteActionListener<code> method. When
	 * the btnCalienteAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnCalienteActionEvent
	 */
	private class BtnCalienteActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			modo = CALIENTE;
			setCursor(CursorCaliente);
		}
	}

	/**
	 * The listener interface for receiving btnFrioAction events.
	 * The class that is interested in processing a btnFrioAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnFrioActionListener<code> method. When
	 * the btnFrioAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnFrioActionEvent
	 */
	private class BtnFrioActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			modo = FRIO;
			setCursor(CursorFrio);
		}
	}

	/**
	 * The listener interface for receiving btnUbicacionAction events.
	 * The class that is interested in processing a btnUbicacionAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnUbicacionActionListener<code> method. When
	 * the btnUbicacionAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnUbicacionActionEvent
	 */
	private class BtnUbicacionActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			modo = UBICACION;
			setCursor(CursorPagar);
		}
	}

	/**
	 * The listener interface for receiving miAreaDibujoMouse events.
	 * The class that is interested in processing a miAreaDibujoMouse
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addMiAreaDibujoMouseListener<code> method. When
	 * the miAreaDibujoMouse event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see MiAreaDibujoMouseEvent
	 */
	private class MiAreaDibujoMouseListener extends MouseAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent)
		 */
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			if (imagen != null) {
				switch (modo) {
				case FAUNA:
					miAreaDibujo.addObjetoGrafico(new ImagenDibujo(x, y, imagFauna));
					miAreaDibujo.repaint();
					break;
				case FLORA:
					miAreaDibujo.addObjetoGrafico(new ImagenDibujo(x, y, imagFlora));
					miAreaDibujo.repaint();
					break;
				case CALIENTE:
					miAreaDibujo.addObjetoGrafico(new ImagenDibujo(x, y, imagCaliente));
					miAreaDibujo.repaint();
					break;
				case FRIO:
					miAreaDibujo.addObjetoGrafico(new ImagenDibujo(x, y, imagFrio));
					miAreaDibujo.repaint();
					break;
				case UBICACION:
					miAreaDibujo.addObjetoGrafico(new ImagenDibujo(x, y, imagUbicacion));
					miAreaDibujo.repaint();
					break;
				case DIBUJAR:
					miAreaDibujo.addObjetoGrafico(new LineaDibujo(x, y, x, y, Color.RED));
					break;
				case BORRAR:
					miAreaDibujo.removeObjetoGrafico(x, y);
					miAreaDibujo.repaint();
					break;
				}
			}
		}
	}

	/**
	 * The listener interface for receiving miAreaDibujoMouseMotion events.
	 * The class that is interested in processing a miAreaDibujoMouseMotion
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addMiAreaDibujoMouseMotionListener<code> method. When
	 * the miAreaDibujoMouseMotion event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see MiAreaDibujoMouseMotionEvent
	 */
	private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.MouseMotionAdapter#mouseDragged(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseDragged(MouseEvent e) {
			if (modo == DIBUJAR && imagen != null) {
				((LineaDibujo) miAreaDibujo.getUltimoObjetoDibujo()).setX1(e.getX());
				((LineaDibujo) miAreaDibujo.getUltimoObjetoDibujo()).setY1(e.getY());
				miAreaDibujo.repaint();
			}
		}
	}

	/**
	 * The listener interface for receiving btnRemoveAllAction events.
	 * The class that is interested in processing a btnRemoveAllAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnRemoveAllActionListener<code> method. When
	 * the btnRemoveAllAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnRemoveAllActionEvent
	 */
	private class BtnRemoveAllActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			if (JOptionPane.showConfirmDialog(null, "Â¿Estas seguro de que deseas borrar todo?", "Cuidado",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				miAreaDibujo.removeAll();
				miAreaDibujo.repaint();
			} else {

			}
		}
	}
}
