import java.io.*;

public class TestFile {

    public static void main(String[] args) {

        String path="D:\\java111\\123\\work";
        testFile(path);
        System.out.println("======");
        treeWalk(path);
        copy();
    }

    private static void copy() {
        String src = "D:\\java111\\123\\Blogs\\Project\\作业答题\\作业答题.md";
        String dest = "D:\\java111\\123\\Blogs\\Project\\作业答题copy.md";
        try (
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dest);
        ) {
            byte[] bytes = new byte[1024];
            int len;
            //1kb为缓存来读取
            while ( (len = in.read(bytes)) !=-1){
                out.write(bytes,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    private static void treeWalk(String path) {
        File file = new File(path);
        if (file.isFile()) System.out.println(file.getName());
        else {
            File[] files = file.listFiles();
            for (File children : files) {
                treeWalk(children.getAbsolutePath());//绝对路径
            }
        }

    }

    private static void testFile(String path) {
        File file = new File(path);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
