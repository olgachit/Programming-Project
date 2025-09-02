// Controller.java
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void calculateSquare() {
        int number = view.getUserInput();
        model.setNumber(number);

        int square = model.getSquare();
        view.displaySquare(number, square);
    }
}