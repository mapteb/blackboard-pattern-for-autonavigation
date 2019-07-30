package rnd.pattern.blackboard.autonav.bb;

import rnd.pattern.blackboard.framework.AbstractBlackBoard;
import rnd.pattern.blackboard.framework.BlackBoardObject;

public class AutoNavBlackBoard extends AbstractBlackBoard { 

     public void addBlackBoardObject(BlackBoardObject bbo) {
    	 
          System.out.println("==>> Blackboard received BBO "+bbo.getClass().getName());

          super.addBlackBoardObject(bbo);
     }
}
