package presentation.common;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class CBoxListCellRenderer implements ListCellRenderer {
	

	
	final BackGroundPanel panel = new BackGroundPanel();
	JLabel label = new JLabel();
	Image img;
	
	public CBoxListCellRenderer(Image img) {
		this.img = img;
	}

	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {

		label.setText(value.toString());
		panel.add(label);

		return panel;
	}

	@SuppressWarnings("serial")
	class BackGroundPanel extends JPanel {

		@Override
		public void paintComponent(Graphics arg0) {
			arg0.drawImage(img, 0, 0, null);
		}
	}
}
