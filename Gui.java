package sample;

import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Optional;

import static sample.Front.confirm;
import static sample.Judgement.*;

class Gui{
	private Judgement judge;
	private int temp=0,temp1=0;
	private int withdraw=0;

	static Label tips;
	Label l;
	Alert al;
	Alert blackWin;
	Alert whiteWin;
	Alert draw;
	Alert exit;
	StackPane sp;
	static Pane p;
	static BorderPane bp;
	HBox hb;
	HBox bottom;
	MenuBar menuBar;
	Menu menuGame;
	Menu menuHelp;
	MenuItem about;
	MenuItem menuExit;
	MenuItem menuNew;
	MenuItem menuHowto;
	MenuItem menuBack;

	public Gui(){
		judge = new Judgement();
		l = new Label();
		tips = new Label("Ready");
		al = new Alert(AlertType.CONFIRMATION);
		blackWin = new Alert(AlertType.INFORMATION);
		whiteWin = new Alert(AlertType.INFORMATION);
		draw = new Alert(AlertType.INFORMATION);
		exit = new Alert(AlertType.CONFIRMATION);
		sp = new StackPane();
		p = new Pane();
		bp = new BorderPane();
		hb = new HBox();
		bottom = new HBox(tips);
		menuBar = new MenuBar();
		menuGame = new Menu("Game");
		menuHelp = new Menu("Help");
		about = new MenuItem("About..");
		menuExit = new MenuItem("Exit");
		menuNew = new MenuItem("New Game");
		menuHowto = new MenuItem("How to play");
		menuBack = new MenuItem("Withdraw");

		menuGame.getItems().addAll(menuNew,menuBack,menuExit);
		menuHelp.getItems().addAll(menuHowto,about);
		menuBar.getMenus().addAll(menuGame,menuHelp);
		menuBar.setPrefWidth(600);

		Image img = new Image("image/777.jpg");
		sp.getChildren().add(new ImageView(img));
		sp.setAlignment(Pos.CENTER);
		sp.getChildren().addAll(l,p);
		hb.getChildren().addAll(menuBar);
		bp.setTop(hb);
		bp.setCenter(sp);
		bp.setBottom(bottom);
		bottom.setAlignment(Pos.CENTER);


		sp.setOnMouseMoved(e -> {
			getIsTurn();
		});


		sp.setOnMouseClicked(e->{
			withdraw=0;
			/*计算坐标与数组对应，距离绝对值比较*/
			double x = e.getSceneX();
			double y = e.getSceneY();
			double z, t = 999, res1 = 0, res2 = 0;
			for(int i = 0; i < 19; i++){
				z = Math.abs((judge.getI(i) - x));
				if(z < t){
					t = z;
					temp = i;
				}
			}

			t=999;		//复原

			for(int j=0;j<19;j++){
				z = Math.abs((judge.getJ(j)-y));
				if(z<t){
					t=z;
					temp1=j;
				}
			}

			/*坐标微调,判断是否有子*/
			res1 = judge.getI(temp);
			res2 = judge.getJ(temp1) - 27.5;

			if(!isDone(temp, temp1) && judge.Win(temp,temp1) == 0){
				if(temp >= 0 && temp <= 6){
					res1 = judge.getI(temp) - 3;
				}
				if(temp >= 6 && temp <= 8){
					res1 = judge.getI(temp) - 2;
				}
				if(temp1 >= 0 && temp1 <= 10){
					res2 = judge.getJ(temp1) - 30.5;
				}

				Circle c = new Circle(res1,res2,10);

				/*变换颜色*/
				confirm(c, temp, temp1);

		/*===========================================*/

				if(judge.Win(temp,temp1)==1){
					blackWin.setTitle("黑棋赢了");
					blackWin.setContentText("恭喜,黑棋赢了！");
					blackWin.show();
					judge.isWin();
//					System.out.println("=====黑==" + judge.getNumber());
				}
				else if(judge.Win(temp,temp1)==2){
					whiteWin.setTitle("白棋赢了");
					whiteWin.setContentText("恭喜,白棋赢了！");
					whiteWin.show();
					judge.isWin();
//					System.out.println("=====白");
				}
				else if(judge.Win(temp,temp1)==3){
					draw.setTitle("平局");
					draw.setContentText("二人平局");
					draw.show();
//					System.out.println("=====满");
				}
			}

		});

		/*开始新游戏*/
		menuNew.setOnAction(e->{
			al.setTitle("New game");
			al.setContentText("If you click 'OK',the chessboard will be cleared.");
			al.setHeaderText("New Game?");
			Optional<ButtonType> res = al.showAndWait();

			if(res.get() == ButtonType.OK){
				for(int i =0;i < judge.getNumber();i++){
					p.getChildren().remove(0);
				}
				this.judge = new Judgement();
				withdraw=0;
			}
		});

		/*限制悔棋一步*/
		menuBack.setOnAction(e->{
			if(withdraw==1){
				tips.setText("只能悔棋一次");
			}
			else if(judge.getNumber()==0){}

			else if(withdraw==0){
				p.getChildren().remove(judge.getNumber()-1);
				judge.setBack(temp,temp1);
//				System.out.println(judge.getIsTurn());
				judge.setIsTurn(isTurn-1);
				withdraw+=1;
			}

		});

		menuExit.setOnAction(e->{
			exit.setTitle("Exit");
			exit.setContentText("If you click 'OK',the game will be closed.");
			exit.setHeaderText("Exit?");

			Optional<ButtonType> res = exit.showAndWait();
			if(res.get() == ButtonType.OK){
	//			primaryStage.close();
			}
		});

		about.setOnAction(e->{
			Label about = new Label();
			Stage About = new Stage();
			Scene s = new Scene(about,500,200);
			About.setScene(s);
			about.setText("本六子棋游戏为 Java程序设计实践 课程作业 Designed by zfz");
			about.setAlignment(Pos.CENTER);
			About.show();
		});

		menuHowto.setOnAction(e->{
			Label info = new Label();
			info.setPadding(new Insets(10,10,10,10));
			Stage About = new Stage();
			Scene s = new Scene(info,300,200);
			About.setScene(s);
			info.setWrapText(true);
			info.setText("黑子先手一子，后双方各下两子，先连成六子的一方胜,若棋盘满而无法分出胜负，判和。");
			info.setAlignment(Pos.CENTER);
			About.show();
		});
	}
}
