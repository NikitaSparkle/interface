package org.itstep;

public interface Command {
    void help();

    void echo(String s);

    void now();

    void exit();
}
