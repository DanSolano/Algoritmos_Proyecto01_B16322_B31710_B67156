/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author daniel
 */
public class ThreadSaveAnyNSeconds extends Thread {

    SaveAll saveAll = new SaveAll();
    private int seconds = 2000;

    public void run() {
        while (true) {
            try {

                Thread.sleep(seconds);
                System.out.println("ThreadSaveAnyNSeconds woks");
                saveAll.save();

            } catch (Exception e) {
                System.out.println("fck woks");

            }
        }
    }
}
