package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void updateItem() {
        increaseQualityWhenBelow50();

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            increaseQualityWhenBelow50();
        }
    }
}
