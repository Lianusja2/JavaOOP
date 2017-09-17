package Lecture2.ImmutablePoint;

import java.util.ArrayList;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class Lines {
    private ArrayList<Line> lines = new ArrayList<Line>();

    public void add(Line line) {
        lines.add(line);
    }

    public double sumLength() {
        double sum = 0;
        for (Line line : lines) {
            sum += line.getLength();
        }
        return sum;
    }

    public Line longestLine() {
        Line longest;
        if (lines != null) {
            longest = lines.get(0);
            for (Line line : lines) {
                if (line.getLength() > longest.getLength()) {
                    longest = line;
                }
            }
            return longest;
        } else {
            throw new IllegalStateException("List is empty. Can not find the longest line.");
        }
    }
}
