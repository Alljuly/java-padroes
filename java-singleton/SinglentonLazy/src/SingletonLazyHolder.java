public class SingletonLazyHolder {
    private static class InstanceHolder{
        private static SingletonLazyHolder instacia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instacia;
    }
}
