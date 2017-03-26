
public class ShapeFactory extends AbstractFactory {
    @Override
    public IShape getShape(String name) {
       if(name.equals("square"))
       {
           return new Square();
       }
       else if(name.equals("triangle"))
       {
           return  new Triangle();
       }
       return  null;
    }
}
