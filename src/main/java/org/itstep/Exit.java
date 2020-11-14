package org.itstep;

public class Exit implements Command{
    @Override
    public void help() {
        System.out.print("Unknown command\n");
    }

    @Override
    public void echo(String[] s) {
        System.out.print("Unknown command\n");
    }

    @Override
    public void now() {
        System.out.print("Unknown command\n");
    }

    @Override
    public void exit() {
        System.out.print("Goodbye!\n");
        System.exit(0);
    }
}
