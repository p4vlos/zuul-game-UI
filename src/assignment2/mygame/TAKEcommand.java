
package assignment2.mygame;

import assignment2.Game;
import assignment2.Player;
import assignment2.command.Command;

/**
 * Command to take something from the room
 * @author rej
 */
public class TAKEcommand extends Command {
    
    public TAKEcommand(String firstWord, String secondWord, String thirdWord) {
        super(firstWord, secondWord, thirdWord);
    }
    
    public TAKEcommand() {}
    
    @Override
    public boolean execute(Player player) {
        if (!hasSecondWord()) {
            // if there is no second word, we don't know what to take...
            Game.out.println(Game.messages.getString("takeWhat"));
            return false;
        }
        String desc = getSecondWord();
        player.take(desc);
        return false;
    }
}
