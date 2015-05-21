import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
 
public class ProxyTest 
{
       public static void main(String[] args) 
       {
             final HelloWorldServiceI helloWorldService = new HelloWorldServiceI() {
                    
                    @Override
                    public String reverseHello(long pId, String wordParameter) {
                           System.out.println("inside reverseHello");
                           return "hello " + wordParameter;
                    }
             };
             
             HelloWorldServiceI service = (HelloWorldServiceI) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), 
                           new Class[]{HelloWorldServiceI.class},
                           new InvocationHandler() {
                                  @Override
                                  public Object invoke(Object proxy, Method method, Object[] args)
                                               throws Throwable 
                                  {
                                        if (method.getName().equals("reverseHello"))
                                        {
                                               //check if user has access right to call reverseHello
                                               //if not --> throw Exception
                                        }
                                        
                                        System.out.println("before calling " + method.getName());
                                        Object result = method.invoke(helloWorldService, args) ;
                                        System.out.println("after calling " + method.getName());
                                        return result;
                                  }
                           }
                           );
             
             String result = service.reverseHello(1, "World");
             System.out.println(result);
             
       }
}
