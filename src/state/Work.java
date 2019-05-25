package state;

public class Work {
    private int workHour;
    private boolean isWorkFinished;
    private WorkState workState;

    public Work() {
        workState = new MorningWorkState();
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public boolean isWorkFinished() {
        return isWorkFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        isWorkFinished = workFinished;
    }

    public WorkState getWorkState() {
        return workState;
    }

    public void setWorkState(WorkState workState) {
        this.workState = workState;
    }

    public void writeProgram() {
        workState.writeProgram(this);
    }
}
