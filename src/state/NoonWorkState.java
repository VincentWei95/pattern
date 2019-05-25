package state;

public class NoonWorkState implements WorkState {
    @Override
    public void writeProgram(Work work) {
        if (work.getWorkHour() < 13) {
            System.out.println("当前时间:" + work.getWorkHour() + "，中午饿了困了");
        } else {
            // 切换为下午工作状态
            work.setWorkState(new AfternoonWorkState());
            work.writeProgram();
        }
    }
}
