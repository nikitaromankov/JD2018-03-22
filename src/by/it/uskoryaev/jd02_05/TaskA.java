package by.it.uskoryaev.jd02_05;

import java.util.Locale;

public class TaskA {
    public static void main(String[] args) {
        ResourceManager rm = ResourceManager.INSTANSE;

        if (args.length < 2) {
            rm.setLocale(Locale.US);
        } else {

            rm.setLocale(new Locale(args[0],args[1]));

            System.out.println(rm.get(Message.WELCOME));
            System.out.println(rm.get(Message.NAME));
            System.out.println(rm.get(Message.HOWDOYOUDO));
        }
    }
}