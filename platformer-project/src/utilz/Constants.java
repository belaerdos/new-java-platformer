package utilz;

public class Constants {

    public static class Directions{
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;
    }

    public static class PlayerConstants{
        public static final int IDLE = 0;
        public static final int WALK = 1;
        public static final int RUN = 2;
        public static final int JUMP = 3;
        public static final int HIT_RIGHT = 4;
        public static final int HIT_LEFT = 5;
        public static final int KICK = 6;
        public static final int DEFEND = 7;
        public static final int CROUCH = 8;
        public static final int DEAD = 9;

        public static int getSpriteAmount(int playerAction){

            switch(playerAction){
                case IDLE:
                    return 6;
                case WALK:
                case RUN:
                    return 8;
                case JUMP:
                    return 10;
                case HIT_RIGHT:
                case KICK:
                    return 4;
                case HIT_LEFT:
                case CROUCH:
                case DEAD:
                    return 3;
                case DEFEND:
                    return 2;
                default:
                    return 1;
            }
        }
    }
}
