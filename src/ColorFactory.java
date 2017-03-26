
public class ColorFactory extends AbstractFactory{
    @Override
    public IColor getColor(String name) {
        IColor icolor;
        if(name.equals("red"))
        {
            return new Red();
        }
        else if(name.equals("blue"))
        {
            return  new Blue();
        }
        return null;
    }
}
