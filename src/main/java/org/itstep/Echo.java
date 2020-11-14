package org.itstep;

public class Echo implements Command {
    @Override
    public void help() {
        System.out.print("Unknown command\n");
    }

    @Override
    public void echo(String[] s) {
        for (int i = 0; i < s.length; i++) {
            if(i>4){
                System.out.print(s[i]);
            }
        }
        System.out.print("\n");
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
