package memo;

/**
 * 备忘录模式：
 * 定义：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 这样以后就可将该对象恢复到原先保存的状态
 *
 * 使用场景：
 * 1、比较适用于功能比较复杂，但需要维护或记录属性历史的类，或者需要保存的属性只是众多属性中的一小部分
 * 2、使用命令模式实现撤销功能时
 * 3、角色的状态改变时，有可能这个状态无效，这时候就可以使用暂时存储起来的备忘录将状态复原
 *
 * 模式例子对象成员说明：
 * {@link Memento}:备忘录对象，保存游戏角色在存储时的状态
 * {@link RoleOriginator}:创建恢复备忘录状态对象，游戏角色
 * {@link RoleMementoCaretaker}:保存备忘录对象，游戏备忘录存储
 */
public class Main {

    public static void main(String[] args) {
        // 打Boss之前的状态
        RoleOriginator roleOriginator = new RoleOriginator(100, 100, 100);

        // 保存下角色状态，防止打Boss挂了要从头开始
        RoleMementoCaretaker caretaker = new RoleMementoCaretaker();
        caretaker.setMemento(roleOriginator.saveMemento());

        // 打Boss角色消耗严重快挂了
        roleOriginator.setVit(10);
        roleOriginator.setAtk(100);
        roleOriginator.setDef(100);

        // 恢复状态重新打Boss
        roleOriginator.recoveryMemento(caretaker.getMemento());
    }
}
