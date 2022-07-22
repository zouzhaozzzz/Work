package exception.question12;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MySuper2 {
    public void m1() throws IOException{}
}
class MySuper{
    public void m1() throws IOException{}
}
class MySub extends MySuper {
    public void m1() throws EOFException {}
}
class MySub2 extends /*MySub*/MySuper{
    public void m1() throws  FileNotFoundException {}
}