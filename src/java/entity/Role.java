/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import vo.RoleVO;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author LOPEZ
 */
@Entity
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rol_id")
    private Long id;
    private String rol_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Role)) {
            return false;
        }
        Role other = (Role) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Role[ id=" + id + " ]";
    }

    /**
     * @return the rol_name
     */
    public String getRol_name() {
        return rol_name;
    }

    /**
     * @param rol_name the rol_name to set
     */
    public void setRol_name(String rol_name) {
        this.rol_name = rol_name;
    }

    public RoleVO getVO() {
        RoleVO rolVO = new RoleVO();
        rolVO.setRolId(this.id.intValue());
        rolVO.setRolName(this.rol_name);

        return rolVO;

    }

    public Role setVO(RoleVO rolVO) {
        this.id = new Long(rolVO.getRolId());
        this.rol_name = rolVO.getRolName();
        return this;
    }
}
