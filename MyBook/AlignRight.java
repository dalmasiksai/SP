package MyBook;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align right,"+paragraph.getpText());
    }
}
