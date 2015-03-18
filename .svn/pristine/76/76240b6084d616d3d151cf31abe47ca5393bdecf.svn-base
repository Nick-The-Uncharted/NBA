package presentation.table;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TeamSumDataTable extends JTable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TeamSumDataTable(int width, int height, int x, int y) {
		setSize(width, height);
		setLocation(x, y);
		setModel(new TeamDataTableModel());
		setForeground(Color.WHITE);
		setBorder(null);
		setOpaque(false);	//设置透明
		setBackground(null);	//设置背景
		setRowHeight(45);	//设置行高
		setShowHorizontalLines(false);
		setShowVerticalLines(false);
	}
	
	@Override
	public Component prepareRenderer(TableCellRenderer renderer, int row,
			int column) {
		Component c = super.prepareRenderer(renderer, row, column);
		((JComponent) c).setOpaque(false);
		((JComponent) c).setBorder(null);
		return c;
	}
}
