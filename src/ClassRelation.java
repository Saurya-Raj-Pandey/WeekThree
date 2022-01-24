////IS_A RELATION (inheritance
//
// class Food {
//    public void Food(){
//        System.out.println("The things that can be eaten is called food");
//    }
//}
//class Momo extends Food{
//    public void Momo(){
//        System.out.println( "Momo :This is apopular snacks eaten everywhere in nepal  by every age group ");
//    }
//}
//class Rice extends Momo{
//    public void  Rice(){
//        System.out.println("Rice is the staple food that is eaten daily by a nepai household");
//    }
//}
//class Steak extends Food{
//    public void Steak(){
//        System.out.println("Steak is not that popular among the nepali people but thier are some places that serve it ");
//    }
//}
//class FoodDetails{
//    public static void main(String[] args) {
////        Momo mm=new Momo();
//        Rice rc = new Rice();
//        Steak st=new Steak();
//        System.out.println("The details of Food eaten by a nepali hosehold is : " );
//        rc.Momo();
//        rc.Rice();
//        System.out.println("The Food rarely eaten by the nepali household :");
//        st.Steak();
//    }
//}
////----------------------------------------------------------------------------------------
// HAS-A(composition)

class Bike{
    private String Brand;
    private int Mileage;
    private  String Purpose;
    public void BikeDetails(){
        System.out.println("Brand : "+Brand+ "Mileage : "+Mileage+ " Purpose Of Buying: "+Purpose);
    }

    public void setBrand(String brand) {
        Brand = brand;

    }

    public String getBrand() {
        return Brand;
    }

    public void setMileage(int mileage) {
        Mileage = mileage;

    }

    public int getMileage() {
        return Mileage;
    }

    public void setPurpose(String purpose) {
        Purpose = purpose;

    }

    public String getPurpose() {
        return Purpose;
    }
}
class EngineType{
    public void TestRide(){
        System.out.println("The Test Ride Started");
    }
    public void TestEnd(){
        System.out.println("The Test Ride Ended");
    }
}
class HeroHonda extends Bike{
    public  void HeroHondaTestRide(){
        EngineType engineType=new EngineType();
        engineType.TestRide();
        System.out.println("This is a test ride for the hero honda");
        engineType.TestEnd();
    }
}
class RoyalEnfield extends Bike{
    public void RoyalEnfieldTestRide(){
        EngineType engineType=new EngineType();
        engineType.TestRide();
        System.out.println("This is a Test Ride for the RoyalEnfield");
        engineType.TestEnd();
    }
}
class DetailAboutYourRide{
    public static void main(String[] args) {
        HeroHonda heroHonda=new HeroHonda();
        heroHonda.HeroHondaTestRide();
        heroHonda.setBrand("Shine");
        System.out.println("Brand :"+heroHonda.getBrand());
        heroHonda.setMileage(55);
        System.out.println("Mileage :"+heroHonda.getMileage());
        heroHonda.setPurpose("This is a good choice if you want a mileage bike with comfortable seat");
        System.out.println("Opinon by me is :" +heroHonda.getPurpose());
        System.out.println("         ");
        RoyalEnfield royalEnfield=new RoyalEnfield();
        royalEnfield.RoyalEnfieldTestRide();
        royalEnfield.setBrand("Bullet");
        System.out.println("Brand :"+royalEnfield.getBrand());
        royalEnfield.setMileage(35);
        System.out.println("Mileage :"+royalEnfield.getMileage());
        royalEnfield.setPurpose("This is a comfortable city ride bike which has a resale value but the mileage is quite low");
        System.out.println("Opinion by me is :"+royalEnfield.getPurpose());
    }
}
