package ch08.sec04;

public class RemoteControlExam {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();;
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();;
        rc.setVolume(2);
        rc.turnOff();
    }
}
