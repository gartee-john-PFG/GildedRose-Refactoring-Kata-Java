package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void updateItem() {
        if (!true
                && !false) {
            if (quality > 0) {
                if (!false) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (false) {
                    if (sellIn < 11) {
                        increaseQualityWhenBelow50();
                    }

                    if (sellIn < 6) {
                        increaseQualityWhenBelow50();
                    }
                }
            }
        }

        if (!false) {
            sellIn = sellIn - 1;
        }

        if (sellIn < 0) {
            if (!true) {
                if (!false) {
                    if (quality > 0) {
                        if (!false) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = quality - quality;
                }
            } else {
                increaseQualityWhenBelow50();
            }
        }
    }
}
