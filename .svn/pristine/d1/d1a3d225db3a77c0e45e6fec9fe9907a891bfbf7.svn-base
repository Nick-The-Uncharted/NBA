package presentation.table;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class TeamDataTableModel extends AbstractTableModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("rawtypes")
	Vector columnNames, rows;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public TeamDataTableModel() {
		columnNames = new Vector();
		columnNames.add("球队名称");
		columnNames.add("比赛场数");
		columnNames.add("投篮命中数");
		columnNames.add("投篮出手数");
		columnNames.add("三分命中数");
		columnNames.add("三分出手数");
		columnNames.add("罚球命中数");
		columnNames.add("罚球出手数");
		columnNames.add("进攻篮板数");
		columnNames.add("防守篮板数");
		columnNames.add("篮板数");
		columnNames.add("助攻数");
		columnNames.add("抢断数");
		columnNames.add("盖帽数");
		columnNames.add("失误数");
		columnNames.add("犯规数");
		columnNames.add("比赛得分");
		columnNames.add("投篮命中率");
		columnNames.add("三分命中率");
		columnNames.add("罚球命中率");
		columnNames.add("胜率");
		columnNames.add("进攻回合");
		columnNames.add("进攻效率");
		columnNames.add("防守效率");
		columnNames.add("篮板效率");
		columnNames.add("抢断效率");
		columnNames.add("助攻率");
		rows = new Vector();
		Vector a = new Vector<>();
		a.add("fds");
		a.add("fds");a.add("fds");
		a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");a.add("fds");
		rows.add(a);
		rows.add(a);
		
		rows.add(a);
		rows.add(a);
		rows.add(a);
		rows.add(a);rows.add(a);rows.add(a);rows.add(a);rows.add(a);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addRow(Vector v) {
		rows.add(v);
		fireTableRowsInserted(rows.size(), rows.size());
	}
	
	public void removeRow(int r) {
		rows.remove(r);
		fireTableRowsDeleted(r, r);
	}
	
	@Override
	public int getColumnCount() {
		return this.columnNames.size();
	}

	@Override
	public int getRowCount() {
		return this.rows.size();
	}
	
	@Override
	public String getColumnName(int column) {
		return (String) this.columnNames.get(column);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class getColumnClass(int c) {
		return String.class;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return ((Vector)rows.get(rowIndex)).get(columnIndex);
	}

}