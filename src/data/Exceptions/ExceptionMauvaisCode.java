package data.Exceptions;

public class ExceptionMauvaisCode extends Exception{

    public ExceptionMauvaisCode() {};

    public ExceptionMauvaisCode(Integer code) {
        super("Code de sortie : " + code.toString());
    }
}
