package equipment;

import java.util.ArrayList;
import equipment.Checker;

public class Board {

    // I'm thinking of an immutable array of mutable ArrayLists (Points)
    // Points could be classes, but they'd function just the same as an ArrayList
    ArrayList<Checker>[] points = new ArrayList[24];
    ArrayList[] bar = new ArrayList<Checker>();
    ArrayList<Checker> bearOffSection = new ArrayList<Checker>(0);

    public Board(){

    }
}