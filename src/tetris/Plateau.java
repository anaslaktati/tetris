package tetris;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.time.Clock;
import javax.swing.JLabel;

public class Plateau  extends JFrame{        
    
       
	private Cellule cellule;
	private Clock clock;
        private float temps;
        private boolean isPaused;
        private JLabel status;
	
	//private SidePanel side;
	
    
    
    public Plateau()
    {
        
        //propriete de la fenetre
        super("Tetris");
        setLayout(new BorderLayout());
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
        
        this.status = new JLabel("0");
        this.cellule = new Cellule(this);

        add(cellule, BorderLayout.CENTER);
        add(status, BorderLayout.SOUTH);
        
        addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
//								
//				switch(e.getKeyCode()) {
//				
//				/*
//				 * Drop - When pressed, we check to see that the game is not
//				 * paused and that there is no drop cooldown, then set the
//				 * logic timer to run at a speed of 25 cycles per second.
//				 */
//				case KeyEvent.VK_S:
//					if(!isPaused && dropCooldown == 0) {
//						logicTimer.setCyclesPerSecond(25.0f);
//					}
//					break;
//					
//				/*
//				 * Move Left - When pressed, we check to see that the game is
//				 * not paused and that the position to the left of the current
//				 * position is valid. If so, we decrement the current column by 1.
//				 */
//				case KeyEvent.VK_A:
//					if(!isPaused && board.isValidAndEmpty(currentType, currentCol - 1, currentRow, currentRotation)) {
//						currentCol--;
//					}
//					break;
//					
//				/*
//				 * Move Right - When pressed, we check to see that the game is
//				 * not paused and that the position to the right of the current
//				 * position is valid. If so, we increment the current column by 1.
//				 */
//				case KeyEvent.VK_D:
//					if(!isPaused && board.isValidAndEmpty(currentType, currentCol + 1, currentRow, currentRotation)) {
//						currentCol++;
//					}
//					break;
//					
//				/*
//				 * Rotate Anticlockwise - When pressed, check to see that the game is not paused
//				 * and then attempt to rotate the piece anticlockwise. Because of the size and
//				 * complexity of the rotation code, as well as it's similarity to clockwise
//				 * rotation, the code for rotating the piece is handled in another method.
//				 */
//				case KeyEvent.VK_Q:
//					if(!isPaused) {
//						rotatePiece((currentRotation == 0) ? 3 : currentRotation - 1);
//					}
//					break;
//				
//				/*
//			     * Rotate Clockwise - When pressed, check to see that the game is not paused
//				 * and then attempt to rotate the piece clockwise. Because of the size and
//				 * complexity of the rotation code, as well as it's similarity to anticlockwise
//				 * rotation, the code for rotating the piece is handled in another method.
//				 */
//				case KeyEvent.VK_E:
//					if(!isPaused) {
//						rotatePiece((currentRotation == 3) ? 0 : currentRotation + 1);
//					}
//					break;
//					
//				/*
//				 * Pause Game - When pressed, check to see that we're currently playing a game.
//				 * If so, toggle the pause variable and update the logic timer to reflect this
//				 * change, otherwise the game will execute a huge number of updates and essentially
//				 * cause an instant game over when we unpause if we stay paused for more than a
//				 * minute or so.
//				 */
//				case KeyEvent.VK_P:
//					if(!isGameOver && !isNewGame) {
//						isPaused = !isPaused;
//						logicTimer.setPaused(isPaused);
//					}
//					break;
//				
//				/*
//				 * Start Game - When pressed, check to see that we're in either a game over or new
//				 * game state. If so, reset the game.
//				 */
//				case KeyEvent.VK_ENTER:
//					if(isGameOver || isNewGame) {
//						resetGame();
//					}
//					break;
//				
//				}
			}
                      
                      @Override
			public void keyReleased(KeyEvent e) {
				
				switch(e.getKeyCode()) {
				
				/*
				 * Drop - When released, we set the speed of the logic timer
				 * back to whatever the current game speed is and clear out
				 * any cycles that might still be elapsed.
				 */
				case KeyEvent.VK_S:
//					clock.setCyclesPerSecond(temps);
//					clock.reset();
					break;
				}
				
			}
			
		});
        
        
        pack();
	setLocationRelativeTo(null);
	setVisible(true);
    }
    
//    public bool accepter()
//    {
//        
//    }
    
    public void retirer()
    {
        
    }
    
    public void ajouter()
    {
        
    }
    
    private static final int screenSize = 500;
    private static final int mouvement = 25;
    
    public JLabel getStatus(){
        return this.status;
    }
    
    
    public int getScreenSize()
    {
        return this.screenSize;
    }

    public int getMouvement()
    {
        return this.mouvement;
    }

    
    public static void main(String[] args) {
        Plateau game = new Plateau();
        
        
        
        
    }
    
}
