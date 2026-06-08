package modul_6.praktikum_1.tanpa_lsp;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Violation: Merubah property height
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); // Violation: Merubah property width
    }
}
