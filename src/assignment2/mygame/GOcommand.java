
package assignment2.mygame;

import assignment2.Game;
import assignment2.Player;
import assignment2.command.Command;

/**
 * Command to go somewhere
 * @author rej
 */
public class GOcommand extends Command {
    
    public GOcommand(String firstWord, String secondWord, String thirdWord) {
        super(firstWord, secondWord, thirdWord);
    }
    
    public GOcommand() {}
    
    @Override
    public boolean execute(Player player) {
        if (!hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            Game.out.println(Game.messages.getString("goWhere"));
            return false;
        }

        String direction = getSecondWord();
        player.goRoom(direction);
        return false;
    }
}
