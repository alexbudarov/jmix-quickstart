package com.company.jmixpm.security;

import io.jmix.dynattrui.role.DynamicAttributesRole;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.UiMinimalRole;

@ResourceRole(name = "ManagerResourceRole", code = "manager-resource-role")
public interface ManagerResourceRole extends EmployeeRole, DynamicAttributesRole, UiMinimalRole {

}