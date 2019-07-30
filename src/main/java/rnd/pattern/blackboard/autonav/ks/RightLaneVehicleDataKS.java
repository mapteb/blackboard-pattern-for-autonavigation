package rnd.pattern.blackboard.autonav.ks;

import rnd.pattern.blackboard.autonav.bbo.DeltaSpeedDataBBO;
import rnd.pattern.blackboard.autonav.bbo.RightLaneVehicleDataBBO;
import rnd.pattern.blackboard.framework.AbstractKnowledgeSource;
import rnd.pattern.blackboard.framework.BlackBoard;
import rnd.pattern.blackboard.framework.BlackBoardObject;

/**
 * The RightLaneVehicleDataKS is an implementation of {@link AbstractKnowledgeSource}
 * This knowledge source operates on blackboard objects of the type RightLaneVehicleDataBBO
 * It transforms the RightLaneVehicleDataBBO into a DeltaSpeedDataBBO and adds it to the blackboard.
 * 
 * The process method in this class is just printing a message for now
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public class RightLaneVehicleDataKS extends AbstractKnowledgeSource {

     public boolean isInterested(BlackBoardObject bbo, BlackBoard bb) {
          // System.out.println("==>> query RightLaneVehicleDataKS");
          // TODO Auto-generated method stub
          if (bbo instanceof RightLaneVehicleDataBBO) {
               this.bbo = (RightLaneVehicleDataBBO) bbo;
               this.bb = bb;
               // System.out.println("==>> RightLaneVehicleDataKS is interested");

               return true;
          }

          return false;
     }

     public BlackBoardObject process(BlackBoardObject bbo) {
          BlackBoardObject deltaSpeedBBO = new DeltaSpeedDataBBO();
          // TODO: calculate the DeltaSpeed for the RightLaneVehicleData
          
          try {
               Thread.sleep(1200);

          } catch (InterruptedException iex) {
               //
          }
          System.out.println("==>> RightLaneVehicleDataKS processed RightLaneVehicleDataBBO");

          return deltaSpeedBBO;
     }
}
