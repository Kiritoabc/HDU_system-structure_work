package org.boluo.test.register.action;

import com.opensymphony.xwork2.ActionSupport;
import org.boluo.test.register.model.Person;

public class Register extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person personBean;

    // 验证
    public void validate(){
        if (personBean.getFirstName().isEmpty()) {
            addFieldError("personBean.firstName", "First name is required.");
        }

        if (personBean.getEmail().isEmpty()) {
            addFieldError("personBean.email", "Email is required.");
        }

        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }
    }

    // 处理
    public String execute() throws Exception {
        //call Service class to store personBean's state in database

        return SUCCESS;
    }



    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person person) {
        personBean = person;
    }
}
