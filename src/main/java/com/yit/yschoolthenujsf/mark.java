
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
    
    public class mark implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private String name;
          private String subject;
	private String markes;
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMarkes() {
		return markes;
	}
	public void setMarkes(String markes) {
		this.markes = markes;
	}
}

