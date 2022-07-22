package exception.question8;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MySub extends Super /*implements IA*/ {

//    @Override
//    public void mb() {
//
//    }
    public void ma() throws EOFException, FileNotFoundException {

    }
}
class MySub2 extends Super {
    public void ma() throws EOFException, FileNotFoundException {

    }
}

interface IA{
    void mb();
}
class Super{
   public void ma()throws IOException{

    }
}