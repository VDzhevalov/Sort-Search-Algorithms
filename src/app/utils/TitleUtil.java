package app.utils;

import static app.view.ResultView.getOutput;

public class TitleUtil {
    private static final String TITLE = "\nEnter Searched number:";

    public static void printTitle() {
        getOutput(TITLE);
    }
}
