package state;

public class GoOffWorkState implements WorkState {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间:" + work.getWorkHour() + "，下班了");
    }
}
