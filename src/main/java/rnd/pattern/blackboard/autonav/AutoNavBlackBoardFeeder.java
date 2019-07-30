package rnd.pattern.blackboard.autonav;

import java.util.ArrayList;
import java.util.List;

import rnd.pattern.blackboard.autonav.bb.AutoNavBlackBoard;
import rnd.pattern.blackboard.autonav.bbo.FrontVehicleDataBBO;
import rnd.pattern.blackboard.autonav.bbo.RightLaneVehicleDataBBO;
import rnd.pattern.blackboard.autonav.controller.AutoNavBBController;
import rnd.pattern.blackboard.autonav.ks.DeltaSpeedDataKS;
import rnd.pattern.blackboard.autonav.ks.FrontVehicleDataKS;
import rnd.pattern.blackboard.autonav.ks.RightLaneVehicleDataKS;
import rnd.pattern.blackboard.framework.KnowledgeSource;

/**
 * The AutoNavBlackBoardFeeder is the external driver of the blackboard system
 * The AutoNavBlackBoardFeeder initializes the blackboard system
 * by performing the following tasks:
 * 1. Add knowledge sources to the controller
 * 2. Register controller with the blackboard
 * 3. Add blackboard objects to the blackboard
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public class AutoNavBlackBoardFeeder {

     private final AutoNavBlackBoard bb = new AutoNavBlackBoard();
     private final AutoNavBBController controller = new AutoNavBBController();

     /**
      * @param args
      */
     public static void main(String[] args) { 
          
          AutoNavBlackBoardFeeder feeder = new AutoNavBlackBoardFeeder();

          feeder.addKnowledgeSources();
          feeder.addController();
          feeder.addBlackBoardObjects();

     }


     /**
      * Add sensor data to the blackboard
      */
     public void addBlackBoardObjects() {
    	 
          int i = 0;
          while (i < 2) {
               bb.addBlackBoardObject(new FrontVehicleDataBBO());
               bb.addBlackBoardObject(new RightLaneVehicleDataBBO());
               try {
                    Thread.sleep(1000);
               } catch (InterruptedException iex) {
                    //
               }
               i++;
          }

     }

     
     public void addController() {

          bb.addObserver(controller);
     }

     
     public void addKnowledgeSources() {

          List<KnowledgeSource> ksList = new ArrayList<KnowledgeSource>();
          ksList.add(new RightLaneVehicleDataKS());
          ksList.add(new FrontVehicleDataKS());
          ksList.add(new DeltaSpeedDataKS());     
          controller.setKnowledgeSourceList(ksList);
     }


}
