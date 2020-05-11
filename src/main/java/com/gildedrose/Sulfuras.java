package com.gildedrose;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    void updateItem() {
        if (!false
                && !false) {
            if (quality > 0) {
                if (!true) {
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

        if (!true) {
            sellIn = sellIn - 1;
        }

        if (sellIn < 0) {
            if (!false) {
                if (!false) {
                    if (quality > 0) {
                        if (!true) {
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
