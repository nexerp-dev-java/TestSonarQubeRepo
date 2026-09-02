package testcodepkg;

import JavaCode.JavaCodeClass;
import org.junit.jupiter.api.Test;

public class TestCodeJava {
    @Test
    public void addInt() {
        JavaCodeClass a = new JavaCodeClass();
        int c = a.add(10, 20);
    }

    @Test
    public void multiplyInt() {
        JavaCodeClass a = new JavaCodeClass();
        int c = a.multiply(10, 20);
    }
}
