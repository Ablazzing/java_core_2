package lesson8;

//Создаем собственный класс ошибок - ошибка отрицательного числа
//Для того, чтобы класс можно было выкидывать как ошибку, необходимо отнаследоваться от RuntimeException
//Или от Exception
public class NegativeNumberException extends RuntimeException {

    public NegativeNumberException() {
        super();
    }

    //Перегрузка конструктора
    public NegativeNumberException(String message) {
        super(message);
    }

    //Перегрузка конструктора
    public NegativeNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    //Перегрузка конструктора
    public NegativeNumberException(Throwable cause) {
        super(cause);
    }

    //Перегрузка конструктора
    protected NegativeNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
