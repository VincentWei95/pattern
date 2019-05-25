package state;

public class SleepWorkState implements WorkState {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间:" + work.getWorkHour() + "，不行了，睡觉");
    }
}
