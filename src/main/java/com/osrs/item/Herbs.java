package com.osrs.item;

/**
 * Created by Jeremy on 6/25/17.
 */
public enum Herbs {
    GUAM(0), MARRENTIL(1), TARROMIN(2), HARRALANDER(3), RANNAR(4), TOADFLAX(5), IRIT(6), AVANTOE(7), KWUARM(8), SNAPDRAGON(9), CADANTINE(10), LANTADYME(11), DWARFWEED(12), TORSTOL(13);
    private int value;

    private Herbs(int value)
    {
        this.value = value;
    }
    public int getValue()
    {
        return this.value;
    }
}
