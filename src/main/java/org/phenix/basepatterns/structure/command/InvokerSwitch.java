package org.phenix.basepatterns.structure.command;

public class InvokerSwitch {
    private Command setup;
    private Command teardown;


    public InvokerSwitch(Command setUp, Command tearDown) {
        this.setup = setUp;
        this.teardown = tearDown;
    }

    public void setUp(){
        setup.execute();
    }

    public void tearDown()
    {
        teardown.execute();
    }
}
