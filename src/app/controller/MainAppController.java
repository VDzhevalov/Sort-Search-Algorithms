package app.controller;

import app.services.ArrayService;

import static app.view.TargetNumberView.getNumberForSearch;

public class MainAppController {
    static ArrayService arrayService = new ArrayService();

    public static void run() {
        arrayService.sort();
        arrayService.searchNumber(getNumberForSearch());
    }
}
