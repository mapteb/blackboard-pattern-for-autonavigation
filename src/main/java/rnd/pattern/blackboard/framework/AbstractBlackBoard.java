package rnd.pattern.blackboard.framework;

import java.util.Observable;

/**
 * The AbstractBlackBoard is an implementation of {@link BlackBoard}
 * It extends JDK's Observable class so it can notify the {@link BlackBoardController}
 * whenever it receives a BlackBoardObject
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public abstract class AbstractBlackBoard extends Observable implements BlackBoard {
     public void addBlackBoardObject(BlackBoardObject bbo) {

          setChanged();

          notifyController(bbo);
     }

     public void notifyController(BlackBoardObject bbo) {
          notifyObservers(bbo);
     }
}
