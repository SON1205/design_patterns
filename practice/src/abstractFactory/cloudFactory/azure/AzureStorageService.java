package abstractFactory.cloudFactory.azure;

import abstractFactory.cloudFactory.StorageService;

public class AzureStorageService implements StorageService {
    @Override
    public void storeFile(String fileName) {
        System.out.println("Storing file '" + fileName + "' in Azure Blob storage...");
    }
}
