import java.util.ArrayList;
import java.util.List;

public class FrameMain {
    public static void main(String[] args) {
        BackBoard backBoard = new BackBoard(Material.CORK,
                300.0, Color.BLACK, Fastening.GLUE,
                true, false, true);

        Passepartout passepartout = new Passepartout(BoardWeight.STANDARD,
                PositionCutOut.MIDDLE, Color.ORANGE, true,
                12.5, 16.5);

        Frame frame = new Frame(17.5, 20.5, 2, 3,
                Material.WOOD, Glass.RECYCLED, Color.GREEN, backBoard, passepartout);

        List<Frame> shoppingCart = new ArrayList<>();
        shoppingCart.add(frame);

        System.out.println("I have " + shoppingCart.size() + " frame(s) in my cart.");



    }

}
