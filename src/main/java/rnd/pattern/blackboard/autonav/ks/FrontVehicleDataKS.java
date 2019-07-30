package rnd.pattern.blackboard.autonav.ks;

import rnd.pattern.blackboard.autonav.bbo.DeltaSpeedDataBBO;
import rnd.pattern.blackboard.autonav.bbo.FrontVehicleDataBBO;
import rnd.pattern.blackboard.framework.AbstractKnowledgeSource;
import rnd.pattern.blackboard.framework.BlackBoard;
import rnd.pattern.blackboard.framework.BlackBoardObject;

/**
 * The FrontVehicleDataKS is an implementation of {@link AbstractKnowledgeSource}
 * This knowledge source operates on blackboard objects of the type FrontVehicleDataBBO
 * It transforms the FrontVehicleDataBBO into a DeltaSpeedDataBBO and adds it to the blackboard.
 * 
 * The process method in this class is just printing a message for now
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public class FrontVehicleDataKS extends AbstractKnowledgeSource {

     public boolean isInterested(BlackBoardObject bbo, BlackBoard bb) {

          if (bbo instanceof FrontVehicleDataBBO) {
               this.bbo = (FrontVehicleDataBBO) bbo;
               this.bb = bb;

               return true;
          }

          return false;
     }

     /**
      * Processes a FrontVehicleDataBBO and returns a transformed DeltaSpeedDataBBO
      */
     public BlackBoardObject process(BlackBoardObject bbo) {
          BlackBoardObject deltaSpeedDataBBO = new DeltaSpeedDataBBO();

          
          try {
        	  //pretend the KS is working
               Thread.sleep(1000);
          } catch (InterruptedException iex) {
               //
          }
          
          System.out.println("==>> FrontVehicleDataKS processed FrontVehicleDataBBO");
          return deltaSpeedDataBBO;

     }





}