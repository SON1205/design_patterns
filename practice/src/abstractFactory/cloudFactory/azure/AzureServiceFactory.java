package abstractFactory.cloudFactory.azure;

import abstractFactory.cloudFactory.CloudServiceFactory;
import abstractFactory.cloudFactory.InstanceService;
import abstractFactory.cloudFactory.StorageService;

public class AzureServiceFactory implements CloudServiceFactory {
    @Override
    public InstanceService createInstanceService() {
        return new AzureInstanceService();
    }

    @Override
    public StorageService createStorageService() {
        return new AzureStorageService();
    }
}
