package com.mateacademy.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg)) {
            System.out.println("Round peg r5 fits round roundHole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (roundHole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round roundHole r5.");
        }
        if (!roundHole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round roundHole r5.");
        }
    }
}
