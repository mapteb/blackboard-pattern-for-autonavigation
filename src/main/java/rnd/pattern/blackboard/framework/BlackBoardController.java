package rnd.pattern.blackboard.framework;

/**
 * The BlackBoardController is an Observer that gets notified
 * whenever the BlackBoard receives a new BlackBoardObject
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 */
import java.util.List;
import java.util.Observer;
import java.util.concurrent.ExecutorService;

public interface BlackBoardController extends Observer {

     public void setKnowledgeSourceList(List<KnowledgeSource> ksList);

     public void enrollKnowledgeSource(KnowledgeSource ks, ExecutorService exsvc);

     public void execOutcome(BlackBoardObject bbo);

}
