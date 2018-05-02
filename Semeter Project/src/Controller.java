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
    private ImageView imgCards;

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
			
			int card = (int) (Math.random() * 4) + 1;// Ignore zero
			
			if (randomCards[card] = !randomCards[card]) 
			{
				
				String[] cards = { "clubs", "diamonds", "hearts", "spades" };
				
				String name = cards[(int) (Math.random() * cards.length)];
				
				randomCards[card] = true;
				
				Image image = new Image("png/" + card + "_of_" + name + ".png");
				imgCards.setImage(image);
				
				System.out.println(++card);//testing
				
				int value = card % 13;
				
				validNumbers[count] = (value == 0) ? 13 : value;
				count++;
				
			}
			

		}

	}

}
