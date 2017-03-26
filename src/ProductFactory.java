import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;


public class ProductFactory {
   public void gotoFac(String factory)
   {
       if(factory.equals("shape"))
       {
           ShapeFactory fac= new ShapeFactory();
           Scanner sc = new Scanner(System.in);
          String desired =sc.next();
           fac.getShape(desired).Draw();
       }
       else if(factory.equals("color"))
       {
           ColorFactory fac= new ColorFactory();
           Scanner sc = new Scanner(System.in);
           String desired =sc.next();
           fac.getColor(desired).Fill();
       }
   }
}
