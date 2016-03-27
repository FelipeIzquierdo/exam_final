/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import vo.UserVO;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author LOPEZ
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    private String name;
    private String pass;
    private int role_id;

    public Long getId() {
        return user_id;
    }

    public void setId(Long id) {
        this.user_id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (user_id != null ? user_id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.user_id == null && other.user_id != null) || (this.user_id != null && !this.user_id.equals(other.user_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Usuario[ id=" + user_id + " ]";
    }

    public UserVO getVO() {

        UserVO userVO = new UserVO();
        userVO.setName(name);
        userVO.setPass(pass);
        userVO.setRole_id(role_id);
        userVO.setUser_id(this.user_id.intValue());

        return userVO;
    }

    public User setVO(UserVO userVO) {
        this.name = userVO.getName();
        this.pass = userVO.getPass();
        this.role_id = userVO.getRole_id();
        this.user_id = new Long(userVO.getUser_id());
        return this;
    }

}
