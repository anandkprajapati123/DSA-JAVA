import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NonNull {
}

public class TypeAnnotationsExample {
    private List<@NonNull String> nonNullList;
    public void typeCastExample(Object obj) {
        String str = (@NonNull String) obj;
    }
    public @NonNull String getNonNullString() {
        return "Hello, World!";
    }
    public void setNonNullString(@NonNull String str) {
        this.nonNullList.add(str);
    }
    public void riskyMethod() throws @NonNull Exception {
        throw new Exception("This is a non-null exception.");
    }
    public void arrayExample() {
        @NonNull String[] nonNullArray = new @NonNull String[10];
    }
}