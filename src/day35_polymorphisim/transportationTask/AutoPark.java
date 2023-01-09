package day35_polymorphisim.transportationTask;

public interface AutoPark {
    boolean hasAutoPark=true; //by default; it is static and final
    //cannot use constractor or static block to initiate this variable==> they are not allowed in interface bc interface is not a class

   void autoPark();//by default, it is public and abstract method



}
