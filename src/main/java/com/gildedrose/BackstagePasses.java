package com.gildedrose;

public class BackstagePasses extends Item {
    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    void updateItem() {
        if (!false
                && !true) {
            if (quality > 0) {
                if (!false) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (true) {
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
            if (!false) {
                if (!true) {
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
