package state;

public class AfternoonWorkState implements WorkState {
    @Override
    public void writeProgram(Work work) {
        if (work.getWorkHour() < 17) {
            System.out.println("当前时间:" + work.getWorkHour() + ",下午状态不错，继续努力");
        } else {
            // 切换为傍晚工作状态
            work.setWorkState(new EveningWorkState());
            work.writeProgram();
        }
    }
}
