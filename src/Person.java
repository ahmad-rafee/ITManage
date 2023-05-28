abstract class Person {
    String name=null,address=null,email=null,phoneNumber=null;
    int id=0;
    int gender=1; //1 for male,2 for female
    public Person(){
        
    }
    public Person(String name,String address,String email,String phoneNumber,int id,int gender){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public int getId() {
        return id;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getGender() {
        return gender;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
