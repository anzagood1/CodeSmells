package Couplers;

import java.util.ArrayList;

public class IncompleteLibraryClass extends ArrayList<String> {
    public String getFirst() {
        if (this.isEmpty()) {
            return null;
        }
        return this.get(0);
    }
    
    public String getLast() {
        if (this.isEmpty()) {
            return null;
        }
        return this.get(this.size() - 1);
    }
    
    public boolean addIfNotExists(String element) {
        if (!this.contains(element)) {
            return this.add(element);
        }
        return false;
    }
    
    public boolean hasElements() {
        return !this.isEmpty();
    }
}
