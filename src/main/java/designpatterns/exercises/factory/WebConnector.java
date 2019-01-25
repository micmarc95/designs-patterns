package designpatterns.exercises.factory;

public abstract class WebConnector {

    protected static WebConnector create(String url){
        return null;
    }

    public abstract void connect();
}
