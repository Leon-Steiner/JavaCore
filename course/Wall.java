/**
 * JavaCore package Homework1
 *
 * @author Leon Steiner
 * version 18.05.2022
 */
package Homework1.course;

import Homework1.Participant;

public class Wall extends Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(this.height);
    }
}