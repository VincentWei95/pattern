package state;

public class MorningWorkState implements WorkState {
    @Override
    public void writeProgram(Work work) {
        if (work.getWorkHour() < 12) {
            System.out.println("当前时间:" + work.getWorkHour() + "，上午工作，精神百倍");
        } else {
            // 切换为中午工作状态
            work.setWorkState(new NoonWorkState());
            work.writeProgram();
        }
    }
}
