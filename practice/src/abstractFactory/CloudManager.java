package abstractFactory;

import abstractFactory.cloudFactory.CloudServiceFactory;
import abstractFactory.cloudFactory.InstanceService;
import abstractFactory.cloudFactory.StorageService;

public class CloudManager {
    private final InstanceService instanceService;
    private final StorageService storageService;

    public CloudManager(CloudServiceFactory factory) {
        this.instanceService = factory.createInstanceService();
        this.storageService = factory.createStorageService();
    }

    public void setup() {
        instanceService.launchInstance();
        storageService.storeFile("example.txt");
    }
}
