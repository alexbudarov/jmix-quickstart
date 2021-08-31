package com.company.jmixpm.screen.spenttimeitem;

import io.jmix.ui.screen.*;
import com.company.jmixpm.entity.SpentTimeItem;

@UiController("SpentTimeItem.edit")
@UiDescriptor("spent-time-item-edit.xml")
@EditedEntityContainer("spentTimeItemDc")
public class SpentTimeItemEdit extends StandardEditor<SpentTimeItem> {
}