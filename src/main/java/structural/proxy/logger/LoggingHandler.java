package structural.proxy.logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {
    private Object target;
    private Map<String, Integer> calls = new HashMap<>();

    public <T> LoggingHandler(T target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();

        if (methodName.equals("toString")) {
            return calls.toString();
        }

        calls.merge(methodName, 1, Integer::sum);

        return method.invoke(target, args);
    }
}
