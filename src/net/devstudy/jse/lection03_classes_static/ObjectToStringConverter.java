package net.devstudy.jse.lection03_classes_static;

public class ObjectToStringConverter extends Converter<Object, String> {
    @Override
    public String convert(Object source) {
        return String.valueOf(source);
    }
}
