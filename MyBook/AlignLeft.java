package MyBook;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align left,"+paragraph.getpText());
    }
}
