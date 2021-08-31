package com.company.jmixpm.screen.task;

import com.company.jmixpm.entity.SpentTimeItem;
import com.company.jmixpm.entity.User;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.screen.*;
import com.company.jmixpm.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Task_.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
    @Autowired
    private CollectionContainer<Task> tasksDc;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Install(to = "spentTimeItemsTable.create", subject = "initializer")
    private void spentTimeItemsTableCreateInitializer(SpentTimeItem spentTimeItem) {
        Task task = tasksDc.getItem();
        spentTimeItem.setTask(task);
        spentTimeItem.setUser((User) currentAuthentication.getUser());
    }
}