package gb.HomeWorkApp4;

public class Robobcop implements Units {
    public int runLenght;
    public int jumpHight;
    public String name;

    public Robobcop(String name,int unLenght, int jumpHight) {
        this.runLenght = run();
        this.jumpHight = jump();
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int run() {
        runLenght = (int) (Math.random() * 30);
        return runLenght;
    }
    @Override
    public int jump() {
        jumpHight = (int) (Math.random() * 5);
        return jumpHight;
    }


}
