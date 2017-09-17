package Lecture4;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class File implements HasSize {
    private final int size;

    public File(int size) {
        if(size<=0){
            throw new IllegalArgumentException("File size in invalid. Size should be more then 0");
        }else{
        this.size = size;}
    }

    public int getSize() {
        return size;
    }
}
