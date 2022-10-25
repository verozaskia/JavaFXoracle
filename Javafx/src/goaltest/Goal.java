/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package goaltest;

import static goaltest.GoalTest.root;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;

public class Goal {
    private final Image dukeImage;
    private final ImageView dukeImageView;
    private final Image gloveImage;
    private final ImageView gloveImageView;
    private final AudioClip tone;
    
    public Goal(double x, double y){
        
        tone = new AudioClip(getClass().getResource("Audio/Note5.wav").toString());
        
        dukeImage = new Image(getClass().getResource("Images/Duke.png").toString());
        dukeImageView =  new ImageView(dukeImage);
        gloveImage = new Image(getClass().getResource("Images/Glove.png").toString());
        gloveImageView =  new ImageView(gloveImage);
        gloveImageView.setPreserveRatio(true);
        gloveImageView.setFitWidth(30);
                
        dukeImageView.setX(x);
        dukeImageView.setY(y);
        gloveImageView.setX(x+18);
        gloveImageView.setY(y);
        
        root.getChildren().addAll(dukeImageView, gloveImageView);
        
        interactions();
    }
    
    
    private void interactions(){

        dukeImageView.setOnMousePressed((MouseEvent me) -> {
            tone.play();
        });
        
        dukeImageView.setOnMouseDragged((MouseEvent me) -> {    
            dukeImageView.setX(me.getSceneX());
            dukeImageView.setY(me.getSceneY());
            gloveImageView.setX(me.getSceneX()+18);
            gloveImageView.setY(me.getSceneY());
            System.out.println(me.getSceneX() +", " +me.getSceneY());
        });
    }
}