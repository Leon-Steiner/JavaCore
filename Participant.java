/**
 * JavaCore Homework1
 *
 * @author Leon Steiner
 * version 18.05.2022
 */
package Homework1;

public interface Participant {
    boolean isOnDistance();

    void run(int distance);

    void jump(int height);

    void swim(int distance);
}