package online.stringtek.distributed;

public class ConsistentHash {
    private final boolean withVirtualNode;
    public ConsistentHash(){
        this(false);
    }
    public ConsistentHash(boolean withVirtualNode){
        this.withVirtualNode=withVirtualNode;
    }
}
