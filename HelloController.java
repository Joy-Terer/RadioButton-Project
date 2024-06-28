package com.example.demojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;



import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.util.Objects;

public class HelloController {
    @FXML
    private  CheckBox cat_picture;
    @FXML
    private CheckBox dog_picture;
    @FXML
    private ImageView catimageview;
    @FXML
    private ImageView dogimageview;
    @FXML
    private CheckBox rabbit_picture;
    @FXML
    private ImageView rabbitimageview;
    @FXML
    private CheckBox pig_check;
    @FXML
    private ImageView pigimageview;
    @FXML
    private CheckBox bird_check;
    @FXML
    private ImageView birdimageview;

    @FXML
    public void initialize(){
        Image catimage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/cat.png")));
        Image dogimage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/dog.png")));
        Image rabbitimage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/rabbit.png")));
        Image pigimage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/pig.png")));
        Image birdimage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/bird.png")));

        catimageview.setImage(catimage);
        dogimageview.setImage(dogimage);
        rabbitimageview.setImage(rabbitimage);
        pigimageview.setImage(pigimage);
        birdimageview.setImage(birdimage);

    }

    @FXML
    private void showcatpicture() {
        catimageview.setVisible(cat_picture.isSelected());
      }

    @FXML
    private void showdogpicture(){
        dogimageview.setVisible(dog_picture.isSelected());
    }

    @FXML
    private void showrabbitpicture(){
        rabbitimageview.setVisible(rabbit_picture.isSelected());
    }

    @FXML
    private void showpigpicture(){
        pigimageview.setVisible(pig_check.isSelected());
    }
    @FXML
    private void showbirdpicture(){
        birdimageview.setVisible(bird_check.isSelected());
    }

}
