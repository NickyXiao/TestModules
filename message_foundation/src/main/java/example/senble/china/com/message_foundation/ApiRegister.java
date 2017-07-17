package example.senble.china.com.message_foundation;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/7/14.
 */

public class ApiRegister {
    private HashMap<Class,Object> hashMap = new HashMap<>();
    private ApiRegister(){}

    public static ApiRegister getInstance(){
        return Inner.apiRegister;
    }

    private static class Inner{
        private static ApiRegister apiRegister = new ApiRegister();
    }

    public <T> void registerApi(Class<T> className,T classImpl){
        if(null != hashMap){
            hashMap.put(className, classImpl);
        }
    }

    public <T> T getRegisterInterface(Class<T> className){
        if(null != hashMap.get(className)) try {
            return (T) hashMap.get(className);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public <T> void removeInterface(Class<T> tClass){
        hashMap.remove(tClass);
    }
//
//    public static <T> T call(final Class<T> interfaceClass){
//        return (T)Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[]{interfaceClass}, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
//    }
}
