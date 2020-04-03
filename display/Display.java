package display;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import autoimport.AutoImport;
import constants.Constants;
import display.utils.RoundedPanel;

public class Display {

	private JFrame frame = new JFrame();

	private final int WIDTH = 100, HEIGHT = 100;
	
	private AutoImport autoImport = new AutoImport();

	@SuppressWarnings("serial")
	public Display() {
		JPanel panel = new RoundedPanel(new Dimension(WIDTH, HEIGHT), new RoundRectangle2D.Float(0, 0, WIDTH, HEIGHT, WIDTH, HEIGHT));

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setSize(new Dimension(WIDTH, HEIGHT));
		frame.setContentPane(panel);
		frame.pack();
		frame.setBackground(new Color(0, 0, 0, 0));
		frame.setContentPane(panel);
		frame.setAlwaysOnTop(true);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {

		}

		JLabel label = new JLabel();
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos CSV", "csv");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showOpenDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					System.out.println("Selected file: " + chooser.getSelectedFile().getName());
					autoImport.execute(chooser.getSelectedFile());
				}
			}
		});
		label.setDropTarget(new DropTarget() {
			@Override
			public synchronized void dragEnter(DropTargetDragEvent dtde) {
				((RoundedPanel) panel).color = Color.decode("#590077");
				((RoundedPanel) panel).repaint();
			}

			@Override
			public synchronized void dragExit(DropTargetEvent dte) {
				((RoundedPanel) panel).color = Color.decode("#330077");
				((RoundedPanel) panel).repaint();
			}

			@SuppressWarnings("unchecked")
			public synchronized void drop(DropTargetDropEvent evt) {
				try {
					evt.acceptDrop(DnDConstants.ACTION_COPY);

					List<File> droppedFiles = (List<File>) evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
					for (File file : droppedFiles) {
						if (file.getName().endsWith(".csv")) {
							autoImport.execute(file);
						}
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		label.setOpaque(false);
		label.setBorder(null);
		label.setBounds(14, 0, WIDTH / 2, HEIGHT);
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Display.class.getClassLoader().getResource(Constants.RESOURCES_DIRECTORY + "/drop-icon.png")));
		panel.add(label);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		frame.setLocation((int) (screenSize.getWidth() - WIDTH / 2), (int) (screenSize.getHeight() / 3) - HEIGHT);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Display();
	}

}
