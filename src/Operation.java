public enum Operation {
    ROCK,
    PAPER,
    SCISSORS,
    SPOCK,
    LIZARD;



    public int searchWinner (Operation otherMove) {
        if (this == otherMove)
            return 0;
        switch (this) {
            case ROCK:
                return (otherMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (otherMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (otherMove == PAPER ? 1 : -1);
        }
        return 0;
    }



    public int searchWinner2 (Operation otherMove) {
        if (this == otherMove)
            return 0;
        switch (this) {
            case ROCK:
                return (otherMove == SCISSORS || otherMove == LIZARD? 1 : -1);
            case PAPER:
                return (otherMove == ROCK || otherMove==SPOCK ? 1 : -1);
            case SCISSORS:
                return (otherMove == PAPER || otherMove == LIZARD ? 1 : -1);
            case SPOCK:
                return (otherMove == ROCK || otherMove==SCISSORS ? -1 : 1);
            case LIZARD:
                return (otherMove == PAPER || otherMove == ROCK ? 1 : -1);

            default:
        }
        return 0;
    }
}
