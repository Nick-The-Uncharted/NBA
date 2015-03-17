package presentation.main;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

import presentation.common.Admin;
import presentation.common.ImgSys;
import presentation.panel.BackgroundPanel;
/**
 * 
 * @author HCW
 *
 */
public class MainFrame extends JFrame{

	/**
	 * 系统的主窗口
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 鼠标
	 */
	private Cursor cursor;
	/**
	 * 实现移动
	 */
	private boolean in = false;
    private boolean moving;
    private int nowX;
    private int nowY;
    
    /**
     * 屏幕尺寸
     */
    int preWidth = (int) (1000*Admin.proportion);
    int preHeight = (int) (600*Admin.proportion);
    
    public MainFrame() {
		// TODO Auto-generated constructor stub
    	setTitle("NBA数据分析系统");
    	setSize(preWidth, preHeight);
    	setResizable(false);
    	setUndecorated(true);
    	setLocationRelativeTo(null);
    	/**
    	 * 设置鼠标
    	 */
    	cursor = Toolkit.getDefaultToolkit().createCustomCursor(ImgSys.cursor, new Point(0,0), "test");
    	setCursor(cursor);
    	/**
    	 * 设置图标
    	 */
    	setIconImage(ImgSys.icon);
    	
    	setLayout(null);
    	setMove();
    	setContentPane(new BackgroundPanel(preWidth, preHeight));
	}
    
    /**
	 * 实现移动
	 */
	private void setMove() {
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
            	if (e.getY() < 35) {
            		moving = true;
                    requestFocus();
                    nowX = e.getX();
                    nowY = e.getY();
            	}
            }
            public void mouseReleased(MouseEvent e) {
            	if (e.getY() < 35) {
            		moving = false;
            	}
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            	if (e.getY() < 35) {
                    setIn(true);
            	}
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (moving) {
                    int left = getLocation().x;
                    int top = getLocation().y;
                    setLocation(left + e.getX() - nowX, top + e.getY() - nowY);
                }
            }
        });
	}
	
    public boolean isIn() {
        return in;
    }

    public void setIn(boolean in) {
        this.in = in;
    }
}
