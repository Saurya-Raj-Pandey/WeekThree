

class  BaseEntity  {
        private int  id;
        private String createdBy;
        private String createdDate;
        private String modifiedBy;
       private  String  modifiedDate;
       private boolean isActive ;

       public BaseEntity(int id,String createdBy,String createdDate,String modifiedBy,String modifiedDate,boolean isActive){
           this.id=id;
           this.createdBy=createdBy;
           this.createdDate=createdDate;
           this.modifiedBy=modifiedBy;
           this.modifiedDate=modifiedDate;
           this.isActive=isActive;
       }


}
class User extends BaseEntity{

    private  String userName;
    private   String PassWord;
    private  String emailAddress;
    private  String mobileNumber;


    public User(int id,String createdBy,String createdDate,String modifiedBy,String modifiedDate,boolean isActive,String userName,String Password,String emailAddress,String mobileNumber){
        super(id, createdBy, createdDate, modifiedBy, modifiedDate, isActive);
        this.userName=userName;
        this.PassWord=Password;
        this.emailAddress=emailAddress;
        this.mobileNumber=mobileNumber;
    }


}

class Address extends BaseEntity{  // this is extending the user
    private String country;
    private String state;
    private String zipCode;
    private String streetName;

    public Address(int id, String createdBy, String createdDate, String modifiedBy, String modifiedDate, boolean isActive, String country, String state, String zipCode, String streetName){
        super(id, createdBy, createdDate, modifiedBy, modifiedDate, isActive);
        this.country=country;
        this.state=state;
        this.zipCode=zipCode;
        this.streetName=streetName;

    }



    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
return country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetName() {
        return streetName;
    }
}
class GovermentUser extends User {  // government is a user
    private String FullName;
    private String FatherName;
    private String MotherName;
    private String gender;
    private boolean MartialStatus;
    Address address;


    public GovermentUser(int id, String createdBy, String createdDate, String modifiedBy, String modifiedDate, boolean isActive, String userName, String Password, String emailAddress, String mobileNumber, String FullName, String FatherName, String MotherName, String gender, boolean MartialStatus,String country, String state, String zipCode, String streetName) {
        super(id, createdBy, createdDate, modifiedBy, modifiedDate, isActive, userName, Password, emailAddress, mobileNumber);
        this.FullName = FullName;
        this.FatherName = FatherName;
        this.MotherName = MotherName;
        this.gender = gender;
        this.MartialStatus = MartialStatus;
        System.out.println( "Id  : "+ id +"\n Created By : "+  createdBy  + "\n Created By  :" +  createdDate + "\n Modified By: " + modifiedBy +
                "\n Modified By: "+ modifiedDate + "\n Is Active : "+ isActive + "\n Username : "+ userName + "\n Password : " + Password +
                "\n Email Address : "+ emailAddress +"\n Mobile Number :"+  mobileNumber + "\n Fullname : " + FullName +
                "\n Fathername : " + FatherName +"\n Mothername : "+  MotherName + "\n Gender : " +  gender +"\n Martialstatus : "+ MartialStatus +
                "\n Country : "+ country + "\n State : " + state + "\n Zipcode : "+ zipCode + "\n Streetname : " +  streetName);
    }


    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setMotherName(String motherName) {
        MotherName = motherName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setMartialStatus(boolean martialStatus) {
        MartialStatus = martialStatus;
    }

    public boolean getMartialStatus() {
        return MartialStatus;
    }


}
class GovermentEmployeeInfo{
    public static void main(String[] args) {
        GovermentUser govermentUser=new GovermentUser(2416,    "Aakansha",   "20-01-2022",    "Saurya",   "26-02-2022",
                true,   "Saurya.pandey","asdfghj",  "asdfas@gfasd.com",  "9841284856",   "Saurya Raj Pandey",
                "Pradeep raj pandey",  "poonam pandey",  "Male",false  ,  "Nepal",       "Bagmati",    "44600",   "Golfutar");

    }
}
