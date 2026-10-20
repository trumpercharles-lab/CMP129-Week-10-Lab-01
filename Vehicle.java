public class Vehicle extends Car {
    private String company, model;
    private int year;

    public Vehicle(String company, String model, int year){
        this.company=company;
        this.model=model;
        this.year=year;
    }

    public void displayInfo(){
        System.out.print("Company: "+company+"\n"+"Model: "+model+"\n"+"Year: "+year+"\n");
    }
}
