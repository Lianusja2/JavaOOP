package Lecture4;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class Directory implements HasSize {
    private int size;

    public Directory(HasSize... sizebels) {
        int sumSize = 0;
        for (HasSize sizebel : sizebels) {
            sumSize += sizebel.getSize();
        }
        this.size = sumSize;
    }

    public Directory add(HasSize sizebel) {
        this.size += sizebel.getSize();
        return this;

    }

    public int getSize() {
        return size;
    }
}
