package good_SRP;
import org.junit.Assert;
import org.junit.Test;

import good_SRP.*;

public class FileOperationsTest {
    FileOperations f1 = new FileOperations();
    FileDownloader fd = new FileDownloader();

    @Test
    public void save_file_data_test(){
        //basic test to validate the working of save file data in DB
        Assert.assertEquals(true, f1.save_file_data());
    }

    @Test
    public void display_file_data_test(){
        //basic test to validate the working of save file data in DB
        Assert.assertEquals(f1.display_file_data(1), true);
    }

    @Test
    public void file_downloader_test(){
        //basic test to validate file downloading functionality
        Assert.assertEquals(true, fd.file_downloader());
    }
}
