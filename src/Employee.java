import java.util.Date;

abstract class Employee extends Person {
    float basicSalary = 0, liveExpenses = 0;
    Date hirDate;

    public Employee() {
        // to do , initialize an employee and construct person object
        /*
         * you need to add one more constructor with the data ..
         * For example ...
         * public Employee(String name,String address,float basicSalary){
         * super(name,address);
         * }
         */
    }

    // mutators and actuators ......
    public float getBasicSalary() {
        return basicSalary;
    }

    public Date getHirDate() {
        return hirDate;
    }

    public float getLiveExpenses() {
        return liveExpenses;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setLiveExpenses(float liveExpenses) {
        this.liveExpenses = liveExpenses;
    }

    public void setHirDate(Date hirDate) {
        this.hirDate = hirDate;
    }
}
