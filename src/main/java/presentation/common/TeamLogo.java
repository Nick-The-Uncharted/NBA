package presentation.common;

import java.awt.Dimension;

import javax.swing.JPanel;


public class TeamLogo extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 MySVG ATL = new MySVG("ATL");
	 MySVG BKN = new MySVG("BKN");
	 MySVG BOS = new MySVG("BOS");
	 MySVG CHA = new MySVG("CHA");
	 MySVG CHI = new MySVG("CHI");
	 MySVG CLE = new MySVG("CLE");
	 MySVG DAL = new MySVG("DAL");
	 MySVG DEN = new MySVG("DEN");
	 MySVG DET = new MySVG("DET");
	 MySVG GSW = new MySVG("GSW");
	 MySVG HOU = new MySVG("HOU");
	 MySVG IND = new MySVG("IND");
	 MySVG LAC = new MySVG("LAC");
	 MySVG LAL = new MySVG("LAL");
	 MySVG MEM = new MySVG("MEM");
	 MySVG MIA = new MySVG("MIA");
	 MySVG MIL = new MySVG("MIL");
	 MySVG MIN = new MySVG("MIN");
	 MySVG NOP = new MySVG("NOP");
	 MySVG NYK = new MySVG("NYK");
	 MySVG OKC = new MySVG("OKC");
	 MySVG ORL = new MySVG("ORL");
	 MySVG PHI = new MySVG("PHI");
	 MySVG PHX = new MySVG("PHX");
	 MySVG POR = new MySVG("POR");
	 MySVG SAC = new MySVG("SAC");
	 MySVG SAS = new MySVG("SAS");
	 MySVG TOR = new MySVG("TOR");
	 MySVG UTA = new MySVG("UTA");
	 MySVG WAS = new MySVG("WAS");
	 
	 public TeamLogo() {
		 setLayout(null);
		 setOpaque(false);
		 setBackground(null);
		 setPreferredSize(new Dimension(400,600));
		 setCentral();
		 setAtlantic();
		 setSouthEast();
		 setNorthWest();
		 setSouthWest();
		 setPacific();
	 }
	 
	 private void setCentral(){
		 CHI.setLocation(15, 0);
		 MyLabel chiLabel = new MyLabel("Bulls", new Dimension(120,20), 5, 90);
		 CLE.setLocation(15, 120);
		 MyLabel cleLabel = new MyLabel("Cavaliers", new Dimension(120,20), 5, 210);
		 DET.setLocation(15, 240);
		 MyLabel detLabel = new MyLabel("Pistons", new Dimension(120,20), 5, 330);
		 IND.setLocation(15, 360);
		 MyLabel indLabel = new MyLabel("Pacers", new Dimension(120,20), 5, 450);
		 MIL.setLocation(15, 480);
		 MyLabel milLabel = new MyLabel("Bucks", new Dimension(120,20), 5, 570);
		 add(CHI);
		 add(CLE);
		 add(DET);
		 add(IND);
		 add(MIL);
		 add(milLabel);
		 add(indLabel);
		 add(detLabel);
		 add(cleLabel);
		 add(chiLabel);
	 }
	 
	 private void setAtlantic(){
		 BKN.setLocation(153, 0);
		 MyLabel bknLabel = new MyLabel("Nets", new Dimension(120,20), 143, 90);
		 NYK.setLocation(153, 120);
		 MyLabel nykLabel = new MyLabel("Knicks", new Dimension(120,20), 143, 210);
		 PHI.setLocation(153, 240);
		 MyLabel phiLabel = new MyLabel("76ers", new Dimension(120,20), 143, 330);
		 TOR.setLocation(153, 360);
		 MyLabel torLabel = new MyLabel("Raptors", new Dimension(120,20), 143, 450);
		 BOS.setLocation(153, 480);
		 MyLabel bosLabel = new MyLabel("Celtics", new Dimension(120,20), 143, 570);
		 add(BKN);
		 add(NYK);
		 add(PHI);
		 add(TOR);
		 add(BOS);
		 add(bosLabel);
		 add(torLabel);
		 add(phiLabel);
		 add(nykLabel);
		 add(bknLabel);
	 }
	 
	 private void setSouthEast(){
		 ATL.setLocation(290, 0);
		 MyLabel atlLabel = new MyLabel("Hawks", new Dimension(120,20), 290, 90);
		 CHA.setLocation(290, 120);
		 MyLabel chaLabel = new MyLabel("Hornets", new Dimension(120,20), 290, 210);
		 MIA.setLocation(290, 240);
		 MyLabel miaLabel = new MyLabel("Heat", new Dimension(120,20), 290, 330);
		 ORL.setLocation(290, 360);
		 MyLabel orlLabel = new MyLabel("Magic", new Dimension(120,20), 290, 450);
		 WAS.setLocation(290, 480);
		 MyLabel wasLabel = new MyLabel("Wizards", new Dimension(120,20), 290, 570);
		 add(ATL);
		 add(atlLabel);
		 add(CHA);
		 add(chaLabel);
		 add(MIA);
		 add(miaLabel);
		 add(ORL);
		 add(orlLabel);
		 add(WAS);
		 add(wasLabel);
	 }
	 
	 private void setNorthWest(){
		 DEN.setLocation(428, 0);
		 MyLabel denLabel = new MyLabel("Nuggets", new Dimension(120,20), 418, 90);
		 MIN.setLocation(428, 120);
		 MyLabel minLabel = new MyLabel("Timberwolves", new Dimension(120,20), 418, 210);
		 OKC.setLocation(428, 240);
		 MyLabel okcLabel = new MyLabel("Thunder", new Dimension(120,20), 418, 330);
		 POR.setLocation(428, 360);
		 MyLabel porLabel = new MyLabel("Trail Blazers", new Dimension(120,20), 418, 450);
		 UTA.setLocation(428, 480);
		 MyLabel utaLabel = new MyLabel("Jazz", new Dimension(120,20), 418, 570);
		 add(DEN);
		 add(MIN);
		 add(OKC);
		 add(POR);
		 add(UTA);
		 add(utaLabel);
		 add(porLabel);
		 add(okcLabel);
		 add(minLabel);
		 add(denLabel);
	 }
	 
	 private void setSouthWest(){
		 DAL.setLocation(702, 0);
		 MyLabel dalLabel = new MyLabel("Mavericks", new Dimension(120,20), 692, 90);
		 HOU.setLocation(702, 120);
		 MyLabel houLabel = new MyLabel("Rockets", new Dimension(120,20), 692, 210);
		 MEM.setLocation(702, 240);
		 MyLabel memLabel = new MyLabel("Grizzlies", new Dimension(120,20), 692, 330);
		 NOP.setLocation(702, 360);
		 MyLabel nopLabel = new MyLabel("Pelicans", new Dimension(120,20), 692, 450);
		 SAS.setLocation(702, 480);
		 MyLabel sasLabel = new MyLabel("Spurs", new Dimension(120,20), 692, 570);
		 add(DAL);
		 add(HOU);
		 add(MEM);
		 add(NOP);
		 add(SAS);
		 add(sasLabel);
		 add(nopLabel);
		 add(memLabel);
		 add(houLabel);
		 add(dalLabel);
	 }
	 
	 private void setPacific(){
		 GSW.setLocation(564, 0);
		 MyLabel gswLabel = new MyLabel("Warriors", new Dimension(120,20), 564, 90);
		 LAC.setLocation(564, 120);
		 MyLabel lacLabel = new MyLabel("Clippers", new Dimension(120,20), 564, 210);
		 LAL.setLocation(564, 240);
		 MyLabel lalLabel = new MyLabel("Lakers", new Dimension(120,20), 564, 330);
		 PHX.setLocation(564, 360);
		 MyLabel phxLabel = new MyLabel("Suns", new Dimension(120,20), 564, 450);
		 SAC.setLocation(564, 480);
		 MyLabel sacLabel = new MyLabel("Kings", new Dimension(120,20), 564, 570);
		 add(GSW);
		 add(LAC);
		 add(LAL);
		 add(PHX);
		 add(SAC);
		 add(sacLabel);
		 add(phxLabel);
		 add(lalLabel);
		 add(lacLabel);
		 add(gswLabel);
	 }
}
