import controllers.MenuController;
import views.MenuFrame;

public class VMMVC {
    public static void main(String[] args) {
        MenuFrame menuFrame = new MenuFrame();
        menuFrame.init();

        MenuController frameController = new MenuController(menuFrame);
    }
}