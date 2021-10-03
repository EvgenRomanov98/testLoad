package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            int time = Integer.parseInt(args[0]);
            System.out.println("Hello, I'm working! I'll be working during + " + time + " sec.");
            new Thread(() -> {
                for (int i = 0; i < time; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("process - " + i);
                }
            }).start();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
