package CalChamps;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JButton;


public class BotonesChamps extends JPanel {

	private JButton btnAkali,btnAtrox,btnAhri,btnAlistar,btnAnivia,btnAmumu,btnAshe,btnAnnie,btnBlitzcrank;
	private JButton btnBrand,btnCaitlyn,btnCassiopea,btnChogath,btnCorki,btnDarius,btnDiana,btnDrmundo;
	private JButton btnDraven,btnElise,btnEvelynn,btnEzreal,btnFiddlesticks,btnFiora,btnFizz,btnGalio,btnGangplank;
	private JButton btnGaren,btnGragas,btnGraves,btnHercarim,btnIrelia,btnJanna,btnJarvan,btnJax,btnJayce,btnJinx,btnKarma;
	private JButton btnKarthus,btnKassadin,btnKatarina,btnKayle,btnKennen,btnKhazix,btnKogmaw,btnLeblanc,btnLeeSin,btnLeona;
	private JButton btnLissandra, btnLucian,btnLulu,btnLux,btnMalphite,btnMalhazar,btnMaokai,btnMasteryi,btnMissfortune;
	private JButton btnMordekaiser, btnMorgana, btnNami, btnNasus, btnNautilus, btnNidalee, btnNocturne, btnNunu, btnOlaf;
	private JButton btnOriana, btnPantheon, btnPoppy, btnQuinn, btnRammus, btnRenekton, btnRengar, btnRiven, btnRumble, btnRyze;
	private JButton btnSejuani, btnShaco, btnShen, btnShyvana, btnSinged, btnSion, btnSivir, btnSkarner, btnSona, btnSoraka;
	private JButton btnSwain, btnSyndra, btnTalon,btnTaric,btnTeemo,btnTresh,btnTristana,btnTrundle,btnTryndamere,btnTwistedFate;
	private JButton btnTwitch,btnUdyr,btnUrgot,btnVarus,btnVayne,btnVeigar,btnVelkoz,btnVi,btnViktor,btnVladimir,btnVolibear;
	private JButton btnWarwick,btnWukong, btnXerath,btnXinzhao,btnYasuo,btnYorick,btnZac,btnZed,btnZiggs,btnZilean,btnZyra;
	
	
	public BotonesChamps(){
		///////////             A
		btnAkali=new JButton("Akali");btnAhri=new JButton("Ahri");btnAlistar=new JButton("Alistar");
		btnAmumu=new JButton("Amumu");btnAnivia=new JButton("Anivia");
		btnAnnie=new JButton("Annie");btnAshe=new JButton("Ashe");btnAtrox=new JButton("Aatrox");
		///////////             B
		btnBlitzcrank=new JButton("Blitzcrank");btnBrand=new JButton("Brand");
		///////////             C
		btnCaitlyn=new JButton("Caitlyn");btnCassiopea=new JButton("Cassiopea");
		btnChogath=new JButton("ChoGath");btnCorki=new JButton("Corki");
		///////////             D
		btnDarius=new JButton("Darius");btnDiana=new JButton("Diana");
		btnDraven=new JButton("Draven");btnDrmundo=new JButton("DrMundo");
		///////////             E
		btnElise=new JButton("Elise");btnEvelynn=new JButton("Evelynn");btnEzreal=new JButton("Ezreal");
		///////////             F
		btnFiddlesticks=new JButton("Fiddlesticks");btnFiora=new JButton("Fiora");btnFizz=new JButton("Fizz");
		///////////             G
		btnGalio=new JButton("Galio");btnGangplank=new JButton("Gangplank");
		btnGaren=new JButton("Garen");btnGragas=new JButton("Gragas");btnGraves=new JButton("Graves");
		///////////             H
		btnHercarim=new JButton("Hercarim");
		////////////            I         
		btnIrelia=new JButton("Irelia");
		/////////////           J         
		btnJanna=new JButton("Janna");btnJarvan=new JButton("Jarvan");btnJax=new JButton("Jax");
		btnJayce=new JButton("Jayce");btnJinx=new JButton("Jinx");
		///////////             K
		btnKarma=new JButton("Karma");btnKarthus=new JButton("Khartus");btnKassadin=new JButton("Kassadin");
		btnKatarina=new JButton("Katarina");btnKayle=new JButton("Kayle");
		btnKennen=new JButton("Kennen");btnKhazix=new JButton("Khazix");btnKogmaw=new JButton("Kog'Maw");
		///////////             L
		btnLeblanc=new JButton("LeBlanc");btnLeeSin=new JButton("LeeSin");btnLeona=new JButton("Leona");
		btnLissandra=new JButton("Lissandra");btnLucian=new JButton("Lucian");
		btnLulu=new JButton("Lulu");btnLux=new JButton("Lux");
		///////////             M
		btnMalhazar=new JButton("Malhazar");btnMalphite=new JButton("Malphite");btnMaokai=new JButton("Maokai");
		btnMasteryi=new JButton("Master Yi");btnMissfortune=new JButton("Miss Fortune");
		btnMordekaiser=new JButton("Mordekaiser");btnMorgana=new JButton("Morgana");
		///////////             N
		btnNami=new JButton("Nami");btnNasus=new JButton("Nasus");btnNautilus=new JButton("Nautilus");
		btnNidalee=new JButton("Nidalee");btnNocturne=new JButton("Nocturne");btnNunu=new JButton("Nunu");
		///////////             O
		btnOlaf=new JButton("Olaf");btnOriana=new JButton("Orianna");
		///////////             P
		btnPantheon=new JButton("Pantheon");btnPoppy=new JButton("Poppy");
		///////////             Q
		btnQuinn=new JButton("Quinn");
		///////////             R
		btnRammus=new JButton("Rammus");btnRenekton=new JButton("Renekton");btnRengar=new JButton("Rengar");
		btnRiven=new JButton("Riven");btnRumble=new JButton("Rumble");btnRyze=new JButton("Ryze");
		///////////             S
		btnSejuani=new JButton("Sejuani");btnShaco=new JButton("Shaco");btnShen=new JButton("Shen");
		btnShyvana=new JButton("Shyvanna");btnSinged=new JButton("Singed");btnSion=new JButton("Sion");
		btnSivir=new JButton("Sivir");btnSona=new JButton("Sona");btnSoraka=new JButton("Soraka");
		btnSkarner=new JButton("Skarner");btnSwain=new JButton("Swain");btnSyndra=new JButton("Syndra");
		///////////             T
		btnTalon=new JButton("Talon");btnTaric=new JButton("Taric");btnTeemo=new JButton("Teemo");
		btnTresh=new JButton("Tresh");btnTristana=new JButton("Tristana");btnTrundle=new JButton("Trunle");
		btnTryndamere=new JButton("Tryndamere");btnTwistedFate=new JButton("Twisted Fate");
		btnTwitch=new JButton("Twitch");
		///////////             U
		btnUdyr=new JButton("Udyr");btnUrgot=new JButton("Urgot");
		///////////             V
		btnVarus=new JButton("Varus");btnVayne=new JButton("Vayne");btnVeigar=new JButton("Veigar");
		btnVelkoz=new JButton("Vel'koz");btnVi=new JButton("Vi");btnViktor=new JButton("Viktor");
		btnVladimir=new JButton("Vladimir");btnVolibear=new JButton("Volibear");
		///////////             W
		btnWarwick=new JButton("Warwick");btnWukong=new JButton("Wukong");
		///////////             X
		btnXerath=new JButton("Xerath");btnXinzhao=new JButton("XinZhao");
		///////////             Y
		btnYasuo=new JButton("Yasuo");btnYorick=new JButton("Yorick");
		///////////             Z
		btnZac=new JButton("Zac");btnZed=new JButton("Zed");btnZiggs=new JButton("Ziggs");
		btnZilean=new JButton("Zilean");btnZyra=new JButton("Zyra");
		
		setLayout(new GridLayout(18,18,5,5));

		add(btnAhri);add(btnAkali);add(btnAlistar);add(btnAmumu);add(btnAnivia);add(btnAnnie);add(btnAshe);add(btnAtrox);
		add(btnBlitzcrank);add(btnBrand);
		add(btnCaitlyn);add(btnCassiopea);add(btnChogath);add(btnCorki);
		add(btnDarius);add(btnDiana);add(btnDraven);add(btnDrmundo);
		add(btnElise);add(btnEvelynn);add(btnEzreal);
		add(btnFiddlesticks);add(btnFiora);add(btnFizz);
		add(btnGalio);add(btnGangplank);add(btnGaren);add(btnGragas);add(btnGraves);
		add(btnHercarim);
		add(btnIrelia);
		add(btnJanna);add(btnJarvan);add(btnJax);add(btnJayce);add(btnJinx);
		add(btnKarma);add(btnKarthus);add(btnKassadin);add(btnKatarina);add(btnKayle);add(btnKennen);add(btnKhazix);add(btnKogmaw);
		add(btnLeblanc);add(btnLeeSin);add(btnLeona);add(btnLissandra);add(btnLucian);add(btnLulu);add(btnLux);
		add(btnMalhazar);add(btnMalphite);add(btnMaokai);add(btnMasteryi);add(btnMissfortune);add(btnMordekaiser);add(btnMorgana);
		add(btnNami);add(btnNasus);add(btnNautilus);add(btnNidalee);add(btnNocturne);add(btnNunu);
		add(btnOlaf);add(btnOriana);
		add(btnPantheon);add(btnPoppy);
		add(btnQuinn);
		add(btnRammus);add(btnRenekton);add(btnRengar);add(btnRiven);add(btnRumble);add(btnRyze);
		add(btnSejuani);add(btnShaco);add(btnShen);add(btnShyvana);add(btnSinged);add(btnSion);add(btnSivir);add(btnSkarner);add(btnSona);add(btnSoraka);add(btnSwain);add(btnSyndra);
		add(btnTalon);add(btnTaric);add(btnTeemo);add(btnTresh);add(btnTristana);add(btnTrundle);add(btnTryndamere);add(btnTwistedFate);add(btnTwitch);
		add(btnUdyr);add(btnUrgot);
		add(btnVarus);add(btnVayne);add(btnVeigar);add(btnVelkoz);add(btnVi);add(btnViktor);add(btnVladimir);add(btnVolibear);
		add(btnWarwick);add(btnWukong);
		add(btnXerath);add(btnXinzhao);
		add(btnYasuo);add(btnYorick);
		add(btnZac);add(btnZed);add(btnZiggs);add(btnZilean);add(btnZyra);
	}
}
