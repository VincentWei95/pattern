package state;

public class EveningWorkState implements WorkState {
    @Override
    public void writeProgram(Work work) {
        // 工作完成，下班了
        if (work.isWorkFinished()) {
            work.setWorkState(new GoOffWorkState());
            work.writeProgram();
        } else {
            if (work.getWorkHour() < 21) {
                System.out.println("当前时间:" + work.getWorkHour() + ",加班，累死");
            } else {
                // 切换工作状态为睡眠状态
                work.setWorkState(new SleepWorkState());
                work.writeProgram();
            }
        }
    }
}
