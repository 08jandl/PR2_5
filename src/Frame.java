public class Frame {

    private double height;
    private double width;
    private double depth;
    private double frameWidth;
    private Material material;
    private Glass glass;
    private Color color;
    private BackBoard backBoard;
    private Passepartout passepartout;

    public Frame(double height, double width, double depth, double frameWidth, Material material, Glass glass, Color color, BackBoard backBoard, Passepartout passepartout) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.frameWidth = frameWidth;
        this.material = material;
        this.glass = glass;
        this.color = color;
        this.backBoard = backBoard;
        this.passepartout = passepartout;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getFrameWidth() {
        return frameWidth;
    }

    public void setFrameWidth(double frameWidth) {
        this.frameWidth = frameWidth;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Glass getGlass() {
        return glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BackBoard getBackBoard() {
        return backBoard;
    }

    public void setBackBoard(BackBoard backBoard) {
        this.backBoard = backBoard;
    }

    public Passepartout getPassepartout() {
        return passepartout;
    }

    public void setPassepartout(Passepartout passepartout) {
        this.passepartout = passepartout;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", frameWidth=" + frameWidth +
                ", material=" + material +
                ", glass=" + glass +
                ", color=" + color +
                ", backBoard=" + backBoard +
                ", passepartout=" + passepartout +
                '}';
    }
}
