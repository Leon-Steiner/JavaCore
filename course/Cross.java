/**
 * JavaCore package Homework1
 *
 * @author Leon Steiner
 * version 18.05.2022
 */
package Homework1.course;

import Homework1.Participant;


public class Cross extends Obstacle {

    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(this.distance);
    }
}