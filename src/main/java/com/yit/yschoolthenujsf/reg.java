package com.yit.yschoolthenujsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author thenuzan
 */
@ManagedBean
@RequestScoped
public class reg implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String pname;
    private String address;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return pname;
    }

    public void setParentName(String pname) {
        this.pname = pname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
