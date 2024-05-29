public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Исключение: SexNotCorrectData");
        System.out.printf("Это не правильный формат даты: %s", i);
        System.out.println();
    }
}
