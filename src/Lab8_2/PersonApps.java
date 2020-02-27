package Lab8_2;

public class PersonApps {
    public static void main(String[] args) {

        //create objects
        // Object as a person
        Person P1 = new Person("Puriwat Lertkrai","1986");
        //Object as a Police
        Person P2 = new Police("Piyapone Senanus", "1984",
                "Nakornsithammarat");
        Person P3 = new Sheriff("Nattapong Kaewboonma","1980",
                "Thamyai");

        P1.introduce();
        P2.introduce();
        P3.introduce();


    }//main


}//class
