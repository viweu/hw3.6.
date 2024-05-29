public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Исключение: DateNotCorrectFormat");
        System.out.printf("Это не правильный формат даты: %s", i);
        System.out.println();
    }
}