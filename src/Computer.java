import java.util.Random;

public class Computer {

    public static Operation getComputer() {
        Operation[] operations = Operation.values();
        Random rd = new Random();
        int num = rd.nextInt(operations.length);
        return operations[num];
    }

    public static Active getComputer2() {
        Active[] actives = Active.values();
        Random random = new Random();
        int num = random.nextInt(actives.length);
        return actives[num];
    }

}
