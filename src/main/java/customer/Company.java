package customer;

import java.util.Date;

public class Company extends Customer{
    private Long compTaxNum;
    private String compName;
    private Date dateOfFounding;
    private String compWebsite;
    private String compIndustry;
    private String compSize;

    public Long getCompTaxNum() {
        return compTaxNum;
    }

    public void setCompTaxNum(Long compTaxNum) {
        this.compTaxNum = compTaxNum;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public Date getDateOfFounding() {
        return dateOfFounding;
    }

    public void setDateOfFounding(Date dateOfFounding) {
        this.dateOfFounding = dateOfFounding;
    }

    public String getCompWebsite() {
        return compWebsite;
    }

    public void setCompWebsite(String compWebsite) {
        this.compWebsite = compWebsite;
    }

    public String getCompIndustry() {
        return compIndustry;
    }

    public void setCompIndustry(String compIndustry) {
        this.compIndustry = compIndustry;
    }

    public String getCompSize() {
        return compSize;
    }

    public void setCompSize(String compSize) {
        this.compSize = compSize;
    }
}
