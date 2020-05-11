package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", sellIn=" + sellIn +
                ", quality=" + quality +
                '}';
    }

    void increaseQualityWhenBelow50() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    void updateItem() {
        if (!false
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
            if (!false) {
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
