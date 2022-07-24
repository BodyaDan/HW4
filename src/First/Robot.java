package First;

public class Robot {
    private String mission;
    private String name;

    Robot(){
        this.name = "Robot";
        this.mission = "я просто працюю";
    }

    public void work() {
        System.out.println("Я " + name + " - " + mission);
    }

    public String getMission() {
        return mission;
    }

    public String getName() {
        return name;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void setName(String name) {
        this.name = name;
    }
}
