package rnd.pattern.blackboard.framework;

/**
 * The BlackBoard notifies the BlackBoardController whenever it receives a BlackBoardObject
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public interface BlackBoard {

     public void addBlackBoardObject(BlackBoardObject bbo);

     public void notifyController(BlackBoardObject bbo);

}
