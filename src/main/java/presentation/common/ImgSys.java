package presentation.common;

import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * 
 * @author HCW
 * 存储系统必要图片
 */
public class ImgSys {
	public static ImageIcon exit = new ImageIcon(System.getProperty("user.dir")+"/material/exit.png");
	public static ImageIcon min = new ImageIcon(System.getProperty("user.dir")+"/material/min.png");
	public static ImageIcon logo = new ImageIcon(System.getProperty("user.dir")+"/material/logo.png");
	public static ImageIcon player = new ImageIcon(System.getProperty("user.dir")+"/material/player.png");
	public static ImageIcon player_selected = new ImageIcon(System.getProperty("user.dir")+"/material/player_selected.png");
	public static ImageIcon player_selected_border = new ImageIcon(System.getProperty("user.dir")+"/material/player_selected_border.png");
	public static ImageIcon team = new ImageIcon(System.getProperty("user.dir")+"/material/team.png");
	public static ImageIcon team_selected = new ImageIcon(System.getProperty("user.dir")+"/material/team_selected.png");
	public static ImageIcon team_selected_border = new ImageIcon(System.getProperty("user.dir")+"/material/team_selected_border.png");
	public static ImageIcon player_sort = new ImageIcon(System.getProperty("user.dir")+"/material/player_sort.png");
	public static ImageIcon player_sort_selected = new ImageIcon(System.getProperty("user.dir")+"/material/player_sort_selected.png");
	public static ImageIcon player_sort_selected_border = new ImageIcon(System.getProperty("user.dir")+"/material/player_sort_selected_border.png");
	public static ImageIcon team_sort = new ImageIcon(System.getProperty("user.dir")+"/material/team_sort.png");
	public static ImageIcon team_sort_selected = new ImageIcon(System.getProperty("user.dir")+"/material/team_sort_selected.png");
	public static ImageIcon team_sort_selected_border = new ImageIcon(System.getProperty("user.dir")+"/material/team_sort_selected_border.png");
	public static ImageIcon search = new ImageIcon(System.getProperty("user.dir")+"/material/search.png");
	public static ImageIcon nextPage = new ImageIcon(System.getProperty("user.dir")+"/material/nextPage.png");
	public static ImageIcon lastPage = new ImageIcon(System.getProperty("user.dir")+"/material/lastpage.png");
	public static ImageIcon more = new ImageIcon(System.getProperty("user.dir")+"/material/more.png");

	public static Image cursor = new ImageIcon(System.getProperty("user.dir")+"/material/cursor.png").getImage();
	public static Image icon = new ImageIcon(System.getProperty("user.dir")+"/material/icon.jpg").getImage();
	public static Image background = new ImageIcon(System.getProperty("user.dir")+"/material/background.png").getImage();
	public static Image teamList = new ImageIcon(System.getProperty("user.dir")+"/material/team_table.png").getImage();
	public static Image welcome = new ImageIcon(System.getProperty("user.dir")+"/material/welcome.png").getImage();
	
	/**
	 * 设置图片大小
	 * @return
	 */
	public static void resizeImg(){
		exit.setImage(exit.getImage().getScaledInstance((int)(35*Admin.proportion), (int)(35*Admin.proportion), Image.SCALE_DEFAULT));
		min.setImage(min.getImage().getScaledInstance((int)(35*Admin.proportion), (int)(35*Admin.proportion), Image.SCALE_DEFAULT));
		logo.setImage(logo.getImage().getScaledInstance((int)(197*Admin.proportion), (int)(110*Admin.proportion), Image.SCALE_DEFAULT));
		player.setImage(player.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		player_selected.setImage(player_selected.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		player_selected_border.setImage(player_selected_border.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		player_sort.setImage(player_sort.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		player_sort_selected.setImage(player_sort_selected.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		player_sort_selected_border.setImage(player_sort_selected_border.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		team.setImage(team.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		team_selected.setImage(team_selected.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		team_selected_border.setImage(team_selected_border.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		team_sort.setImage(team_sort.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		team_sort_selected.setImage(team_sort_selected.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		team_sort_selected_border.setImage(team_sort_selected_border.getImage().getScaledInstance((int)(119*Admin.proportion), (int)(37*Admin.proportion), Image.SCALE_DEFAULT));
		search.setImage(search.getImage().getScaledInstance((int)(58*Admin.proportion), (int)(25*Admin.proportion), Image.SCALE_DEFAULT));
		nextPage.setImage(nextPage.getImage().getScaledInstance((int)(40*Admin.proportion), (int)(40*Admin.proportion), Image.SCALE_DEFAULT));
		lastPage.setImage(lastPage.getImage().getScaledInstance((int)(40*Admin.proportion), (int)(40*Admin.proportion), Image.SCALE_DEFAULT));
		more.setImage(more.getImage().getScaledInstance((int)(79*Admin.proportion), (int)(51*Admin.proportion), Image.SCALE_DEFAULT));
		
		background = background.getScaledInstance((int)(1000*Admin.proportion), (int) (600*Admin.proportion), Image.SCALE_DEFAULT);
		teamList = teamList.getScaledInstance((int)(840*Admin.proportion), (int) (477*Admin.proportion), Image.SCALE_DEFAULT);
		welcome = welcome.getScaledInstance((int)(840*Admin.proportion), (int) (477*Admin.proportion), Image.SCALE_DEFAULT);
	}
}
