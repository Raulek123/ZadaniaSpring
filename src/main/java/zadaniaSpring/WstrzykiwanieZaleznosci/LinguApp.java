package zadaniaSpring.WstrzykiwanieZaleznosci;

class LinguApp {
    public static void main(String[] args) {
        LinguController controller = new LinguController();
        controller.mainLoop();
    }
}