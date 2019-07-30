package rnd.pattern.blackboard.framework;

/**
 * The BlackBoard notifies the BlackBoardController whenever it receives a BlackBoardObject
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public interface KnowledgeSource extends Runnable {

     public boolean isInterested(BlackBoardObject bbo, BlackBoard bb);

     public BlackBoardObject process(BlackBoardObject bbo);

     public void updateBlackBoardObject(BlackBoardObject bbo);
}
