/**
 * JavaCore package Homework1
 *
 * @author Leon Steiner
 * version 18.05.2022
*/
package Homework1;

public class Team {
    private Participant[] participants;

    public Team(Participant... participants) {
        // внутри метода переменное число параметров интерпретируется как массив
        this.participants = participants;
    }
    public Participant[] getParticipants() {
        return participants;
    }

}