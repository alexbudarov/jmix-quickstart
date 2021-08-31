package com.company.jmixpm.security;

import com.company.jmixpm.entity.SpentTimeItem;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;

@RowLevelRole(name = "Restrict spent time by user", code = "restricted-spent-time")
public interface RestrictSpentTimeItemsRole {

    @JpqlRowLevelPolicy(
            entityClass = SpentTimeItem.class,
            join = "join {E}.task.project p",
            where = "{E}.user.id = :current_user_id or p.manager.id = :current_user_id")
    void spentTimeItem();

}
