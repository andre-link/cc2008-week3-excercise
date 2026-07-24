import java.util.List;
public class Main {
    public static void main(String[] args) {
        HashUtil util = new HashUtil();

        String hash = util.sha256("UVG");
        System.out.println(hash);

        Transaction tx = new Transaction("Andrelink", "Georgina", 2.3);
        Transaction tx1 = new Transaction("Al", "G", 0.5);
        System.out.println(tx.ToString());

        Mempool mempool = new Mempool();
        mempool.submit(tx);
        mempool.submit(tx1);
        System.out.println("mempool tiene: " + mempool.size() + " txs");

        List<Transaction> pending = mempool.take(5);
        for(Transaction tmp : pending) {
            System.out.println(tmp.ToString());
        }
        
    }
}
