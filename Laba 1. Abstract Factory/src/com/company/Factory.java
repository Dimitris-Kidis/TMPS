package com.company;

import org.w3c.dom.ls.LSOutput;

public class Factory {
    public static class RectangHighQuality implements HighQuality {
        public RectangHighQuality() {
            System.out.println("Create RectangHighQuality");
            System.out.println("|--------|\n" +
                    "|  High  |\n" +
                    "|--------|");
        }

        @Override
        public void blackAndWhite() {
            System.out.println("Formatted to B/W");
        }
    }

    public static class RectangLowQuality implements LowQuality {
        public RectangLowQuality() {
            System.out.println("Create RectangLowQuality");
            System.out.println("|-------|\n" +
                    "|  Low  |\n" +
                    "|-------|");
        }

        @Override
        public void blackAndWhite() {
            System.out.println("Formatted to B/W");
        }
    }

    public static class CircleHighQuality implements HighQuality {
        public CircleHighQuality() {
            System.out.println("Create CircleHighQuality");
            System.out.println(
                    "   ......\n" +
                    "  ........\n" +
                    " ...High...\n" +
                    "  ........\n" +
                    "   ......\n");
        }

        @Override
        public void blackAndWhite() {
            System.out.println("Formatted to B/W");
        }
    }

    public static class CircleLowQuality implements LowQuality {
        public CircleLowQuality() {
            System.out.println("Create CircleLowQuality");
            System.out.println(
                            "   .....\n" +
                            "  .......\n" +
                            " ...Low...\n" +
                            "  .......\n" +
                            "   .....\n");
        }

        @Override
        public void blackAndWhite() {
            System.out.println("Formatted to B/W");
        }
    }


}
