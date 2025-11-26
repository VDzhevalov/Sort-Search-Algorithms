package app.view;

import app.exception.InputException;

import java.util.Scanner;

import static app.utils.InputValidator.validateIndex;
import static app.utils.TitleUtil.printTitle;

public class TargetNumberView {

    public static int getNumberForSearch() {
        printTitle();
        String index;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            index = scanner.nextLine().strip();
            try {
                return validateIndex(index);
            } catch (InputException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
