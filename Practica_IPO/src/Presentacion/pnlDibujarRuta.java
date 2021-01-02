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
	private JButton btnPagar;
	private JButton btnDibujar;
	private JButton btnCliente;
	private JButton btnVIP;
	private JButton btnBorrar;
	private JButton btnCargarMapa;
	private JScrollPane scrollPane;
	private MiAreaDibujo miAreaDibujo;
	private ImageIcon imagen;

	int modo = -1;
	private final int DIBUJAR = 1;
	private final int BORRAR = 2;
	private final int CLIENTE = 3;
	private final int VIP = 4;
	private final int CALIENTE = 5;
	private final int FRIO = 6;
	private final int PAGAR = 7;

	private Image imagDibujar;
	private Image imagBorrar;
	private Image imagCliente;
	private Image imagVip;
	private Image imagCaliente;
	private Image imagFrio;
	private Image imagPagar;

	private Image imagCursorDibujar;
	private Image imagCursorBorrar;
	private Image imagCursorCliente;
	private Image imagCursorVip;
	private Image imagCursorCaliente;
	private Image imagCursorFrio;
	private Image imagCursorPagar;

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
				btnCliente = new JButton("");
				// btnCliente.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnCliente.toolTipText"));
				// //$NON-NLS-1$
				btnCliente.setMnemonic('C');
				btnCliente.addActionListener(new BtnClienteActionListener());
				// btnCliente.setIcon(
				// new
				// ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Iconos/hombre.png")));
				toolBar.add(btnCliente);
			}
			{
				btnVIP = new JButton("");
				// btnVIP.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnVIP.toolTipText"));
				// //$NON-NLS-1$
				btnVIP.setMnemonic('V');
				btnVIP.addActionListener(new BtnVIPActionListener());
				// btnVIP.setIcon(new
				// ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Iconos/vip-2.png")));
				toolBar.add(btnVIP);
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
				btnPagar = new JButton("");
				// btnPagar.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnPagar.toolTipText"));
				// //$NON-NLS-1$
				btnPagar.setMnemonic('P');
				btnPagar.addActionListener(new BtnPagarActionListener());
				// btnPagar.setIcon(
				// new
				// ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Iconos/pagar.png")));
				toolBar.add(btnPagar);
			}
			{
				btnRemoveAll = new JButton("");
				// btnRemoveAll.setToolTipText(MessagesPrincipal.getString("panelEnvioDomicilio.btnRemoveAll.toolTipText"));
				// //$NON-NLS-1$
				btnRemoveAll.setMnemonic('X');
				btnRemoveAll.addActionListener(new BtnRemoveAllActionListener());
				// btnRemoveAll.setIcon(
				// new
				// ImageIcon(pnlDibujarRuta.class.getResource("/Presentacion/Iconos/boton-x.png")));
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
		// imagCliente =
		// toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/hombre.png"));
		//imagVip = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/vip-2.png"));
		imagCaliente = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/caliente.png"));
		imagFrio = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Imagenes/frio.png"));
		// imagPagar =
		// toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Iconos/pagar.png"));

		imagCursorDibujar = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/dibujar.png"));
		imagCursorBorrar = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/borrar.png"));
		//imagCursorCliente = toolkit
		//		.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/cliente.png"));
		// imagCursorVip =
		// toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/vip.png"));
		imagCursorCaliente = toolkit
				.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/caliente.png"));
		imagCursorFrio = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/frio.png"));
		// imagCursorPagar =
		// toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/Cursores/pagar.png"));

		// Creacion de cursores

		CursorDibujar = toolkit.createCustomCursor(imagCursorDibujar, new Point(0, 0), "CURSOR_DIBUJAR");

		CursorBorrar = toolkit.createCustomCursor(imagCursorBorrar, new Point(0, 0), "CURSOR_BORRAR");

		//CursorCliente = toolkit.createCustomCursor(imagCursorCliente, new Point(0, 0), "CURSOR_CLIENTE");

		// CursorVip = toolkit.createCustomCursor(imagCursorVip, new Point(0, 0),
		// "CURSOR_VIP");

		CursorCaliente = toolkit.createCustomCursor(imagCursorCaliente, new Point(0, 0), "CURSOR_CALIENTE");

		CursorFrio = toolkit.createCustomCursor(imagCursorFrio, new Point(0, 0), "CURSOR_FRIO");

		// CursorPagar = toolkit.createCustomCursor(imagCursorPagar, new Point(0, 0),
		// "CURSOR_PAGAR");

		// aÃ±adimos listener

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
		btnCliente.setEnabled(bool);
		btnDibujar.setEnabled(bool);
		btnFrio.setEnabled(bool);
		btnPagar.setEnabled(bool);
		btnVIP.setEnabled(bool);
		btnRemoveAll.setEnabled(bool);
	}

	private class BtnCargarMapaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
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

	private class BtnClienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = CLIENTE;
			setCursor(CursorCliente);
		}
	}

	private class BtnVIPActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = VIP;
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

	private class BtnPagarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = PAGAR;
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
				case CLIENTE:
					miAreaDibujo.addObjetoGrafico(new ImagenDibujo(x, y, imagCliente));
					miAreaDibujo.repaint();
					break;
				case VIP:
					miAreaDibujo.addObjetoGrafico(new ImagenDibujo(x, y, imagVip));
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
				case PAGAR:
					miAreaDibujo.addObjetoGrafico(new ImagenDibujo(x, y, imagPagar));
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
