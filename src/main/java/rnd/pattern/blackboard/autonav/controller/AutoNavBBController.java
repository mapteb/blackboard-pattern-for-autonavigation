package rnd.pattern.blackboard.autonav.controller;

import rnd.pattern.blackboard.framework.AbstractBlackBoardController;
import rnd.pattern.blackboard.framework.BlackBoardObject;

/**
 * This blackboard controller gets notified when one or
 * more blackboard objects are added to the blackboard
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 * 
 */
public class AutoNavBBController extends AbstractBlackBoardController {

     public void execOutcome(BlackBoardObject bbo) {
          // TODO Auto-generated method stub
          System.out.println("==>> Operating brake pedal");
     }
}
