package uk.co.aceos.biotechnica.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Ryan Fuller on 03/06/2017.
 */
public class CreativeTabBiotechnica extends CreativeTabs {

    public CreativeTabBiotechnica(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.APPLE;
    }
}
