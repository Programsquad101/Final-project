import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	int[] validNumbers = new int[4];

    @FXML
    private Button btnVerify;

    @FXML
    private Button btnRefresh;

    @FXML
    private ImageView imgCard1;

    @FXML
    private ImageView imgCard2;

    @FXML
    private ImageView imgCard3;

    @FXML
    private ImageView imgCard4;


    @FXML
    void enter(ActionEvent event) {
    	cards();
    }
    
    public Controller(){
    }
    public void cards() {
		
		boolean[] randomCards = new boolean[52];

		// choose 4 random distinct cards from the deck
		int count = 0;
		
		
		while (count < 4) {// Display only four cards
			
			int card1 = (int) (Math.random() * 12) + 1;// Ignore zero
			int card2 = (int) (Math.random() * 12) + 1;// Ignore zero
			int card3 = (int) (Math.random() * 12) + 1;// Ignore zero
			int card4 = (int) (Math.random() * 12) + 1;// Ignore zero

			
			if ((randomCards[card1] = !randomCards[card2]) && (randomCards[card1] = !randomCards[card3]) && 
				(randomCards[card1] = !randomCards[card4]) && (randomCards[card2] = !randomCards[card3])&& 
				(randomCards[card2] = !randomCards[card4]) && (randomCards[card3] = !randomCards[card4])) 
			{
				
				String[] cards = { "clubs", "diamonds", "hearts", "spades" };
				
				String name1 = cards[(int) (Math.random() * cards.length)];
				String name2 = cards[(int) (Math.random() * cards.length)];
				String name3 = cards[(int) (Math.random() * cards.length)];
				String name4 = cards[(int) (Math.random() * cards.length)];

				
				randomCards[card1] = true;
				
				Image image1 = new Image("png/" + (card1+1) + "_of_" + name1 + ".png");
				Image image2 = new Image("png/" + (card2+1) + "_of_" + name2 + ".png");
				Image image3 = new Image("png/" + (card3+1) + "_of_" + name3 + ".png");
				Image image4 = new Image("png/" + (card4+1) + "_of_" + name4 + ".png");




				imgCard1.setImage(image1);
				imgCard2.setImage(image2);
				imgCard3.setImage(image3);
				imgCard4.setImage(image4);

				
				
				int value = card1 % 13;
				
				validNumbers[count] = (value == 0) ? 13 : value;
				count++;
				
			}
			

		}

	}

}
