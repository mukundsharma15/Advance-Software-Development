package good_SRP;

class FileOperations {
    int file_id;

    public boolean display_file_data(int file_id){
        this.file_id = file_id;
        // using the ID, read the file content from S3 and display on console
        System.out.println("File content of file " + file_id);
        return true;
    }

    public boolean save_file_data(){
        //parse the file and read the content which is required
        // business logic to parse the file
        System.out.println("Parsing the file based on the requirement");
        System.out.println("Saving the content of the file in DB");
        //after successfully writing to DB, return true
        return true;
    }
}

class FileDownloader {
    public boolean file_downloader(){
        // download the file based on the file_id and return true if downloaded.
        System.out.println("File downloaded successfully from S3");
        return true;
    }
}
