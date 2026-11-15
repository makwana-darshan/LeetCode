package leetcode;

public class DesignHashSet {
    private final int[] set;

    public DesignHashSet() {
        this.set = new int[31251];
    }

    public void add(int key) {
        set[key >> 5] |= (1 << (key & 31));
    }

    public void remove(int key) {
        set[key >> 5] &= ~(1 << (key & 31));
    }

    public boolean contains(int key) {
        return (set[key >> 5] & (1 << (key & 31))) != 0;
    }
}
