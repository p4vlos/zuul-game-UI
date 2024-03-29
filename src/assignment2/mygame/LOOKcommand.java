
package assignment2.mygame;

import assignment2.Game;
import assignment2.Player;
import assignment2.command.Command;

/**
 * Command to look
 * @author rej
 */
public class LOOKcommand extends Command {
    
    public LOOKcommand(String firstWord, String secondWord, String thirdWord) {
        super(firstWord, secondWord, thirdWord);
    }
    
    public LOOKcommand() {}
    
    @Override
    public boolean execute(Player player) {
        if (hasSecondWord()) {
            // if there is a second word, we don't know what to look at...
            Game.out.println(Game.messages.getString("lookWhat"));
            return false;
        }
        player.look();
        return false;
    }
}
