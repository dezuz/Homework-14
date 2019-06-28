package com.mateacademy.аbstractfactory;

public class AbstractFactoryTest {
    private static Application application;
    private static GUIFactory factory;

    private static Application configureApplication() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            application = new Application(factory);
        } else {
            factory = new WindowsFactory();
            application = new Application(factory);
        }
        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
