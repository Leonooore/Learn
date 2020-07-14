package com.learn.pattern.observer;

import com.learn.pattern.observer.editor.Editor;
import com.learn.pattern.observer.listeners.EmailNotificationListener;
import com.learn.pattern.observer.listeners.LogOpenListener;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
