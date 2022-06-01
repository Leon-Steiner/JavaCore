/**
 * JavaCore package Homework1
 *
 * @author Leon Steiner
 * version 18.05.2022
 */
package Homework1.course;

import Homework1.Participant;
public class Water extends Obstacle {

    private int pooldist;

    public Water(int pooldist) {
        this.pooldist = pooldist;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(this.pooldist);
    }
}