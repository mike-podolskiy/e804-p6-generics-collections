//CHECKSTYLE:OFF
package kz.mix.e804.genericsCollections;

// Перегрузка, а не переопределение - отсюда следует ошибка компиляции
class LastError<T> {
    private T lastError;
    void setError(T t){
        lastError = t;
        System.out.println("LastError: setError");
    }
}
class StrLastError<S extends CharSequence> extends LastError<String>{
    public StrLastError(S s) {
    }
    void setError(S s){
        System.out.println("StrLastError: setError");
    }
}
public class TestGeneric {
    public static void main(String []args) {
        StrLastError<String> err = new StrLastError<>("Error");
        err.setError("");
    }
}
