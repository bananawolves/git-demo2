package it.heima.Test3;

public class Race {
    public static void main(String[] args) {
        Race race=new Race();
        Turtle turtle=race.new Turtle();
        Rabbit rabbit=race.new Rabbit();
        turtle.start();
        rabbit.start();
    }
    private int turtleDistance = 0;
    private int rabbitDistance = 0;

    class Turtle extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 800; i++) {
                if (rabbitDistance == 800) {
                    System.out.println("兔子赢得比赛，此时乌龟才跑了" + turtleDistance + "米");
                    break;
                } else {
                    turtleDistance += 1;
                    try {
                        Thread.sleep(100);
                        System.out.println("乌龟跑了" + turtleDistance + "米，此时兔子跑了" + rabbitDistance + "米");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    class Rabbit extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 800; i += 2) {
                if (turtleDistance == 800) {
                    System.out.println("乌龟赢得比赛，此时兔子才跑了" + rabbitDistance + "米");
                    break;
                }else {
                    rabbitDistance+=2;
                    if (rabbitDistance==600){
                        System.out.println("兔子觉得胜券在握，所以摆烂一会");
                        try {
                            Thread.sleep(60000);
                        } catch (InterruptedException e) {
                          e.printStackTrace();
                        }
                    }
                    try {
                        Thread.sleep(100);
                        System.out.println("乌龟跑了" + turtleDistance + "米，此时兔子跑了" + rabbitDistance + "米");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
}

