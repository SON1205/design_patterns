package abstractFactory.cloudFactory.aws;

import abstractFactory.cloudFactory.StorageService;

public class AwsStorageService implements StorageService {
    @Override
    public void storeFile(String fileName) {
        System.out.println("Storing file '" + fileName + "' in AWS S3 storage...");
    }
}
