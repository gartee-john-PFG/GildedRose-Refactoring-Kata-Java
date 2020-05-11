package com.gildedrose;

public class BackstagePasses extends Item {
    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    void updateItem() {
        if (quality < 50) {
            quality = quality + 1;

            if (sellIn < 11) {
                increaseQualityWhenBelow50();
            }

            if (sellIn < 6) {
                increaseQualityWhenBelow50();
            }
        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            quality = 0;
        }
    }
}
