package rnd.pattern.blackboard.framework;

/**
 * The AbstractKnowledgeSource implements {@link KnowledgeSource}
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 */

public abstract class AbstractKnowledgeSource implements KnowledgeSource {

     protected BlackBoardObject bbo;
     protected BlackBoard bb;

     public void run() {
          updateBlackBoardObject(process(bbo));
     }

     public void updateBlackBoardObject(BlackBoardObject bbo) {
          bb.addBlackBoardObject(bbo);
     }

}
