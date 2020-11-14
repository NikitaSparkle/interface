package org.itstep;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            System.out.print(">>");
            String command = scan.nextLine();
            if (command.equals("help")) {
                Help help = new Help();
                help.help();
            } else {
                if (command.equals("echo")) {
                    Echo echo = new Echo();
                    echo.echo(command);
                } else {
                    if (command.equals("now")) {
                        Now now = new Now();
                        now.now();
                    } else {
                        if (command.equals("exit")) {
                            Exit exit = new Exit();
                            exit.exit();
                        } else {
                            System.out.print("Unknown command\n");
                        }
                    }
                }
            }

        }
    }

}
