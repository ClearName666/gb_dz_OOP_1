import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Market 
 */
public class Market implements QueueBehaviour, MarketBehaviour {
    
    private Deque<String> queue = new ArrayDeque<>();
    @Override
    public void addInQueue(Object obj) {
        String str = (String)obj;
        queue.addFirst(str);
        
    }

    @Override
    public void removeInQueue() {
        System.out.println("удалание из очереди: " + queue.pollLast());
    }

    @Override
    public boolean isEmptyQueue() {
        if (queue.isEmpty())
            return true;
        return false;
    }

    @Override
    public void addPeople(Object obj) {
        this.addInQueue(obj);
        System.out.println("добавление в очередь: " + (String)obj);
    }

    @Override
    public void removePeople() {
        this.removeInQueue();
        
    }

    @Override
    public void update() {
        if (!this.isEmptyQueue())
        {
            this.removePeople();
        }  
    } 
    Market () {}
}