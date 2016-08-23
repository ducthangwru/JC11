import java.io.File;
import java.io.IOException;

public class CreatNewFile {
    public static void main(String[] args) {
        //Tạo thư mục điều kiện ổ E tồn tại
        File file = new File("E:\\newfolder\\newfolder");
        file.mkdirs();

        //Tạo thư mục điền kiện E:\\newfolder1 phải tồn tại
        File file1 = new File("E:\\newfolder1\\newfolder");
        file.mkdir();

        //Tạo mới một file
        File newFile = new File("E:\\text.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Lỗi khi tạo file");
        }

        //Xóa File
        newFile.delete();

        //Kiểm tra sự tồn tại của file
        File newFile1 = new File("E:\\text.txt");
        boolean check = newFile1.exists();
        System.out.println(check);

        //Kiểm tra đường dẫn
        System.out.println(newFile1.isDirectory()); //true nếu newFile là 1 thư mục - false nếu newFile là 1 tập tin

        //Đọc các tập tin
        String[] fileNames = file.list();
        File[] files = file.listFiles();

        for (String fileName : fileNames) System.out.println(fileName);

        for (File file2 : files) System.out.println(file2);

    }
}
