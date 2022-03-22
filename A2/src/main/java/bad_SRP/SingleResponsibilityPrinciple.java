package bad_SRP;

class File {
    int file_id;

    public void save_data_in_db(int file_id){
        this.file_id = file_id;
        // read the content of file save the data in DB based on the business requirement
        System.out.println("save the file content in DB");
    }

    public void download_file(int file_id){
        this.file_id = file_id;
        //download the file from AWS S3, using the given ID
        System.out.println("Downloading the file from S3..");
    }

    public void display_file_data(int file_id){
        // using the ID, read the file content from S3 and display on console
        this.file_id = file_id;
        System.out.println("Read the file and display the file content..");
        // use the content of file bases on the business requirement
    }
}