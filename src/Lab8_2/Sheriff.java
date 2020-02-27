package Lab8_2;

public class Sheriff extends Person {
    private String workState;

    public Sheriff(String name, String bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm Sheriff, I working at"+
                this.workState+"state.");
    }

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }
}
