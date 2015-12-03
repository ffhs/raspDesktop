package net.p45q.swingremote;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * GuiMain
 *
 * Pascal Bieri, Thierry Baumann
 */
public class GuiMain extends JFrame implements KeyListener {
	private static GuiMain instance = new GuiMain();
	int lastkey;
	String lastText;

	public GuiMain() {
		requestFocus();
		addKeyListener(this);
		setContentPane(createAndShowGUI());

	}

	private JPanel createAndShowGUI() {
		JButton fwd = new JButton();
		JButton rwd = new JButton();
		JButton lft = new JButton();
		JButton rgt = new JButton();
		JButton tulft = new JButton();
		JButton turgt = new JButton();
		JButton tuel = new JButton();
		JButton fire = new JButton();
		JButton emer = new JButton();
		JFrame g = new JFrame();
		JPanel f = new JPanel(new FlowLayout(0));
		fwd.setText("FWD");
		rwd.setText("RFD");
		lft.setText("Left");
		rgt.setText("Right");
		tulft.setText("Tur Left");
		turgt.setText("Tur RIght");
		tuel.setText("TUr Elevation");
		fire.setText("Fire");
		emer.setText("Emergency");
		JTextField typingArea;
		typingArea = new JTextField(20);
		typingArea.addKeyListener(this);

		f.add(fwd);
		f.add(rwd);
		f.add(lft);
		f.add(rgt);
		f.add(tulft);
		f.add(turgt);
		f.add(tuel);
		f.add(fire);
		f.add(emer);
		f.add(typingArea);
		f.setVisible(true);
		// f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // wichtig!
		g.add(f);
		fwd.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("FWD");
				new SendStartAction(0);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				new SendStopAction(0);
				System.out.println("fertig");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		rwd.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {

				new SendStartAction(1);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				new SendStopAction(1);
				System.out.println("fertig");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		lft.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("FWD");
				new SendStartAction(2);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				new SendStopAction(2);
				System.out.println("fertig");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		rgt.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("FWD");
				new SendStartAction(3);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				new SendStopAction(3);
				System.out.println("fertig");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		tulft.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("FWD");
				new SendStartAction(4);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				new SendStopAction(4);
				System.out.println("fertig");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		turgt.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("FWD");
				new SendStartAction(5);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				new SendStopAction(5);
				System.out.println("fertig");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		tuel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("FWD");
				new SendStartAction(6);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				new SendStopAction(6);
				System.out.println("fertig");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		fire.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("FWD");
				new SendStartAction(7);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				new SendStopAction(7);
				System.out.println("fertig");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		emer.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("FWD");
				new SendStartAction(8);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				new SendStopAction(8);
				System.out.println("fertig");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

		return f;
	}

	public static GuiMain getInstance() {
		if (instance == null) {
			instance = new GuiMain();
		}
		return instance;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// myKeyEvt(e, "keyTyped");

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		myKeyEvt(e, "keyReleased");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		myKeyEvt(e, "keyTyped");
	}

	private void myKeyEvt(KeyEvent e, String text) {
		int key = e.getKeyCode();
		if (key == lastkey && text.equals(lastText))
			return;
		lastkey = key;
		lastText = text;
		if (key == KeyEvent.VK_KP_LEFT || key == KeyEvent.VK_LEFT) {
			System.out.println(text + " LEFT");
			if (text.equals("keyTyped"))
				new SendStartAction(2);
			if (text.equals("keyReleased"))
				new SendStopAction(2);
			// Call some function
		} else if (key == KeyEvent.VK_KP_RIGHT || key == KeyEvent.VK_RIGHT) {
			System.out.println(text + " RIGHT");
			// Call some function
			if (text.equals("keyTyped"))
				new SendStartAction(3);
			if (text.equals("keyReleased"))
				new SendStopAction(3);

		} else if (key == KeyEvent.VK_KP_UP || key == KeyEvent.VK_UP) {
			System.out.println(text + " UP");
			// Call some function
			if (text.equals("keyTyped"))
				new SendStartAction(0);
			if (text.equals("keyReleased"))
				new SendStopAction(0);
		} else if (key == KeyEvent.VK_KP_DOWN || key == KeyEvent.VK_DOWN) {
			System.out.println(text + " DOWN");
			// Call some function
			if (text.equals("keyTyped"))
				new SendStartAction(1);
			if (text.equals("keyReleased"))
				new SendStopAction(1);
		}
	}

}
