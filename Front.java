package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import static sample.Gui.*;

/**
 * Created by zfz on 16/10/25.
 */
class Front extends Judgement{
    public static void confirm(Circle c, int temp, int temp1){
        if(!isFirst()){
            if(isTurn == 0 || isTurn == 1){
                c.setFill(Color.BLACK);
                setBoard(temp,temp1);
            }
            else if(isTurn == 2 || isTurn == 3){
                c.setFill(Color.WHITE);
                setBoard(temp,temp1);
            }
        }
        else{
            c.setFill(Color.BLACK);
            setBoard(temp,temp1);
            isTurn = 2;
        }
        p.getChildren().addAll(c);
    }
}
