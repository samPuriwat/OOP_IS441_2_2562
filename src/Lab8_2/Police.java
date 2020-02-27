package Lab8_2;

public class Police extends Person {
    private String workCountry;

    //constructor

    public Police(String name, String bornYear, String workCountry) {
        super(name, bornYear);
        this.workCountry = workCountry;
    }
    //introduce

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm Police,I working at "
                +this.workCountry+" country.");
    }


    //getter and setter

    public String getWorkState() {
        return workCountry;
    }

    public void setWorkState(String workCountry) {
        this.workCountry = workCountry;
    }
}
