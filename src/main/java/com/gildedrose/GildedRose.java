package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = Arrays.stream(items)
                .map(this::createItem)
                .toArray(Item[]::new);
    }

    private Item createItem(Item item) {
        if (item.name.equals("Aged Brie")) {
            return new AgedBrie(item.sellIn, item.quality);
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePasses(item.sellIn, item.quality);
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new Sulfuras(item.sellIn, item.quality);
        }
        return item;
    }

    public void updateItems() {
        for (Item item : items) {
            item.updateItem();
        }
    }

}