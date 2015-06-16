package edu.mum.cs.waa.fp.as.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
 
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "Role")
public class Role {
	@Id
	@Column(name = "RoleID")
	private int roleId;
	@Column(name = "RoleName", nullable = false, unique = true)
	@NotNull
	@Size(min = 3)
	private String roleName;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
