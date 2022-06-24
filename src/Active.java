
public enum Active {
    ROCK,
    PAPER,
    SCISSORS,
    SPOCK,
    LIZARD;

    public static int length;

    public int searchWinner2 (Active otherMove2) {
        if (this == otherMove2)
            return 0;
        switch (this) {
            case ROCK:
                return (otherMove2 == SCISSORS || otherMove2 == LIZARD? 1 : -1);
            case PAPER:
                return (otherMove2 == ROCK || otherMove2==SPOCK ? 1 : -1);
            case SCISSORS:
                return (otherMove2 == PAPER || otherMove2 == LIZARD ? 1 : -1);
            case SPOCK:
                return (otherMove2 == ROCK || otherMove2==SCISSORS ? -1 : 1);
            case LIZARD:
                return (otherMove2 == PAPER || otherMove2 == ROCK ? 1 : -1);

            default:
        }
        return 0;
    }


}
