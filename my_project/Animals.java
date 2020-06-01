package my_project;

public abstract class Animals {
    protected float run;
    protected float swim;
    protected float jump;
    protected String name;

    public Animals(float run, float swim, float jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public void printInfo ()
    {
        toRun(run);
        toSwim(swim);
        toJump(jump);
    }

    void toRun(float run)
    {
        System.out.println("run: true");
    }

    abstract void toSwim(float swim);

    void toJump(float jump)
    {
        System.out.println("jump: true");
    }
}






