public class Passepartout {

    private BoardWeight boardWeight;
    private PositionCutOut positionCutOut;
    private Color color;
    private boolean angledCut;
    private double cutOutHeight;
    private double cutOutWidth;

    public Passepartout(BoardWeight boardWeight, PositionCutOut positionCutOut, Color color, boolean angledCut, double cutOutHeight, double cutOutWidth) {
        this.boardWeight = boardWeight;
        this.positionCutOut = positionCutOut;
        this.color = color;
        this.angledCut = angledCut;
        this.cutOutHeight = cutOutHeight;
        this.cutOutWidth = cutOutWidth;
    }

    public BoardWeight getBoardWeight() {
        return boardWeight;
    }

    public void setBoardWeight(BoardWeight boardWeight) {
        this.boardWeight = boardWeight;
    }

    public PositionCutOut getPositionCutOut() {
        return positionCutOut;
    }

    public void setPositionCutOut(PositionCutOut positionCutOut) {
        this.positionCutOut = positionCutOut;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isAngledCut() {
        return angledCut;
    }

    public void setAngledCut(boolean angledCut) {
        this.angledCut = angledCut;
    }

    public double getCutOutHeight() {
        return cutOutHeight;
    }

    public void setCutOutHeight(double cutOutHeight) {
        this.cutOutHeight = cutOutHeight;
    }

    public double getCutOutWidth() {
        return cutOutWidth;
    }

    public void setCutOutWidth(double cutOutWidth) {
        this.cutOutWidth = cutOutWidth;
    }
}

