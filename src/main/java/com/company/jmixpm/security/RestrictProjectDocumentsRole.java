package com.company.jmixpm.security;

import com.company.jmixpm.entity.ProjectDocument;
import com.company.jmixpm.entity.User;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.security.model.RowLevelPolicyAction;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.PredicateRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;

import java.util.function.Predicate;

@RowLevelRole(name = "Restrict documents by user", code = "restricted-spent-time")
public interface RestrictProjectDocumentsRole {

    @JpqlRowLevelPolicy(
            entityClass = ProjectDocument.class,
            join = "join {E}.project proj",
            where = "proj.manager.id = :current_user_id")
    void restrictProjectDocumentByProjectManager();
}
