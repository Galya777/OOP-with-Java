package task3;

public class Sizes {
    public static int sizeof(String dataType){
        return switch (dataType) {
            case "byte" -> 1;
            case "short", "char" -> 2;
            case "int", "float" -> 4;
            case "long", "double" -> 8;
            default -> 0;
        };

    }
}
