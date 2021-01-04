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

public class pnlDibujarRuta extends JPanel {
	private JToolBar toolBar;
	private JButton btnCaliente;
	private JButton btnFrio;
	private JButton btnUbicacion;
	private JButton btnDibujar;
	private JButton btnFauna;
	private JButton btnFlora;
	private JButton btnBorrar;
	private JButton btnCargarMapa;
	private JScrollPane scrollPane;
	private MiAreaDibujo miAreaDibujo;
	private ImageIcon imagen;

	int modo = -1;
	private final int DIBUJAR = 1;
	private final int BORRAR = 2;
	private final int FAUNA = 3;
	private final int FLORA = 4;
	private final int CALIENTE = 5;
	private final int FRIO = 6;
	private final int UBICACION = 7;

	private Image imagDibujar;
	private Image imagBorrar;
	private Image imagFauna;
	private Image imagFlora;
	private Image imagCaliente;
	private Image imagFrio;
	private Image imagUbicacion;

	private Image imagCursorDibujar;
	private Image imagCursorBorrar;
	private Image imagCursorFauna;
	private Image imagCursorFlora;
	private Image imagCursorCaliente;
	private Image imagCursorFrio;
	private Image imagCursorUbicacion;

	private Cursor CursorDibujar;
	private Cursor CursorBorrar;
	private Cursor CursorCliente;
	private Cursor CursorVip;
	private Cursor CursorCaliente;
	private Cursor CursorFrio;
	private Cursor CursorPagar;

	private Toolkit toolkit;
	private int x, y;
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
				// btnCargarMapa.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnCargarMapa.toolTipText"));
				// //$NON-NLS-1$
				btnCargarMapa.setMnemonic('L');
				btnCargarMapa.addActionListener(new BtnCargarMapaActionListener());
				btnCargarMapa
						.setIcon(new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/mapa.png")));
				toolBar.add(btnCargarMapa);
			}
			{
				btnDibujar = new JButton("");
				// btnDibujar.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnDibujar.toolTipText"));
				// //$NON-NLS-1$
				btnDibujar.setMnemonic('D');
				btnDibujar.addActionListener(new BtnDibujarActionListener());
				btnDibujar
						.setIcon(new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/editar.png")));
				toolBar.add(btnDibujar);
			}
			{
				btnBorrar = new JButton("");
				// btnBorrar.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnBorrar.toolTipText"));
				// //$NON-NLS-1$
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
				// btnCliente.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnCliente.toolTipText"));
				// //$NON-NLS-1$
				btnFauna.setMnemonic('C');
				btnFauna.addActionListener(new BtnFaunaActionListener());
				// btnCliente.setIcon(
				// new
				// ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Iconos/hombre.png")));
				toolBar.add(btnFauna);
			}
			{
				btnFlora = new JButton("");
				btnFlora.setIcon(
						new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/planta_ico32.png")));
				// btnVIP.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnVIP.toolTipText"));
				// //$NON-NLS-1$
				btnFlora.setMnemonic('V');
				btnFlora.addActionListener(new BtnFloraActionListener());
				// btnVIP.setIcon(new
				// ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Iconos/vip-2.png")));
				toolBar.add(btnFlora);
			}
			{
				btnCaliente = new JButton("");
				// btnCaliente.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnCaliente.toolTipText"));
				// //$NON-NLS-1$
				btnCaliente.setMnemonic('H');
				btnCaliente.addActionListener(new BtnCalienteActionListener());
				btnCaliente.setIcon(
						new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/caliente.png")));
				toolBar.add(btnCaliente);
			}
			{
				btnFrio = new JButton("");
				// btnFrio.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnFrio.toolTipText"));
				// //$NON-NLS-1$
				btnFrio.setMnemonic('J');
				btnFrio.addActionListener(new BtnFrioActionListener());
				btnFrio.setIcon(new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/frio.png")));
				toolBar.add(btnFrio);
			}
			{
				btnUbicacion = new JButton("");
				// btnPagar.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnPagar.toolTipText"));
				// //$NON-NLS-1$
				btnUbicacion.setMnemonic('P');
				btnUbicacion.addActionListener(new BtnUbicacionActionListener());
				btnUbicacion.setIcon(
						new ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Imagenes/ubicación_ico32.png")));
				toolBar.add(btnUbicacion);
			}
			{
				btnRemoveAll = new JButton("");
				// btnRemoveAll.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnRemoveAll.toolTipText"));
				// //$NON-NLS-1$
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

	private class BtnCargarMapaActionListener implements ActionListener {
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

	private class BtnDibujarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = DIBUJAR;
			setCursor(CursorDibujar);

		}
	}

	private class BtnBorrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = BORRAR;
			setCursor(CursorBorrar);
		}
	}

	private class BtnFaunaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = FAUNA;
			setCursor(CursorCliente);
		}
	}

	private class BtnFloraActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = FLORA;
			setCursor(CursorVip);
		}
	}

	private class BtnCalienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = CALIENTE;
			setCursor(CursorCaliente);
		}
	}

	private class BtnFrioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = FRIO;
			setCursor(CursorFrio);
		}
	}

	private class BtnUbicacionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = UBICACION;
			setCursor(CursorPagar);
		}
	}

	private class MiAreaDibujoMouseListener extends MouseAdapter {
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

	private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			if (modo == DIBUJAR && imagen != null) {
				((LineaDibujo) miAreaDibujo.getUltimoObjetoDibujo()).setX1(e.getX());
				((LineaDibujo) miAreaDibujo.getUltimoObjetoDibujo()).setY1(e.getY());
				miAreaDibujo.repaint();
			}
		}
	}

	private class BtnRemoveAllActionListener implements ActionListener {
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
