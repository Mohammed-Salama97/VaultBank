package customer;

import java.util.Date;

public class Individual extends Customer {
    private String individualName;
    private Date dateOfBirth;
    private Long SSNum;

    public String getIndividualName() {
        return individualName;
    }
    public void setIndividualName(String individualName){
        this.individualName = individualName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getSSNum() {
        return SSNum;
    }

    public void setSSNum(Long SSNum) {
        this.SSNum = SSNum;
    }
}
