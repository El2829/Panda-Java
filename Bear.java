import javax.swing.JApplet;
import java.awt.*;

public class Bear extends JApplet{
	public void paint(Graphics g2){
		Graphics2D g = (Graphics2D) g2;
    	g.setStroke(new BasicStroke(2));
    	Color A = new Color(113, 194, 238);
    	Color B = new Color(171, 205, 230);
    	Color C = new Color(212, 120, 237);
    	Color D = new Color(219, 175, 229);
    	Color E = new Color(227, 124, 5);
    	Color F = new Color(224, 173, 3);
		//Nose
		g.fillArc(357,245,53,42,335,225);
		g.fillArc(357,253,53,28,315,273);
		int[]a = {364,385,406};
		int[]b = {276,261,276};
		g.fillPolygon(a,b,3);
    	//Arms
    	g.fillArc(254,342,75,82,0,360);
    	g.fillArc(432,342,75,82,0,360);
    	g.fillArc(251,332,70,85,0,360);
    	g.fillArc(441,331,71,76,0,360);
    	g.fillArc(249,328,66,75,0,360);
    	g.fillArc(445,338,66,75,0,360);

    	//Mouth
    	g.drawLine(384,293,384,276);
		g.drawArc(344,279,41,23,180,163);
		g.drawArc(384,279,41,23,190,165);


		//Ears
		g.fillArc(168,35,96,108,0,360);
		g.fillArc(177,30,123,92,0,360);
		g.fillArc(522,38,80,103,0,360);
		g.fillArc(474,30,118,71,0,360);

		//Feet
		g.fillArc(209,412,94,99,0,360);
		g.fillArc(456,414,99,109,0,360);
		g.fillArc(206,420,87,97,0,360);
		g.fillArc(447,457,80,78,0,360);
		g.fillArc(238,459,72,75,0,360);
		g.fillArc(466,446,66,86,0,360);
		g.fillArc(216,432,118,100,90,180);
		g.fillArc(474,472,61,56,0,360);

		g.setColor(Color.WHITE);
		//paws
		g.fillArc(255,428,21,18,0,360);
		g.fillArc(484,428,21,18,0,360);
		g.fillArc(235,442,14,14,0,360);
		g.fillArc(512,442,14,14,0,360);
		g.fillArc(221,461,13,13,0,360);
		g.fillArc(527,461,13,13,0,360);
		g.fillArc(240,461,53,60,0,360);
		g.fillArc(247,477,55,46,0,360);
		g.fillArc(458,468,61,58,0,360);
		g.fillArc(467,463,53,55,0,360);

    	//Face
    	g.fillArc(206,43,360,228,0,180);
		g.fillArc(186,127,391,216,0,180);
		g.fillArc(182,100,149,211,0,180);
		g.fillArc(435,98,149,211,0,180);

		g.setColor(Color.BLACK);
		//Face
		g.drawArc(206,43,360,228,20,135);
		g.drawArc(186,127,391,216,350,-167);
		g.drawArc(182,100,149,211,135,68);
		g.drawArc(435,98,149,211,45,-73);

    	//Eyes
		g.fillArc(270,144,79,107,0,360);
		g.fillArc(238,158,106,119,0,360);
		g.fillArc(301,160,48,94,0,360);
		g.fillArc(250,151,98,109,0,360);
		g.fillArc(267,147,75,55,0,360);

		g.fillArc(420,144,73,88,0,360);
		g.fillArc(433,183,90,95,0,360);
		g.fillArc(429,194,59,71,0,360);
		g.fillArc(425,193,53,61,0,360);
		g.fillArc(422,190,45,51,0,360);
		g.fillArc(420,164,42,72,0,360);
		g.fillArc(429,148,61,89,0,360);
		g.fillArc(478,180,53,81,0,360);
		g.fillArc(461,168,65,75,0,360);
		g.fillArc(433,150,73,78,0,360);
		g.fillArc(463,156,46,76,0,360);
		g.fillArc(449,159,71,85,0,360);
		g.fillArc(435,148,70,98,0,360);
		g.fillArc(473,194,53,73,0,360);

		g.fillArc(270,144,79,107,0,360);
		g.fillArc(238,158,106,119,0,360);
		g.fillArc(301,160,48,94,0,360);
		g.fillArc(251,151,98,109,0,360);

		g.setColor(Color.WHITE);
    	g.fillArc(282,176,50,55,0,360);
    	g.fillArc(436,176,50,55,0,360);

    	g.setColor(Color.BLACK);
    	g.fillArc(289,185,36,36,0,360);
		g.fillArc(442,185,36,36,0,360);

    	g.setColor(Color.WHITE);
    	g.fillArc(295,190,17,17,0,360);
    	g.fillArc(448,190,17,17,0,360);

    	g.setColor(F);
		g.fillArc(336,361,14,14,0,360);
		g.fillArc(355,366,14,16,0,360);
		g.fillArc(374,358,13,18,0,360);
		g.fillArc(392,366,13,17,0,360);
		g.fillArc(411,360,14,15,0,360);

		int[]c={337,342,348};
		int[]d={363,350,363};
		g.fillPolygon(c,d,3);

		int[]e={356,361,367};
		int[]f={368,356,368};
		g.fillPolygon(e,f,3);

		int[]h={374,380,386};
		int[]i={363,349,363};
		g.fillPolygon(h,i,3);

		int[]j={393,398,403};
		int[]k={369,356,369};
		g.fillPolygon(j,k,3);

		int[]l={412,418,423};
		int[]m={363,350,363};
		g.fillPolygon(l,m,3);

		g.setColor(Color.BLACK);
		g.drawLine(337,363,342,350);
		g.drawLine(348,363,342,350);
		g.drawArc(336,361,14,14,30,-120);
		g.drawArc(336,361,14,14,160,90);

		g.drawLine(356,368,361,356);
		g.drawLine(367,368,361,356);
		g.drawArc(355,366,14,16,25,-120);
		g.drawArc(355,366,14,16,145,90);

		g.drawLine(374,363,380,349);
		g.drawLine(386,363,380,349);
		g.drawArc(374,358,13,18,30,-140);
		g.drawArc(374,358,13,18,160,120);

		g.drawLine(393,369,398,356);
		g.drawLine(403,369,398,356);
		g.drawArc(392,366,13,17,30,-120);
		g.drawArc(392,366,13,17,160,100);

		g.drawLine(412,363,418,350);
		g.drawLine(423,363,418,350);
		g.drawArc(411,360,14,15,30,-120);
		g.drawArc(411,360,14,15,160,100);

    	g.setColor(E);
    	g.fillArc(339,368,9,9,0,360);
    	g.fillArc(357,372,10,9,0,360);
    	g.fillArc(375,368,11,11,0,360);
    	g.fillArc(393,372,10,10,0,360);
    	g.fillArc(413,368,10,9,0,360);

    	g.setColor(A);
    	g.fillArc(290,450,180,74,0,360);
    	g.fillArc(292,457,177,78,0,360);
    	g.fillArc(292,478,175,6,0,360);
    	g.fillArc(293,477,175,63,0,360);
    	g.fillArc(294,504,171,39,0,360);
    	g.fillArc(292,484,53,53,0,360);
    	g.fillArc(288,454,46,44,0,360);
    	g.fillArc(414,509,51,28,0,360);
    	g.fillArc(294,509,51,28,0,360);
    	g.fillArc(407,444,65,64,0,360);

    	g.setColor(B);
		g.fillArc(289,451,181,23,0,360);
		g.fillArc(288,442,30,44,0,360);
		g.fillArc(294,421,170,54,0,360);
		g.fillArc(384,462,28,28,0,360);
		g.fillArc(414,456,30,34,0,360);
		g.fillArc(320,447,28,43,0,360);
		g.fillArc(350,455,34,35,0,360);
		g.fillArc(446,447,26,42,0,360);
		g.fillArc(289,458,184,18,0,360);
		g.fillArc(309,466,11,13,0,360);

    	g.setColor(C);
    	g.fillArc(317,391,125,61,0,360);
    	g.fillArc(317,414,126,37,0,360);
    	g.fillArc(317,425,20,17,0,360);
    	g.fillArc(318,419,20,17,0,360);
    	g.fillArc(317,410,20,17,0,360);

    	g.setColor(D);
    	g.fillArc(348,379,34,53,0,360);
    	g.fillArc(318,390,27,40,0,360);
    	g.fillArc(380,381,31,50,0,360);
    	g.fillArc(410,385,29,45,0,360);
    	g.fillArc(418,396,22,26,0,360);
    	g.fillArc(330,390,21,30,0,360);
    	g.fillArc(321,377,116,41,0,360);

    	g.setColor(Color.BLACK);
    	//Candle Body
    	g.fillRect(339,373,9,21);
    	g.fillRect(357,376,9,21);
    	g.fillRect(376,373,9,21);
    	g.fillRect(394,376,9,21);
    	g.fillRect(414,373,9,21);

    	//Top
    	g.drawLine(317,405,317,438);
    	g.drawLine(441,405,441,438);
    	g.drawLine(345,379,414,379);
    	g.drawLine(343,419,347,415);
    	g.drawArc(312,407,135,44,335,-134);
    	g.drawArc(317,373,124,65,0,55);
    	g.drawArc(317,373,124,65,180,-55);
    	g.drawArc(348,379,34,53,334,-128);
    	g.drawArc(318,390,27,40,325,-130);
    	g.drawArc(380,381,31,50,335,-130);
    	g.drawArc(410,385,29,45,350,-150);

    	//Bottom
    	g.drawLine(288,471,295,528);
    	g.drawLine(471,471,464,528);
    	g.drawLine(318,475,312,481);
    	g.drawLine(326,485,318,475);
    	g.drawLine(342,485,348,476);
    	g.drawArc(288,501,182,42,337,-136);
    	g.drawArc(289,453,26,34,191,122);
    	g.drawArc(325,475,18,16,206,122);
    	g.drawArc(287,427,83,86,179,-70);
    	g.drawArc(388,427,83,86,0,70);
    	g.drawArc(350,455,34,35,340,-144);
		g.drawArc(384,462,28,28,5,-185);
		g.drawArc(414,456,30,34,365,-185);
		g.drawArc(446,447,26,42,315,-130);
	}
}