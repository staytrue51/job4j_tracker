package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Ball ball = new Ball();
        Fox fox = new Fox();
        Hare hare = new Hare();
        ball.run(hare);
        hare.tryEat(ball);
        ball.run(wolf);
        wolf.tryEat(ball);
        ball.run(fox);
        fox.kill(ball);
    }
}
