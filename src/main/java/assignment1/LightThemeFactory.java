package assignment1;

class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }

    public TextField createTextField() {
        return new LightThemeTextField();
    }
}
