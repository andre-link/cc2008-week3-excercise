import java.util.*; 
public class Mempool {

    private List<Transaction> pending;

    public Mempool() {
        this.pending = new ArrayList<Transaction>();
    }
    public void submit(Transaction tx) {
        pending.add(tx);
    }
    public int size() {
        return pending.size();
    }
    public List<Transaction> take(int max) {
        if (pending.size() >= max) {
            return pending.subList(0, max);
        }
        return pending.subList(0, pending.size());
    }
    
}
