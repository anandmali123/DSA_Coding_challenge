import java.util.HashSet;
import java.util.Random;

class RandomizedSet {
    HashSet<Integer> set = new HashSet<>();

    public RandomizedSet() {
        HashSet<Integer> set = new HashSet<>();

    }

    public boolean insert(int val) {
        if (!set.add(val))
            return false;
        else
            return true;
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        if (set.isEmpty()) {
            return -1;
        }

        Integer[] array = set.toArray(new Integer[set.size()]);

        int randomIndex = new Random().nextInt(array.length);

        return array[randomIndex];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */