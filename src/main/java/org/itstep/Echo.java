package org.itstep;

public class Echo implements Command {
    @Override
    public void help() {
        System.out.print("Unknown command\n");
    }

    @Override
    public void echo(String s) {
        System.out.print(s+"\n");
    }

    @Override
    public void now() {
        System.out.print("Unknown command\n");
    }

    @Override
    public void exit() {
        System.out.print("Unknown command\n");
    }
}
