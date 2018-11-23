package com.hva.joris.geoguesswipe;

public class StreetviewObject {

    private int streetviewName;
    private boolean inEurope;

    public StreetviewObject(int streetviewName, boolean inEurope) {
        this.streetviewName = streetviewName;
        this.inEurope = inEurope;
    }

    public int getStreetviewName() {
        return streetviewName;
    }

    public void setStreetviewName(int streetviewName) {
        this.streetviewName = streetviewName;
    }

    public boolean isInEurope() {
        return inEurope;
    }

    public void setInEurope(boolean inEurope) {
        this.inEurope = inEurope;
    }

    public static final int[] PRE_DEFINED_IMAGES = {
            R.drawable.img1_yes_denmark,
            R.drawable.img2_no_canada,
            R.drawable.img3_no_bangladesh,
            R.drawable.img4_yes_kazachstan,
            R.drawable.img5_no_colombia,
            R.drawable.img6_yes_poland,
            R.drawable.img7_yes_malta,
            R.drawable.img8_no_thailand
    };

    public static final boolean[] PRE_DEFINED_OBJECT_IN_EUROPE = {
            true,
            false,
            false,
            true,
            false,
            true,
            true,
            false
    };
}
